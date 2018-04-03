package ua.od.hillel;

import java.util.Scanner;

public class TrianglePascalEndSpiral {

    public static void main(String[] args) {
        trianglePascal();
        spiral();
    }

    public static void trianglePascal(){
        int lines = 0;
        System.out.println("Enter number of lines for Pascal Triangle:");
        Scanner reader = new Scanner(System.in);
        lines = reader.nextInt();
        long [][] triangle = new long [lines][];
        triangle[0] = new long [1];
        System.out.println(triangle[0][0] = 1);
        for (int i = 1; i < lines; i++)
        {
            triangle[i] = new long [i+1];
            System.out.print((triangle[i][0] = 1) + " ");
            for (int j = 1; j < i; j++)
            {
                System.out.print((triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j]) + " ");
            }
            System.out.println(triangle[i][i]=1);
        }
    }

    public static void spiral(){
        int size = 0;
        System.out.println("Enter size of matrix:");
        Scanner reader = new Scanner(System.in);
        size = reader.nextInt();
        int max = size * size;
        //объявление матрицы
        int[][] matrix = new int[size][size];
        //выставление границ матрици, если (x = 0:y = 0) начало
        int left = 1, top = 1, right = size - 1, bottom = size - 1;
        //текущие координаты
        int x = 0, y = 0;
        //будет показывать направление движения
        Position pos = Position.RIGHT;
        //объявляем начало
        matrix[0][0] = 1;
        //заполнение матрицы
        for (int i = 2; i <= max; i++) {
            switch (pos) {
                case RIGHT:
                    if(x < right) x++;
                    else {
                        pos = Position.BOTTOM;
                        right--;
                        y++;
                    }
                    break;
                case BOTTOM:
                    if(y < bottom) y++;
                    else {
                        pos = Position.LEFT;
                        bottom--;
                        x--;
                    }
                    break;
                case LEFT:
                    if(x >= left) x--;
                    else {
                        pos = Position.TOP;
                        left++;
                        y--;
                    }
                    break;
                case TOP:
                    if(y > top) y--;
                    else {
                        pos = Position.RIGHT;
                        top++;
                        x++;
                    }
                    break;
            }
            matrix[y][x] = i;
        }
        //вывод матрицы на экран
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) System.out.format("%4d", matrix[i][j]);
            System.out.println();
        }
    }
    enum Position{
        RIGHT,
        BOTTOM,
        LEFT,
        TOP
    }
}
