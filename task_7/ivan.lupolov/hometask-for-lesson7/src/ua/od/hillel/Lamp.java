package ua.od.hillel;

public class Lamp {

    public final static int MAX_NUM_BATTERY = 3;
    private int battery = 0;

    public Lamp() {}

    public Lamp(int battery) {
        this.battery = battery;
    }

    public void lightWhite(boolean flikerMod) {

        switch (battery) {
            case 1:
                if (flikerMod) {
                    System.out.println("Flicker mode is not available. You need 3 batteries.");
                } else {
                    System.out.println("* The white light shines *");
                }
                break;
            case 2:
                if (flikerMod) {
                    System.out.println("Flicker mode is not available. You need 3 batteries.");
                } else {
                    System.out.println("* The white light shines *");
                }
                break;
            case 3:
                if (flikerMod) {
                    System.out.println("* Flickering white light *");
                } else {
                    System.out.println("* The white light shines *");
                }
                break;
            default:
                System.out.println("No batteries.");
        }
    }

    public void lightRed(boolean flikerMod) {
        switch (battery) {
            case 1:
                if (flikerMod) {
                    System.out.println("Flicker mode is not available. You need 3 batteries.");
                } else {
                    System.out.println("Red light is not available. You need 2 batteries.");
                }
                break;
            case 2:
                if (flikerMod) {
                    System.out.println("Flicker mode is not available. You need 3 batteries.");
                } else {
                    System.out.println("* The red light shines *");
                }
                break;
            case 3:
                if (flikerMod) {
                    System.out.println("* Flickering red light *");
                } else {
                    System.out.println("* The red light shines *");
                }
                break;
            default:
                System.out.println("No batteries.");
        }
    }

    public void setBattery(int battery) {
        if(battery <= MAX_NUM_BATTERY && battery >= 0) {
            this.battery = battery;
        } else {
            System.out.println("[ERROR] Incorrect value: " + battery);
        }
    }

    public int getBattery() {
        return battery;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "battery=" + battery +
                '}';
    }
}
