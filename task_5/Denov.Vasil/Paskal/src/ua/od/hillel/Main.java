package ua.od.hillel;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int x, y ;
        int [][] arr;
        int start =0;
        Scanner sc =new Scanner(System.in);
        System.out.println("введите высоту триугольника");

        int count ;
        x =sc.nextInt();   //count of line
        y=(x*2)+1;  //count of column
        arr=new int [x] [y];
        int[] Up=new int[x+1];
        for (int i = 0; i < x+1 ; i++) {
            Up[i] =i;
        }

        for (int i = x-1; i >=0; i--) {
            count=0;
            for (int j = start; j < y; j+=2) {    // +=2 zero


                arr[i][j]= combination(Up, i, count);
                ++count;

            }
            // y=y-2; // сужение
            start++;
        }

        for (int i = 0; i <x ; i++) {
            for (int j = 0; j <y ; j++) {
                if(arr[i][j]==0) System.out.print(" ");
                else System.out.print( +arr[i][j]);

            }
            System.out.println();

        }




    }


    static int factorial(int num) {
        int fact = 1;
        if (num == 0) return 1;
        for (int i = 1; i <= num; i++) fact *= i;

        return fact;
    }


    static int combination(int[] up, int down, int count){
        int  combination=0 ;

        // if (up[0]==0)return 1;// для едениц по левой стороне
        //! if (down==up[down]) return 1;  // для едениц по правой стороне
        if (up[count]==0)return 1;// для едениц по левой стороне
        if (down==up[count]) return 1;  // для едениц по правой стороне
        if (up[count]>down)return 0;

        combination=factorial(down)/(factorial(up[count])*factorial(down-up[count]));


        return combination;


    }
}
