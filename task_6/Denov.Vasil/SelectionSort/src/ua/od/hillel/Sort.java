package ua.od.hillel;

import java.util.Random;
import java.util.Scanner;

public class Sort {
    private int[] a;


   Random rn = new Random();

    public Sort(int max)

    {
        a = new int[max];



    }
    //--------------------------------------------------------------
    public void insert()

    {
        for (int i = 0; i <a.length ; i++)

            a[i]=rn.nextInt(100);

    }
    //--------------------------------------------------------------
    public void display()

    {
        for(int j=0; j<a.length; j++)

            System.out.print(a[j] + " "); // Вывод
        System.out.println("");
    }

    public void selectionSort()
    {
        int out, in, min;
        for(out=0; out<a.length-1; out++)
        {
            min = out;

            for(in=out+1; in<a.length; in++) {
                if (a[in] < a[min])

                    min = in;

                swap(out, min);
            }
        }
    }
    //--------------------------------------------------------------
    private void swap(int one, int two)
    {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
