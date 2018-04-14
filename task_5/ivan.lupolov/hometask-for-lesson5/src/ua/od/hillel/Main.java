package ua.od.hillel;

public class Main {

    public static void main(String[] args) {
        //printPascalTriangle(14);
        //fillMatrixSpiral(2,2);
    }

    public static long factorial(int n) {
        long mult = 1;
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void printPascalTriangle(int num) {
        for (int n = 0; n < num; n++) {
            System.out.print("n: "+ n +" => "+ "\t");
            for (int k = 0; k <= n; k++) {
                long coef = factorial(n)/(factorial(k)*factorial(n-k));
                long elem = coef * (long) Math.pow(1,k)*(long) Math.pow(1,n-k);
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void fillMatrixSpiral(int row, int col) {
        int[][] matrix = new int[row][col];

        int count = 1;
        int top = 0;
        int bottom = row-1;
        int left = 0;
        int right = col-1;

        while (count != row*col+1) {

            //right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = count++;
            }
            top++;

            //down
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = count++;
            }
            right--;

            //left
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = count++;
            }
            bottom--;

            //top
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = count++;
            }
            left++;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("\t"+matrix[i][j]);
            }
            System.out.println();
        }
    }
}
