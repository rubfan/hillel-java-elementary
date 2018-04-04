package ua.od.hillel;

/**
 * Create a program that displays the first 20 elements of the sequence 2 4 8 16 32 64 128 ....
 */
public class task_4 {
    public static void main(String[] args) {
        System.out.println("Your sequence: ");
        int i = 1;
        int n = 2;
        System.out.print(2 + ", ");
        while (i < 20) {
            n = n + n;
            System.out.print( n + ", ");
            i++;
        }
    }
}