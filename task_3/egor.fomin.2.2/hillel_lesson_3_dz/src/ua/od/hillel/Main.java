package ua.od.hillel;

/**This is calculating program*/
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Main performing method
     */
    public static void main(String[] args) {
        System.out.println(" <CALCULATOR> ");
        int num1 = incomingNumbers();
        int num2 = incomingNumbers();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Result: " + result);
    }

    /**
     * This method get numbers and check them for integrety
     */
    public static int incomingNumbers() {
        System.out.println("Please, enter your number: ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("You enter incorrect number. Please enter again: ");
            scanner.next(); // recursion
            num = incomingNumbers();
        }
        return num;
    }

    /**
     * This method get operation and check it for correctness
     */
    public static char getOperation() {
        System.out.println("Please, enter your operation: ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("You make mistake. Please reenter your operation. ");
            scanner.next();//recursion
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '~':
                result = Math.abs(num1);
                break;
            default:
                System.out.println("Operation is incorrect. Please reenter.");
                result = calc(num1, num2, getOperation());//recursion
        }
        return result;
    }
}




