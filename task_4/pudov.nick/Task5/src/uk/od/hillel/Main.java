package uk.od.hillel;

import java.util.Scanner;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int array[] = {3, 5, 7, 12};
        int sum;
        System.out.println("Введите кол-во элементов которые требуется посчитать:");
        int i = in.nextInt();
        sum = Arrays.stream(array).limit(i).sum();
        System.out.println("Сумма первых " + i + " Эллементов массива равна: " + sum);
    }
}
