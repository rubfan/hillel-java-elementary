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

    public int addBattery(int amtBattery) {
        if (amtBattery >= 0) {
            if (this.getAmtBattery() + amtBattery <= maxBattery) {
                return this.amtBattery += amtBattery;
            } else {
                System.out.println("MAX battery 3!!!");
            }
        }else{
            System.out.println("Enter a value greater than 0!!!");
        }
        return this.amtBattery;
    }

    public String getName() {
        return this.name;
    }

    public int getAmtBattery() {
        return this.amtBattery;
    }

    public boolean shineWhite() {
        if (this.amtBattery >= 1){
            return true;
        } else {
            return false;
        }
    }

    public boolean shineRed() {
        if (this.amtBattery >= 2){
            return true;
        } else {
            return false;
        }
    }

    public boolean blink() {
        if (this.amtBattery >= 3){
            return true;
        } else {
            return false;
        }
    }
}
