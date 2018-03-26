package ua.od.hillel;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            int rows = enterRows();
            int[][] arr = spiral(rows);
            printArr(arr);
        }

        private static int enterRows() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Rows>>>");
            return sc.nextInt();
        }

        public static int[][] spiral(int rows) {
            int count = 0;
            int stroka = 0;
            int stolb = 0;
            boolean left = true;
            boolean down = false;
            boolean right = false;
            boolean up = false;
            int[][] arr = new int[rows][rows];
            while (count < rows * rows ) {
                if (left && stolb < rows - 1 && arr[stroka][stolb + 1] == 0) {
                    arr[stroka][stolb] = ++count;
                    stolb++;
                    if(count == rows*rows - 1) arr[stroka][stolb] = ++count;
                } else {
                    left = false;
                    down = true;
                }

                if (down && stroka < rows - 1 && arr[stroka + 1][stolb] == 0) {
                    arr[stroka][stolb] = ++count;
                    stroka++;
                    if(count == rows*rows - 1) arr[stroka][stolb] = ++count;
                } else {
                    down = false;
                    right = true;
                }

                if (right && stolb > 0 && arr[stroka][stolb - 1] == 0) {
                    arr[stroka][stolb] = ++count;
                    stolb--;
                    if(count == rows*rows - 1) arr[stroka][stolb] = ++count;
                } else {
                    right = false;
                    up = true;
                }

                if (up && stroka > 0 && arr[stroka - 1][stolb] == 0) {
                    arr[stroka][stolb] = ++count;
                    stroka--;
                    if(count == rows*rows - 1) arr[stroka][stolb] = ++count;
                } else {
                    up = false;
                    left = true;
                }

            }
            return arr;
        }

        public static void printArr(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
}
