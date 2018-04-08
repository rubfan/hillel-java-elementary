package ua.od.hillel;

public class HW7 {

    public static void main(String[] args) {

        //testingFlashLight();
        Frankenstein monster = testingFrankenstein();
        Fighter man = testingFighter();

        man.battle(monster);



    }

    private static void testingFlashLight() {

        System.out.println("\n==================\n!!! Flashlight !!!\n==================\n");

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

    private static Frankenstein testingFrankenstein() {

        System.out.println("\n==================\n!!! FRANKENSTEIN !!!\n==================\n");

        Frankenstein frank = new Frankenstein();

        frank.name = "Franky";
        frank.add("body");
        frank.add("head");
        frank.add("leg");
        frank.add("leg");
        frank.add("arm");
        frank.add("arm");
        frank.remove("arm");
        frank.remove("arm");

        frank.add("arm");
        frank.add("arm");
        frank.add("arm");
        frank.wakeUp();
        frank.walking();
        frank.add("leg");
        frank.destroy();

        return frank;

    }

    private static Fighter testingFighter() {

        System.out.println("\n==================\n!!! FIGHTER !!!\n==================\n");

        Fighter fight = new Fighter();

        fight.name = "Java";
        fight.training();
        fight.training("light");
        fight.rest();
        fight.training("hard");

        return fight;
    }
}
