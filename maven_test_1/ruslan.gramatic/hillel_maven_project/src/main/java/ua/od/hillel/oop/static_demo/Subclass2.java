package ua.od.hillel.oop.static_demo;

/**
 * Created by ruslangramatic on 4/4/18.
 */
public class Subclass2 extends Subclass1 {
    public String field1 = "____Subclass2____";
    public String method1() {return "____Subclass2____";}
    public void method2() {
        this.field1 = "____Subclass2____";
    }

    static {
        System.out.println("static block of Subclass2 class");
    }

    public static void staticDisplay() {
        System.out.println("Just a static method of Subclass2 class");
    }
}
