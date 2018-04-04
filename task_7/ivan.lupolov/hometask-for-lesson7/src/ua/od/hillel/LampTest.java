package ua.od.hillel;

public class LampTest {
    public static void main(String[] args) {

        Lamp l0 = new Lamp();
        Lamp l1 = new Lamp(1);
        Lamp l2 = new Lamp(2);
        Lamp l3 = new Lamp(3);

        System.out.println("Test lamp: " + l0);

        l0.lightWhite(true);
        l0.lightWhite(false);
        l0.lightRed(true);
        l0.lightRed(false);
        System.out.println();

        System.out.println("Test lamp: " + l1);

        l1.lightWhite(true);
        l1.lightWhite(false);
        l1.lightRed(true);
        l1.lightRed(false);
        System.out.println();


        System.out.println("Test lamp: " + l2);

        l2.lightWhite(true);
        l2.lightWhite(false);
        l2.lightRed(true);
        l2.lightRed(false);
        System.out.println();

        System.out.println("Test lamp: " + l3);

        l3.lightWhite(true);
        l3.lightWhite(false);
        l3.lightRed(true);
        l3.lightRed(false);
    }
}
