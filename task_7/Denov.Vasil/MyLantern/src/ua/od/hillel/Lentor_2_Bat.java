package ua.od.hillel;

public class Lentor_2_Bat extends  Lentor_1_Bat {
    private final int  Battary = 2;

    Lentor_2_Bat(String color, String type){
        super(color, type);
    }

    @Override
    public void behavior() {

        System.out.println("фонарь горит красным ");
    }
    @Override
    public String toString() {
        return "Lentor_2_Bat" +

                ", color='" + color + "and" +
                ", type='" + type;
    }
}
