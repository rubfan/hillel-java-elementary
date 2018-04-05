package ua.od.hillel.oop.recursion;

/**
 * Created by ruslangramatic on 4/4/18.
 */
public class RecursionSamples {
    public static void main(String[] args) {

        System.out.println(factorial(5));

        new For(0,10) {
            void runBody(int i) {
                System.out.print(i);
            }
        };
    }

    public static long factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}
