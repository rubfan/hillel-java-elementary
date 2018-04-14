package uk.od.hillel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        int array[] = {3, 5, 7, 12, 2, 15, 6, 1, 9};
        int odd = 0;
        int even = 0;
        for (int i: array){
            if( i % 2 == 0){
                even += i;
            }
            else {
                odd += i;
            }
        }
        System.out.println("Сумма четных: " + odd + "  Сумма не чётных: " + even);
    }
}
