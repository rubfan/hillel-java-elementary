package ua.od.hillel;

/**
 * Home task for Lesson 2
 * @author Ivan Lupolov
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    /** 1) Find the minimum of the three numbers  */
    public static int minOfThreeNumbers(int num1, int num2, int num3) {
        int min = num1;

        if (min > num2) {
            min = num2;
        } else if (min > num3){
            min = num3;
        }

        return min;
    }
}
