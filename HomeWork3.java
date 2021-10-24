package com.company;

import java.util.Random;
        import java.util.Scanner;

public class Main {

    //задаем победную серию (4 фишки в ряду = победа)
    static final int WinStrike = 4;

    // 3. Определяем размеры массива
    static final int SIZE_X = 5;
    static final int SIZE_Y = 5;

    // 1. Создаем двумерный массив
    static char[][] field = new char[SIZE_Y][SIZE_X];

    // 2. Обозначаем кто будет ходить какими фишками
    static final char PLAYER_DOT = 'X';
    static final char AI_DOT = '0';
    static final char EMPTY_DOT = '.';

    // 8. Создаем сканер
    static Scanner scanner = new Scanner(System.in);
    // 12. Создаем рандом
    static final Random rand = new Random();

    // 4. Заполняем на массив
    private static void initField() {
        for(int i = 0; i < SIZE_Y; i++) {
            for(int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    // 5. Выводим на массив на печать
    private static void printField() {
        //6. украшаем картинку
        System.out.println("-------");
        for(int i = 0; i < SIZE_Y; i++) {
            System.out.print("|");
            for(int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        //6. украшаем картинку
        System.out.println("-------");
    }

    // 7. Метод который устанавливает символ
    private static void setSym(int y, int x, char sym){
        field[y][x] = sym;
    }

    // 9. Ход игрока
    private static void playerStep() {
        // 11. с проверкой
        int x;
        int y;
        do {
            System.out.println("Введите координаты: X Y (1-3)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y,x));
        setSym(y, x, PLAYER_DOT);

    }

    // 13. Ход ПК
    private static void aiStep() {
        int x;
        int y;
        do{
            x = rand.nextInt(SIZE_X);
            y = rand.nextInt(SIZE_Y);
        } while(!isCellValid(y,x));
        setSym(y, x, AI_DOT);
    }

    // 14. Проверка победы
    private static boolean checkWin(char sym) {
        int flag1 = 0, flag2 = 0, flag3 = 0, flag4 = 0;
        for(int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;

                for(int k = 0; k < WinStrike; k++){
                    // проверяем победную серию справа
                    if (j+k < SIZE_X){
                        if (field[i][j+k] == sym) {
                            flag1++;
                        }
                    }
                    // проверяем победную серию снизу
                    if (i+k < SIZE_Y){
                        if (field[i+k][j] == sym) {
                            flag2++;
                        }
                    }
                    // проверяем победную серию по правой диагонали вниз
                    if (j+k < SIZE_X && i+k < SIZE_Y){
                        if (field[i+k][j+k] == sym) {
                            flag3++;
                        }
                    }
                    // проверяем победную серию по левой диагонали вниз
                    if (j-k >= 0 && i+k < SIZE_Y){
                        if (field[i+k][j-k] == sym) {
                            flag4++;
                        }
                    }
                    if (flag1 == WinStrike || flag2 == WinStrike || flag3 == WinStrike || flag4 == WinStrike){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    // 16. Проверка полное ли поле? возможно ли ходить?
    private static boolean isFieldFull() {
        for (int i = 0; i < SIZE_Y; i++) {
            for(int j = 0; j < SIZE_X; j++) {
                if(field[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    // 10. Проверяем возможен ли ход
    private static boolean isCellValid(int y, int x) {
        // если вываливаемся за пределы возвращаем false
        if(x < 0 || y < 0 || x > SIZE_X -1 || y > SIZE_Y - 1) {
            return false;
        }
        // если не путое поле тоже false
        return (field[y][x] == EMPTY_DOT);
    }

    public static void main(String[] args) {
        // 1 - 1 иницируем и выводим на печать
        initField();
        printField();
        // 1 - 1 иницируем и выводим на печать

        // 15 Основной ход программы

        while (true) {
            playerStep();
            printField();
            if(checkWin(PLAYER_DOT)) {
                System.out.println("Player WIN!");
                break;
            }
            if(isFieldFull()) {
                System.out.println("DRAW");
                break;
            }

            aiStep();
            printField();
            if(checkWin(AI_DOT)) {
                System.out.println("Win SkyNet!");
                break;
            }
            if(isFieldFull()) {
                System.out.println("DRAW!");
                break;
            }
        }

    }
}
