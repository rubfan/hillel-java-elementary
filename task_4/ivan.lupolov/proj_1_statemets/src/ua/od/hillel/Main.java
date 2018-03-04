package ua.od.hillel;

public class Main {

    public static void main(String[] args) {
	    /*int a = 22;
	    int b = 35;
        int result = a;
        a++;
        System.out.println("result: " + result);*/

        float x = 0.1f;
        float res = 0f;

        for (int i = 0; i < 10; i++) {
            res += x;
        }

        System.out.println(res);

    }
}
