package ua.od.hillel;
import java.util.Scanner;
/**
 * Convert number to binary number system.
 */
public class task_9 {
    static Scanner scanner = new Scanner(System.in);

    /**This is main performing method*/
    public static void main(String[] args) {
        System.out.println("Please, enter you number on dec number system: ");
        int dec = getNumbers();
        binar(dec);

    }

    /**This method get your number*/
    public static int getNumbers() {
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("You enter incorrect number. Please enter again: ");
            scanner.next(); // recursion
            num = getNumbers();
        }
        return num;
    }

    /**This method convert your number to binary number system*/
    public static void binar(int num){ // прикольное решение
        int b;
        String temp = "";
        while(num !=0){
            b = num%2;
            temp = b + temp;
            num = num/2;
        }  System.out.println("Your number in binary system: " + temp);
    }
}
