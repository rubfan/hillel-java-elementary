public interface Flashlight {

    static final int DEFAULT_AMT_BATTERY = 0;
    static final int DEFAULT_MAX_AMT_BATTERY = 3;
    static final String DEFAULT_NAME = "Flashlight";


    void addBattery(int amtBattery);
    String getName();
    int getAmtBattery();
    void shineWhite();
    void shineRed();
    void blink();
}

