package com.company;

public class Main {

    public static void main(String[] args) {
        byte typeByte = 127; //-128
        System.out.println("Max byte = " + typeByte);
        short typeShort = 32767; //-32768
        System.out.println("Max short = " + typeShort);
        int typeInt = 2147483647; // -2147483648
        System.out.println("Max int = " + typeInt);
        long typeLong = 9223372036854775807L; //-9223372036854775808
        System.out.println("Max long = " + typeLong);
        float typeFloat = 31.4f; //f - тк иначе считает как double
        System.out.println("float: " + typeFloat);
        double typeDouble = 3.141;
        System.out.println("double: " + typeDouble);
        char typeChar = 'ы', ch = 102; // 102 - символ 'f'
        System.out.println("char: = " + typeChar + " " + ch);
        boolean typeBoolean = true; //false
        System.out.println("boolean: " + typeBoolean);


        String typeString = "Hello \nworld";
        System.out.println("Task1: " + Task1(2, 3, 6, 2));
        System.out.println("Task2: " + Task2(5, 7));
        System.out.print("Task3: ");
        Task3(5);
        System.out.println("Task4: " + Task4(-7));
        System.out.print("Task5: ");
        Task5("Евгений");
        System.out.print("Task6: ");
        Task6(2021);
    }

    static double Task1(int a, int b, int c, int d){
        return a * (b + c / d);
    }

    static boolean Task2(int number1, int number2){
        if ((number1 + number2 <= 20) && (number1 + number2 >= 10))
            return true;
        return false;
    }

    static void Task3(int number){
        if (number > 0)
            System.out.println("Положительное");
        else
            System.out.println("Отрицательное");
    }

    static boolean Task4(int number){
        if (number >= 0)
            return false;
        return true;
    }

    static void Task5(String name){
        System.out.println("Привет, " + name + "!");
    }

    static void Task6(int year){
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) //(делится на 4) и (Не делится на 100) или (делится на 400)
        {
            System.out.println("Високосный");
        }
        else{
            System.out.println("Не високосный");
        }
    }
}
