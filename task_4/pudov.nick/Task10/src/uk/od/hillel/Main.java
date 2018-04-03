package uk.od.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        StringBuilder sb = new StringBuilder();

        int x = 1;
        for(int i = 0; i < 32; i ++) {
            sb.append((d & x) == 0 ? "0" : "1");
            x <<= 1;
        }

        System.out.println("Результат: " + sb.reverse());
    }
}
