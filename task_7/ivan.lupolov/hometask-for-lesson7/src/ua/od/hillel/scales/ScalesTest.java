package ua.od.hillel.scales;

public class ScalesTest {
    public static void main(String[] args) {

        Scales scales = new Scales(50,0.01f);
        Tare tare = new Tare(15);
        ObjectToWeighing object = new ObjectToWeighing(35);

        scales.addTare(tare);
        scales.setToZero();
        System.out.println("Weight: " + scales.getWeigh(object));
    }
}
