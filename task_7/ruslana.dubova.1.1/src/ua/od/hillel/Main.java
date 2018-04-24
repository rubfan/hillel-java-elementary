package ua.od.hillel;

public class Main {

    public static void main(String[] args) {

        SpotLight sl = new SpotLight();
        System.out.println("Spotlight name: "+  sl.getName());

        sl.turnOn(SpotlightState.White);
        sl.insertBatteries(1);
        sl.turnOn(SpotlightState.White);
        sl.turnOn(SpotlightState.Red);
        sl.insertBatteries(2);
        sl.turnOn(SpotlightState.Red);
        sl.insertBatteries(3);
        sl.turnOn(SpotlightState.Blinking);
        sl.insertBatteries(4);
        sl.turnOn(SpotlightState.Blinking);
        sl.turnOff();
        System.out.println("Spolight state is: " + sl.getState());


    }
}
