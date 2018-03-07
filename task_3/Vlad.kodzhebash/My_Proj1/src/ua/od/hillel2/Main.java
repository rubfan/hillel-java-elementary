package ua.od.hillel2;

public class Main {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println(a + " " + b + " " + c);
//        short a = 10;
//        short b = 25;
//        int result = addNumbers(a,b);
//        Systeystem.out.println(result);
//        for (int i = 0; i < count; i++)
//            System.out.println(i);
    }

    public static int addNumbers(short x, short y){
        return x/y;
    }
}