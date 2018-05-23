package ua.od.hillel;

public class Lentor_1_Bat implements Switch {

    private final int  Battary = 1;
    protected String color;
    protected String type;



    Lentor_1_Bat(String color, String type){
        this.color=color;
        this.type=type;
    }
    @Override
    public void on() {
        System.out.println("Фонарь вкл");
        behavior();
    }


    public void behavior(){
        System.out.println("фонарь горит белым");
    }


    @Override
    public String toString() {
        return "Lentor_1_Bat" +

                ", color='" + color + "and" +
                ", type='" + type;
    }

    @Override
    public void off() {
        System.out.println("Фонарь выкл");





    }
}
