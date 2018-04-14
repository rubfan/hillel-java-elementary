package edu.kodzhebash.hillelLessons.Hillel2;

import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Оцените качество обслуживания 1-5");
        System.out.println("1.Terrible 2.Poor 3.Good 4.Great 5.Excellent");
        int Service = scn.nextInt();
        System.out.println("Enter money");
        double money = scn.nextDouble();
        System.out.println("Your bill: "+ tips(money, Service)+ "usd");

    }

    public static double tips (double money, int service){
        switch (service){
            case 1:
                return money;
            case 2:
                return (double)(money * 1.05);
            case 3:
                return (double)(money * 1.1);
            case 4:
                return (double)(money * 1.15);
            case 5:
                return (double)(money * 1.2);
            default:
                System.out.println("error");
                return money;


        }
    }
}
