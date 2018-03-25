package ua.od.hillel;

import java.util.Scanner;

public class Main {
    /*
Найти сумму первых n элементов массива
Найти минимальный и максимальный элемент массива
Найти сумму всех четных и сумму всех нечетных элементов массива
 */

    public static void main(String[] args) {

        int n;
        int sum = 0, evenSum=0, oddSum=0;
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов, сумму которых хотете узнать, не больше 10");
        n = sc.nextInt();//n-1
        while (n > 10) {
            System.out.println("Введите количество элементов, сумму которых хотете узнать, не больше 10");
            n = sc.nextInt();//n-1
        }

        arr = fillArray(arr);

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(arr[i]%2==0)evenSum+=arr[i];
            else oddSum+=arr[i];

        }
        System.out.println("сумма " + n + " перых элементов=" + sum);
        System.out.println("Минимальный элемент массива= " +min(arr) );
        System.out.println("Максимальный элемент массива= " +max(arr) );
        System.out.println("Сумма четных элементов= " +evenSum);
        System.out.println("Сумма нечетных элементов= " +oddSum);



    }

    static int[] fillArray(int[] array) {
        System.out.println("исходный массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println("array[" + i + "]" + " " + array[i]);
        }
        return array;
    }

    static int min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }
    static int max(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;

    }
}
