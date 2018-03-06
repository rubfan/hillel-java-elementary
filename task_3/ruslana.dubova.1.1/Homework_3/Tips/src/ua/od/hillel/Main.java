package ua.od.hillel;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        if (args.length == 0) {

            Tips tipsCalc = new Tips();

            Scanner scr = new Scanner(System.in);

            System.out.println("Select service level: ");
            String impression = scr.nextLine();

            System.out.println("Specify price: ");
            float price = scr.nextFloat();

            System.out.println("Tips: " + tipsCalc.compute(impression, price));
        }
    }

}