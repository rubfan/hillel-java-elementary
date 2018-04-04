package ua.od.hillel;

public class HW7 {

    public static void main(String[] args) {

        //testingFlashLight();
        testingFrankenstein();


    }

    private static void testingFlashLight() {

        System.out.println("!!! Flashlight !!!");

        Flashlight flash = new Flashlight();
        Flashlight flash2 = new Flashlight();

        flash.name = "-FIRST-";
        flash.battery = 0;
        flash.printState();
        flash.turnOn();
        flash.working("red");
        flash.working("white");
        flash.blinking();
        flash.changeBattery();
        flash.blinking();
        flash.turnOff();

        System.out.println("===================");

        flash2.name = "-SECOND-";
        flash2.battery = 2;
        flash2.printState();
        flash2.turnOn();
        flash2.working("white");
        flash2.blinking();
        flash2.turnOff();
    }

    private static void testingFrankenstein() {

        Frankenstein frank = new Frankenstein();
        Frankenstein doctor = new Frankenstein();

        frank.name = "Franky";
        frank.add("body");
        frank.add("head");
        frank.add("leg");
        frank.add("arm");
        frank.add("arm");
        frank.remove("arm");
        frank.remove("arm");

        frank.add("leg");
        frank.wakeUp();
        frank.walking();
        frank.add("leg");



    }
}
