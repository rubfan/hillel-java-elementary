package edu.kodzhebash.hillelLessons.Hillel2;

public class ReallyFirst {

    /**
     * main
     */

    public static void main (String[] args){
        Min(5,7,2);
        MinAndMax(9,2,8);
        System.out.println("Task 4" +" - "+ ChetNeChet(5));
        System.out.println("Task 5" + " - " + CheckingRemainderOfTheDivision(7,2));

    }
    /**
     * Task 1
     * looking for min from numbers
     */
    public static void Min (int a,int b,int c) {
        int min;
        if (a < b && a < c){
            min = a;
        }else if (b < a && b < c) {
            min = b;
        }else min = b;
        System.out.println("Task 1" +" - "+ "Numbers:" + a+" , "+b+" , "+c + " , " + "Min--->" + min);

    }

    /**
     *Task 2
     * looking for min and max from 3 numbers
     */
    public static void MinAndMax (int a,int b,int c) {
        int min;
        int max;
        if (a < b && a <c) {
            min = a;
            max = Math.max(b,c);
        }else if (b< a && b < c){
            min = b;
            max = Math.max(a,c);
        }else  {
            min = c;
            max = Math.max(a,b);
        }
        System.out.println("Task 2"+" - "+"Min--->" + min + "Max--->" + max);
    }
    /**
     *Task 4
     * check if the number is even
     */
    public static boolean ChetNeChet (int a){
        if (a % 2 == 0){
            return true;
        }else
            return false;
    }
    /**
     *Task 5
     * check if 2 numbers сan divide without  Remainder
     */
    public static boolean CheckingRemainderOfTheDivision ( int a, int b){
        if (a % b == 0){
            return true;
        }else
            return false;

    }
}
