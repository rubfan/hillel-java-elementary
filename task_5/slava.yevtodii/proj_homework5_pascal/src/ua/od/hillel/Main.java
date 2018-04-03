package ua.od.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        pascalTriangle();
        spiralArray();
    }

    public static void pascalTriangle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows of triangle:");
        int rowsNumber = scan.nextInt();
        int[][] pascalArray = new int[rowsNumber][];

        for (int i = 0; i < rowsNumber ; i++) {
            pascalArray[i] = new int[i+1];
            System.out.print((i+1)+") ");
            int temp = rowsNumber-i-1;
            while (temp > 0) {
                System.out.print(" ");
                temp--;
            }
            for (int j = 0; j < pascalArray[i].length; j++) {
                if (i==0||i==1||j==0||j==i){
                    pascalArray[i][j] = 1;
                }
                else {
                    pascalArray[i][j] = pascalArray[i-1][j] + pascalArray[i-1][j-1];
                }
                if (j != i) {
                    System.out.print(pascalArray[i][j]+" ");
                }
                else System.out.print(pascalArray[i][j]);
            }
            System.out.println();
        }
    }

    public static void spiralArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = scan.nextInt();
        int[][] spiral = new int[size][size];
        int rows = 0, columns = 0, step = 0, count = 1;

        if (size%2 == 0) {
            while (count <= size*size) {

                int tempi = rows;
                int tempj = columns;

                while ((count <= size*size) && (tempj < size-1-step)) {
                    spiral[tempi][tempj] = count++;
                   // System.out.println(tempi+" "+tempj);
                    tempj++;
                }

                while ((count <= size*size) && (tempi < size-1-step)) {
                    spiral[tempi][tempj] = count++;
                   // System.out.println(tempi+" "+tempj);
                    tempi++;
                }

                while ((count <= size*size) && tempj > step) {
                    spiral[tempi][tempj] = count++;
                   // System.out.println(tempi+" "+tempj);
                    tempj--;
                }

                while ((count <= size*size) && tempi > step) {
                    spiral[tempi][tempj] = count++;
                   // System.out.println(tempi+" "+tempj);
                    tempi--;
                }

                rows++;
                columns++;
                step++;
            }
        }

        else {
            spiral[size/2][size/2]=size*size;
            while (count < size*size) {

                int tempi = rows;
                int tempj = columns;

                while ((count < size*size) && (tempj < size-1-step)) {
                    spiral[tempi][tempj] = count++;
                   // System.out.println(tempi+" "+tempj);
                    tempj++;
                }

                while ((count < size*size) && (tempi < size-1-step)) {
                    spiral[tempi][tempj] = count++;
                   // System.out.println(tempi+" "+tempj);
                    tempi++;
                }

                while ((count < size*size) && tempj > step) {
                    spiral[tempi][tempj] = count++;
                   // System.out.println(tempi+" "+tempj);
                    tempj--;
                }

                while ((count < size*size) && tempi > step) {
                    spiral[tempi][tempj] = count++;
                   // System.out.println(tempi+" "+tempj);
                    tempi--;
                }

                rows++;
                columns++;
                step++;
            }
        }

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(spiral[i][j]+" ");
            }
            System.out.println();
        }
    }
}
