package ua.od.hillel;

/**
 * Create a program that displays all the non-negative elements of the sequence 90 85 80 75 70 65 60 ....
 */


public class task_3 {
    /**This is main performing method*/
    public static void main(String[] args) {
        System.out.println("Your sequence: ");
        for (int i = 94; i > 0  ; --i) {
            i = i-4;
            System.out.print(i + ", ");
        }
    }
}
