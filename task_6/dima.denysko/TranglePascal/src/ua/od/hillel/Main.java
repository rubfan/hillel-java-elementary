package ua.od.hillel;

public class Main {

    public static void main(String[] args) {
        int[][] arr = treanglePaskal(9, 19);
        printArr(arr);
    }

    public static int[][] treanglePaskal(int line, int column) {
        int[][] arr = new int[line][column];
        arr[0][column / 2] = 1;
//        arr = left(arr);
//        arr = right(arr);
//        arr = leftAndRight(arr);
//        arr = center(arr);
        arr = leftRightCenter(arr);
        return arr;
    }

    private static int[][] leftRightCenter(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                if (j < arr[i].length / 2 && arr[i - 1][j + 1] == 1) {
                    arr[i][j] = 1;
                    if (i > 1 && i < arr.length - 1) arr[i + 1][j + 1] = arr[i][j] + arr[i][j + 2];
                }
                if (j > arr[i].length / 2 && arr[i - 1][j - 1] == 1) {
                    arr[i][j] = 1;
                    if (i > 0 && i < arr.length - 1) arr[i + 1][j - 1] = arr[i][j] + arr[i][j - 2];
                }
                if (i > 3 && j < arr[i].length - 1 && j > 0 && arr[i - 1][j - 1] != 0 && arr[i - 1][j + 1] != 0 )
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j + 1];
            }
        }
        return arr;
    }

    private static int[][] leftAndRight(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                if (j < arr[i].length / 2 && arr[i - 1][j + 1] == 1) {
                    arr[i][j] = 1;
                    if (i > 1 && i < arr.length) {
                        arr[i][j + 2] = i;

                    }
                }
                if (j > arr[i].length / 2 && arr[i - 1][j - 1] == 1) {
                    arr[i][j] = 1;
                    if (i > 3 && i < arr.length) {
                        arr[i][j - 2] = i;

                    }
                }
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

    public static int[][] left(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length / 2; j++) {
                if (arr[i - 1][j + 1] == 1) {
                    arr[i][j] = 1;
                    if (i > 1) arr[i][j + 2] = i;
                }
            }
        }
        return arr;
    }

    public static int[][] right(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = arr[i].length / 2 + 1; j < arr[i].length; j++) {
                if (arr[i - 1][j - 1] == 1) {
                    arr[i][j] = 1;
                    if (i > 1) arr[i][j - 2] = i;
                }
            }
        }
        return arr;
    }

    public static int[][] center(int[][] arr) {
        for (int i = 2; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 1) arr[i + 1][j + 1] = arr[i][j] + arr[i][j + 2];
            }
        }
        return arr;
    }
}
