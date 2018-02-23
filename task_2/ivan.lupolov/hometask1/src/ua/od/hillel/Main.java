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

    /** 2) Find the minimum and maximum of the three numbers  */
    public static String minAndMaxNumbers(int num1, int num2, int num3) {
        int min = num1;
        int max = num2;

        if (min > num2) {
            min = num2;
            max = num1;
        } else if (min > num3){
            min = num3;
        } else if(max < num3) {
            max = num3;
        }

        return min + " " + max;
    }
}
