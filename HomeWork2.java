package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1:");
        int arr1[] = new int[] {0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr1.length; i++){ //вывод исходного массива
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] == 0)
                arr1[i] = 1;
            else
                arr1[i] = 0;
            System.out.print(arr1[i] + " ");
        }

        //Задание 2
        System.out.println("\n\nЗадание 2:");
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.print("Введите n:");
        n = in.nextInt();
        int arr2[] = new int[n];
        arr2[0] = 0;
        System.out.print(arr2[0] + " ");
        for (int i = 1; i < n; i++){
            arr2[i] += arr2[i-1] + 3;
            System.out.print(arr2[i] + " ");
        }

        //Задание 3
        System.out.println("\n\nЗадание 3:");
        System.out.print("Введите n:");
        n = in.nextInt();
        int arr3[] = new int[n];
        System.out.println("Введите значения массива:");
        for (int i = 0; i < n; i++){
            arr3[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++){
            if (arr3[i] < 6)
                arr3[i] *= 2;
            System.out.print(arr3[i] + " ");
        }

        //Задание 4
        System.out.println("\n\nЗадание 4:");
        System.out.print("Введите n:");
        n = in.nextInt();
        int arr4[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if ((i == j) || (i == n - j - 1))
                    arr4[i][j] = 1;
                else
                    arr4[i][j] = 0;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        //Задание 5
        System.out.println("\nЗадание 5:");
        System.out.print("Введите n:");
        n = in.nextInt();
        int arr5[] = new int[n];
        System.out.println("Введите значения массива:");
        for (int i = 0; i < n; i++){
            arr5[i] = in.nextInt();
        }
        int min = arr5[0];
        int max = arr5[0];
        for (int i = 1; i < n; i++){
            if (min > arr5[i])
                min = arr5[i];
            if (max < arr5[i])
                max = arr5[i];
        }
        System.out.println("Минимальный элемент = " + min + "; максимальный элемент = " + max);

        //Задание 6
        System.out.println("\nЗадание 6:");
        System.out.print("Введите n:");
        n = in.nextInt();
        int arr6[] = new int[n];
        System.out.println("Введите значения массива:");
        for (int i = 0; i < n; i++){
            arr6[i] = in.nextInt();
        }
        System.out.println(Task6(arr6));
    }

    static boolean Task6(int[] arr){
        //создаем две переменные и равномерно их заполняем
        int i = 0, j = arr.length - 1, l = 0, r = 0;
        while (i <= j){
            if (l <= r){
                l += arr[i];
                i++;
            }
            else{
                r += arr[j];
                j--;
            }
        }

        if (l == r)
            return true;
        return false;
    }
}
