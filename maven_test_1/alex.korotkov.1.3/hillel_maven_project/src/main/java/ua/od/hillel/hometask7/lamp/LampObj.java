package ua.od.hillel.hometask7.lamp;

public class LampObj {

    public static void main(String[] args) {
        SimpleLampImpl lamp = new SimpleLampImpl();
        lamp.showQtyOfBattery();
        lamp.insertBattery(1);
        lamp.shineWhiteStart();
        lamp.shineStop();
        lamp.shineBlinkStart();
        lamp.insertBattery(2);
        lamp.showQtyOfBattery();
        lamp.shineBlinkStart();
        lamp.shineStop();

    }
}
