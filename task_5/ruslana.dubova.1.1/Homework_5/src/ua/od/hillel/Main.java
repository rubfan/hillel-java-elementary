package ua.od.hillel;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Piramid");
        Piramid p = new Piramid();
        p.print();
        System.out.println("Spiral");
        Spiral s = new Spiral(5);
        s.print();
    }
}
