package ua.od.hillel;

public class Main {

    public static void main(String[] args) {
        int n = 6;
        int[][] matrix = new int[n][n];

        int row = 0;
        int col = 0;
        int dx = 1;
        int dy = 0;
        int dirChanges = 0;
        int visits = n;

        for (int i = 0; i < n * n; i++) {
            System.out.println("visit"+visits);
            matrix[row][col] = i + 1;
            if (--visits == 0) {                //visit  это кол заполниных ячейк в каждуюю сторону
                visits = n * (dirChanges % 2) +
                        n * ((dirChanges + 1) % 2) -
                        (dirChanges / 2 - 1) - 2;
                int temp = dx;
                dx = -dy;
                dy = temp;
                dirChanges++;

            }
            col += dx;  //столбы?
            row += dy;  // строки ?
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();


        }
    }
}
