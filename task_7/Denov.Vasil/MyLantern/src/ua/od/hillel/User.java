package ua.od.hillel;

public class User {

    public static void main(String[] args) {

        Lentor_1_Bat l1 = new Lentor_1_Bat("черный", "карманный");
        Lentor_2_Bat l2 = new Lentor_2_Bat("жолтый", "болшой");
        Lentor_3_Bat l3 = new Lentor_3_Bat("черный", "карманный");

        System.out.println(l1);
        l1.on();
        l1.off();
        System.out.println();

        System.out.println(l2);
        l2.on();
        l2.off();
        System.out.println();

        System.out.println(l3);
        l3.on();
        l3.off();

    }
}
