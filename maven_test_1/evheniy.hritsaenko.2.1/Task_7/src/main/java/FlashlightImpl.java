public class FlashlightImpl implements Flashlight {

    private int amtBattery = DEFAULT_AMT_BATTERY;
    private int maxBattery = DEFAULT_MAX_AMT_BATTERY;
    private String name = DEFAULT_NAME;

    public FlashlightImpl(){}

    public FlashlightImpl(int amtBattery, String name) {
        this.amtBattery = amtBattery;
        this.name = name;
    }

    public FlashlightImpl(String name) {
        this.name = name;
    }

    public FlashlightImpl(int amtBattery) {
        this.amtBattery = amtBattery;
    }

    public void addBattery(int amtBattery) {
        if (this.getAmtBattery() + amtBattery <= maxBattery) {
            this.amtBattery += amtBattery;
        }else {
            System.out.println("MAX battery 3!!!");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAmtBattery() {
        return this.amtBattery;
    }

    public void shineWhite() {
        if (this.amtBattery >= 1){
            System.out.println("Shine WHITE!!!");
        } else {
            System.out.println("Insert more batteries!!!");
        }
    }

    public void shineRed() {
        if (this.amtBattery >= 2){
            System.out.println("Shine RED!!!");
        } else {
            System.out.println("Insert more batteries!!!");
        }
    }

    public void blink() {
        if (this.amtBattery >= 3){
            System.out.println("BLINK!!!");
        } else {
            System.out.println("Insert more batteries!!!");
        }
    }
}
