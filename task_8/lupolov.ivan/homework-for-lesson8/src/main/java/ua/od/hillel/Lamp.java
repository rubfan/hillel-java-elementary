package ua.od.hillel;

public class Lamp {

    public final static int MAX_NUM_BATTERY = 3;
    private int battery = 0;

    public Lamp() {}

    public Lamp(int battery) {
        if(battery <= MAX_NUM_BATTERY && battery >= 0) {
            this.battery = battery;
        } else {
            System.out.println("[ERROR] Incorrect value: " + battery);
        }
    }

    public boolean lightWhite(boolean flikerMod) {

        if (battery < 3 && battery != 0) {
            if (flikerMod) {
                System.out.println("Flicker mode is not available. You need 3 batteries.");
                return false;
            } else {
                System.out.println("* The white light shines *");
                return true;
            }
        } else if(battery == 3) {
            if (flikerMod) {
                System.out.println("* Flickering white light *");
                return true;
            } else {
                System.out.println("* The white light shines *");
                return true;
            }
        } else {
            System.out.println("No batteries.");
            return false;
        }
    }

    public boolean lightRed(boolean flikerMod) {

        if (battery < 2) {
            if (flikerMod) {
                System.out.println("Flicker mode is not available. You need 3 batteries.");
                return false;
            } else {
                System.out.println("Red light is not available. You need 2 batteries.");
                return false;
            }
        } else if (battery == 2) {
            if (flikerMod) {
                System.out.println("Flicker mode is not available. You need 3 batteries.");
                return false;
            } else {
                System.out.println("* The red light shines *");
                return true;
            }
        } else if (battery == 3) {
            if (flikerMod) {
                System.out.println("* Flickering red light *");
                return true;
            } else {
                System.out.println("* The red light shines *");
                return true;
            }
        } else {
            System.out.println("No batteries.");
            return false;
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
