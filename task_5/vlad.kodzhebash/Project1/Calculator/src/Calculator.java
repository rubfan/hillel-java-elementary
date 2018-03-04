package edu.kodzhebash.hillelLessons.Hillel2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double x=0;
        double y = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операцию ");
        System.out.println("1.Сложение 2.Вычитание 3.Умножение 4.Деление 5.Остаток от деления 6.Нахождение модуля числа");
        System.out.println("------->");
        int res = 0;
        boolean condition = true;
        while (condition) {
            String s = scanner.nextLine();
            if (s.equals("1")) {
                res = 1;
                condition = false;
            } else if (s.equals("2")) {
                res = 2;
                condition = false;
            } else if (s.equals("3")) {
                res = 3;
                condition = false;
            } else if (s.equals("4")) {
                res = 4;
                condition = false;
            } else if (s.equals("5")) {
                res = 5;
                condition = false;
            } else if (s.equals("6")) {
                res = 6;
                condition = false;
            } else {
                condition = true;
                System.out.println("Выберите операцию");
                System.out.println("1.Сложение 2.Вычитание 3.Умножение 4.Деление 5.Остаток от деления 6.Нахождение модуля числа");
                System.out.print("------->");
            }
        }
        if (res < 6 && res > 0) {
            System.out.print("Введите первое число --->");
            x = scanner.nextDouble();
            System.out.print("Введите второе число --->");
            y = scanner.nextDouble();
        } else if (res == 6){
            System.out.print("Введите число --->");
            x = scanner.nextDouble();
        } else {
            System.out.println("Выбранна неправильная операция");
        }
        switch (res) {
            case 1:
                System.out.println("Результат сложения- " + addition(x, y));
                break;
            case 2:
                System.out.println("Результат вычитания- " + subtraction(x, y));
                break;
            case 3:
                System.out.println("Результат умножения- " + multiplication(x, y));
                break;
            case 4:
                System.out.println("Результат деления- " + division(x, y));
                break;
            case 5:
                System.out.println("Остаток от деления- " + remainderOfTheDivision(x, y));
                break;
            case 6:
                System.out.println("Модуль числа- " + absoluteNumber(x));
                break;
        }
}

    public static double addition(double x,double y){
        return x + y;
    }
    public static double subtraction(double x, double y) {
        return x - y;
    }

    public static double multiplication(double x, double y) {
        return x * y;
    }

    public static double division(double x, double y) {
        return x / y;
    }

    public static double remainderOfTheDivision(double x, double y) {
        return x % y;
    }

    public static double absoluteNumber(double x) {
        return Math.abs(x);
    }
}
