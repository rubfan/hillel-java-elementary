package edu.kodzhebash.hillelLessons.Hillel2;


public class New {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        String s = args[0];
        int res = 0;
        if (s.equals("addition")) {
            res = 1;
        } else if (s.equals("subtraction")) {
            res = 2;
        } else if (s.equals("multiplication")) {
            res = 3;
        } else if (s.equals("division")) {
            res = 4;
        } else if (s.equals("remainder")) {
            res = 5;
        } else if (s.equals("absolute number")) {
            res = 6;
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

    public static double addition(double x, double y) {
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
