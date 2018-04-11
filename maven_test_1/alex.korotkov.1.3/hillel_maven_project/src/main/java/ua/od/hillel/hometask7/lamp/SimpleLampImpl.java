package ua.od.hillel.hometask7.lamp;

public class SimpleLampImpl implements Lamp{


    private int qtyOfBattery = 0;

    public SimpleLampImpl(int qtyOfBattery) {
        this.qtyOfBattery = qtyOfBattery;
    }

    public SimpleLampImpl() {

    }


    public int showQtyOfBattery(){

        System.out.println(this.qtyOfBattery + " battery in the lamp");
        return this.qtyOfBattery;
    }


    public void insertBattery(int i) {

        this.qtyOfBattery += i;
        System.out.println(i + " battery insert");

    }

    public void removeBattery(int i) {

        this.qtyOfBattery -= i;
        System.out.println(i + " battery remove");
    }


    public boolean shineWhiteStart() {
        if (qtyOfBattery >= 1){
            System.out.println("I'm shining in WHITE!!!");
            return true;
        }
        else {
            System.out.println("I need at least 1 battery for this operation!!");
            return false;
        }

    }

    public boolean shineRedStart() {
        if (qtyOfBattery >= 2){
            System.out.println("I'm shining in RED!!!");
            return true;
        }
        else {
            System.out.println("I need at least 2 battery for this operation!!");
            return false;
        }

    }

    public boolean shineBlinkStart() {
        if (qtyOfBattery >= 3){
            System.out.println("I'm shining in BLINK!!!");
            return true;
        }
        else {
            System.out.println("I need at least 3 battery for this operation!!");
            return false;
        }

    }

    public boolean shineStop() {
        System.out.println("I'm stop shining");
        return true;

    }
}
