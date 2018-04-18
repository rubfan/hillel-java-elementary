package ua.od.hillel.HW8;

import java.util.Scanner;

public class Flashlight {

    private int battery;
    private String color = "white";
    private String state = "off";

    private String name = "=default_name=";

//    public void changeBattery() {
//        System.out.println("===== CHANGING BATTERIES ======");
//        System.out.println("Current number of batteries = " + battery);
//        System.out.println("Enter the number of batteries to put in (positive) or remove (negative):");
//        Scanner temp = new Scanner(System.in);
//        int n = temp.nextInt();
//        battery += n;
//        System.out.println("===== DONE =====");
//    }

    public void addBattery(int n) {
        battery += n;
    }

    public void removeBattery(int n) {
        battery -= n;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("red") || color.equals("white")) {
            this.color = color;
        }
        else System.out.println("No " + color + " color mode");

    }

    public void changeColor() {
        if (color.equals("white") && battery >= 2) {
            color = "red";
        }
        else if (color.equals("red") && battery >= 1) {
            color = "white";
        }
        else System.out.println("Cannot change the color");
    }

    public void turnOn() {
        if (battery == 0) {
            System.out.println("working without batteries? are you kidding me? put in at least one!!!");
//            System.out.println("Would you like to put some in?? [y, n]");
//            Scanner turn = new Scanner(System.in);
//            String tempScan = turn.nextLine();
//            if (tempScan.equals("y")) {
//                changeBattery();
//                turnOn();
//            }
//            else {
//                System.out.println("ok, we are finished");
//                return;
//            }
        }

        else {
            state = "on";
            System.out.println(name + " turned on!");
        }
    }

    public void turnOff() {
        state = "off";
        System.out.println(name + " turned off!");
    }

    public boolean working() {

        boolean work = false ;

        if (state.equals("on")) {
            switch (color) {
                case "white":

                    switch (battery) {
//                        case 0:
//                            System.out.println("Oh man, you wanna this flashlight to work without any battery? Put in at least one!");
//                            break;
                        case 1:
                            System.out.println("Here is a good white light! And that is it...");
                            work = true;
                            break;
                        case 2:
                            System.out.println("Here is a good white light! And there is also enough power for red light!");
                            work = true;
                            break;
                        case 3:
                            System.out.println("Here is a good white light! And there is also enough power for red light! And it also can blink!!!");
                            work = true;
                            break;

                    }
                    break;

                case "red":
                    switch (battery) {
//                        case 0:
//                            System.out.println("Oh man, you wanna this flashlight to work without any battery? Put in at least one!");
//                            break;
                        case 1:
                            System.out.println("Sorry.. This flash light is too weak to make red light...");
                            break;
                        case 2:
                            System.out.println("Here is a good red light! And there is also enough power for white light!");
                            work = true;
                            break;
                        case 3:
                            System.out.println("Here is a good red light! And there is also enough power for white light! And it also can blink!!!");
                            work = true;
                            break;

                    }
                    break;
            }

        }
        else {
            System.out.println(name + " is turned OFF!!! I guess you need to turn it on first. ");
//            Scanner scan = new Scanner(System.in);
//            String tempScan = scan.nextLine();
//            if (tempScan.equals("y")) {
//                turnOn();
//                working(color);
//            }
//            else {
//                System.out.println("ok, we are finished");
//                return;
//            }
        }
        return work;
    }

    public boolean blinking() {
        boolean blink = false;
        if (battery == 3 && state.equals("on")) {
            System.out.println(name + " is blinking now!!!");
            blink = true;
        }
        else if (state.equals("off")) System.out.println(name + " cannot blink, it is off!!");
        else if (battery != 3) System.out.println(name + " cannot blink, must have 3 battery, now it has " + battery);
        return blink;
    }

    public void printState() {
        System.out.println(name + " is " + state);
        System.out.println("it has " + battery + " batteries.");
    }
}
