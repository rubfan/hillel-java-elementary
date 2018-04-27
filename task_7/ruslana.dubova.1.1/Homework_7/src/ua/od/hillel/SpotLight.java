package ua.od.hillel;

public class SpotLight {
    //data members
    private String name = "Samsung Spotlight";

    //numb of batteries
    private int batteries = 0;

    //state
    private SpotlightState state = SpotlightState.Off;

    //methods
    public String getName(){
        return name;
    }

    public void insertBatteries(int number){
        if(number <=3) {
            batteries = number;
        }else{
            System.out.println("Insert no more then 3 batteries");
        }
    }
    public int getNumberOfBatteries(){
        return batteries;
    }
    public boolean turnOn(SpotlightState s) {
        switch (s) {
            case White:
                if (batteries >= 1) {
                    state = s;
                    System.out.println("Spotlight is lighting white");
                    return true;
                } else {
                    System.out.println("Insert at least one battery");
                    return false;
                }
            case Red:
                if (batteries >= 2) {
                    state = s;
                    System.out.println("Spotlight is lighting red");
                    return true;
                } else {
                    System.out.println("Insert at least two battery");
                    return false;
                }
            case Blinking:
                if (batteries == 3) {
                    state = s;
                    System.out.println("Spotlight is blinking");
                    return true;
                } else {
                    System.out.println("Insert three batteries");
                    return false;
                }
        }
        return false;
    }
    public void turnOff(){
        state = SpotlightState.Off;
    }
    public SpotlightState getState(){
        return state;
    }

}
