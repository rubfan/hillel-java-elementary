package ua.od.hillel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("---Task1---");
        System.out.println(" ");

        InsertSort I = new InsertSort();
        int[] numbers ={3, 7, 1, 8, 4, 5, 6, 9, 10};
        int[] sorted = I.sort(numbers);
        System.out.println(Arrays.toString(sorted));

        System.out.println(" ");
        System.out.println("---Task2---");
        System.out.println(" ");

        Merge M = new Merge();
        int [] ar1 = {1, 3, 5};
        int [] ar2 = {2, 4, 8, 9, 12};
        int [] merged = M.merge(ar1, ar2);
        System.out.println(Arrays.toString(merged));

        System.out.println(" ");
        System.out.println("---Task3---");
        System.out.println(" ");

        Algorithm a = new Algorithm();
        a.main();
        System.out.println("k = (n*(n-1)(n-2))/6");

        System.out.println(" ");
        System.out.println("---Task4---");
        System.out.println("complexity O(n*log n)");
        System.out.println(" ");

        TestSumOfTwoNumb n = new TestSumOfTwoNumb();
        int[] ar = {1, 5, 7, 9, 12};
        boolean found = n.findSumOperands(ar, 12);
        System.out.println(found ? "found" : "missing");
        System.out.println();



    }
}
