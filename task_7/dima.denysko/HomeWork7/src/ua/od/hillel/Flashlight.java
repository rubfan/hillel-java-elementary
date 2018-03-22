package ua.od.hillel;
/**
 * Created by dmytro.denysko on 15.03.2018.
 */
public class Flashlight {
    private String name;
    private int battery;
    private boolean whiteLight;
    private boolean redLight;
    private boolean flashingLight;

    public Flashlight(String name) {
        this.name = name;
    }

    public void whatIsTheLightOn() {
        if (whiteLight) System.out.println("White Light");
        else if (redLight) System.out.println("Red Light");
        else if (flashingLight) System.out.println("Flashing Light");
        else System.out.println("Lighter is off");
    }

    public void offFlashLight() {
        whiteLight = false;
        redLight = false;
        flashingLight = false;
        System.out.println("Game Over");
    }

    public void switchFlashingLight() {
        if(flashingLight){
            System.out.println("hey!, now and so it shines Flashing Light");
            return;
        }
        if (battery < 3) {
            System.out.println("Oops, no work, please see, how many batterys, for WhiteLight need 3 battery");
            showBatterys();
            return;
        }
        if (whiteLight) whiteLight = false;
        if (redLight) redLight = false;
        battery -= 3;
        flashingLight = true;
        System.out.println("It's work - FlashingLight");
    }

    public void switchWhiteLight() {
        if(whiteLight){
            System.out.println("hey!, now and so it shines White Light");
            return;
        }
        if (battery < 1) {
            System.out.println("Oops, no work, please see, how many batterys, for WhiteLight need 1 battery");
            showBatterys();
            return;
        }
        if (redLight) redLight = false;
        if (flashingLight) flashingLight = false;
        battery -= 1;
        whiteLight = true;
        System.out.println("It's work - WhiteLight");
    }

    public void switchRedLight() {
        if(redLight){
            System.out.println("hey!, now and so it shines Red Light");
            return;
        }
        if (battery < 2) {
            System.out.println("Oops, no work, please see, how many batterys, for RedLight need 2 battery");
            showBatterys();
            return;
        }
        if (whiteLight) whiteLight = false;
        if (flashingLight) flashingLight = false;
        battery -= 2;
        redLight = true;
        System.out.println("It's work - RedLight");
    }

    public void showBatterys() {
        System.out.println("In " + name + " " + battery + " batterys");
    }

    public void addBattery(int battery) {
        if (battery <= 0) {
            System.out.println("Whaaat?");
            return;
        }
        if (battery > 3) {
            System.out.println("Max battery is 3, i can not shove " + battery + " batterys");
            return;
        }
        if (this.battery > 2) {
            System.out.println("too many battery in " + name);
            return;
        }
        if (this.battery == 2 && battery > 1) {
            System.out.println("Too many batterys");
            return;
        }
        if (this.battery == 1 && battery > 2) {
            System.out.println("Too many batterys");
            return;
        }
        this.battery += battery;
    }
}
