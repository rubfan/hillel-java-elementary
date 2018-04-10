package ua.od.hillel.oop.static_demo;

/**
 * Created by ruslangramatic on 4/4/18.
 */
public class Superclass {
    public String field1 = "____Superclass___";
    public String method1() {return "____Superclass___";}
    public void method2() {
        this.field1 = "____Superclass___";
    }

    static{
        System.out.println("static block of parent class");
    }

    public void printMethod() {
        System.out.println("Printed in Superclass");
    }
}