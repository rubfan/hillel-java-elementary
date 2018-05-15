public interface Flashlight {

    static final int DEFAULT_AMT_BATTERY = 0;
    static final int DEFAULT_MAX_AMT_BATTERY = 3;
    static final String DEFAULT_NAME = "Flashlight";


    int addBattery(int amtBattery);
    String getName();
    int getAmtBattery();
    boolean shineWhite();
    boolean shineRed();
    boolean blink();
}

