package ua.od.hillel.oop.static_demo;

/**
 * Created by ruslangramatic on 4/4/18.
 */
public class Subclass1 extends Superclass {
    static {
        System.out.println("static block of Subclass1 class");
    }

    public void display()
    {
        System.out.println("Just a method of Subclass1 class");
    }

    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass1");
    }
}
