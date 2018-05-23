package ua.od.hillel.HW10;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int n = 25;
        System.out.println("Getting n-th Fibonacci number (n = " + n + "):");
        System.out.println("Using simple loop: " + f.fibo(n));
        System.out.println("Using recursion: " + f.fiboRecurse(n));

    }

    public long fibo(int n) {

//        long[] arrFibo = new long[n];
//        for (int i = 0; i < n; i++) {
//            if (i == 0 || i == 1) {
//                arrFibo[i] = 1;
//            }
//            else {
//                arrFibo[i] = arrFibo[i-1] + arrFibo[i-2];
//            }
//        }
//        return arrFibo[n-1];

        long a = 1, b = 1, result = 0;
        for (int i = 3; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    public long fiboRecurse(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return fiboRecurse(n-1) + fiboRecurse(n-2) ;
        }
    }
}
