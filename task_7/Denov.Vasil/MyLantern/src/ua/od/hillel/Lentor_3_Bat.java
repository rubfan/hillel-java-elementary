package ua.od.hillel;

public class Lentor_3_Bat extends Lentor_2_Bat {
    private final int  Battary = 3;
Lentor_3_Bat(String color, String type){
    super(color, type);
}
    @Override
    public void behavior() {
        System.out.println("фонарь мерцает");
    }

    @Override
    public String toString() {
        return "Lentor_1_Bat" +

                ", color='" + color + "and" +
                ", type='" + type;
    }
}
