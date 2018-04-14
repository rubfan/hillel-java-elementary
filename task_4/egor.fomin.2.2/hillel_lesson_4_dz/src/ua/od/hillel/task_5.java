package ua.od.hillel;

import java.util.Scanner;

/**
 * Find the sum of the first n elements of the array.
 */
public class task_5 {
    static Scanner scanner = new Scanner(System.in);

/**This is main performing method*/
    public static void main(String[] args) {
        int n = getNum();
        int result = sumOfElem(n);
        System.out.println("Sum of first " + n + "elements of the array: " + result);

    }
/**Get number from user*/
    public static int getNum(){
        System.out.println("Please enter number of first elements of the array that you wanna count: ");
        int n = scanner.nextInt();
        return n;
    }
/**Calculate sum of first n elements of the array*/
    public static int sumOfElem(int n){
        int[] array = new int [10];
        int a = (int) ( Math.random() * 3 );
            for(int i = 0; i < array.length; i++){
                array[i] = a;
            }
            int sum = 0;
            for(int i = 0; i <= n; i++) {
                int sum =+ array[i]; //
            }
            return sum;
    }


}
