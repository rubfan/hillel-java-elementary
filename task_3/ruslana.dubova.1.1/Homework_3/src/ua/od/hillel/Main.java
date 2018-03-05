package ua.od.hillel;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        if (args.length == 0) {

            Calculator calc = new Calculator();

            Scanner scr = new Scanner(System.in);

            System.out.println("Specify opreation: ");
            String operation = scr.nextLine();

            System.out.println("Specify first operand: ");
            int firstOperand = scr.nextInt();

            System.out.println("Specify second operand: ");
            int secondOperand = scr.nextInt();

            System.out.println("Result: " + calc.compute(operation, firstOperand, secondOperand));

        }

    }
}
