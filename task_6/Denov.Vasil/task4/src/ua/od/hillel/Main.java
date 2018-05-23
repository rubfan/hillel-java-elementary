package ua.od.hillel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] a=new int [20];
	int sum=13;

        for (int i = 0; i <a.length ; i++) {
            a[i]= (int)(Math.random()*15);
        }
Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();

        for (int i = 0; i <a.length ; i++) {

            for (int j = i+1; j <a.length ; j++) {
                if (a[i]+a[j]==sum) System.out.print(a[i]+"+"+ a[j]+ "\t\t");
            }
        }
    }
}
