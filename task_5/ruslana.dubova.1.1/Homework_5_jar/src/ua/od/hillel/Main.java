package ua.od.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = numb.nextInt();
        System.out.println("Enter number: ");
        int b = numb.nextInt();
        int c = a+b;
        System.out.println("Sum of numbers: "+c);
    }
}
