package ua.od.hillel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr=new int [50412];
        int j=0;

        for (int i = 100000; i <= 999999; i++) {
            if(partionNumber(i)!=0){
                arr[j]=partionNumber(i);
                j++;

            }
        }
        System.out.println(Arrays.toString(arr));


    }


    static int partionNumber(int num) {
        int i , j;
        int []array = new int [6];

        for (i = 6, j = 0; i > 0; --i, j++) {

            if (i == 6) {
                array[j] = num / (int) Math.pow(10, (i - 1));
            } else {
                array[j] = num / (int) Math.pow(10, (i - 1)) % 10;
            }

        }
        if (array[0]+array[1]+array[2]==array[3]+array[4]+array[5]) {
            return num;
        }
        else  return 0;
    }
}
