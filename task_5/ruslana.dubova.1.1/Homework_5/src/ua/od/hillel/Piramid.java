package ua.od.hillel;

public class Piramid {

    public void print() {

        int[][] arr = new int[7][11];
        //fill array with zero
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
            }
        }
        //put one in the middle of the first line
        arr[0][5] = 1;
        //fill the piramid
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j - 1 >= 0)
                    arr[i][j] += arr[i - 1][j - 1];

                if (j + 1 < arr[i].length)
                    arr[i][j] += arr[i - 1][j + 1];
            }
        }
        //lets print our arrays
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" \t" + arr[i][j]);
            }
            System.out.println(" ");
        }

    }


}
