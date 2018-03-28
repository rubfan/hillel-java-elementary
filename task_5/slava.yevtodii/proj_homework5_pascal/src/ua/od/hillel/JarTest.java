package ua.od.hillel;

public class JarTest {
    public static void main(String[] args) {
        double firstNumber = Double.parseDouble(args[0]);
        double secondNumber = Double.parseDouble(args[1]);
        double sum = firstNumber + secondNumber;
        System.out.println("Sum of args: "+firstNumber+" + "+secondNumber+" = "+sum);
    }
}
