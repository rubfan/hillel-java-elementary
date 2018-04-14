package ua.od.hillel;

public class Main {

    public static void main(String[] args) {
        System.out.println(toBin(5));
    }


    static String toBin(int i) {
        StringBuilder sb = new StringBuilder();
        while (i > 0) {
            sb.insert(0, i & 1);
            i >>= 1;

        }
        if (sb.length() == 0) sb.append("0");
        return sb.toString();
    }

}