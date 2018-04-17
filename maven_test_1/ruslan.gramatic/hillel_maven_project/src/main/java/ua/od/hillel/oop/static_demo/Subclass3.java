package ua.od.hillel.oop.static_demo;

/**
 * Created by ruslangramatic on 4/4/18.
 */
public class Subclass3 extends Subclass2 {
    static {
        System.out.println("static block of Subclass3 class");
    }

    public static void staticDisplay() {
        System.out.println("Just a static method of Subclass3 class");
    }

    public void display() {
        System.out.println("Just a method of Subclass3 class");
    }

    public static void main(String[] args) {
        Subclass3 obj = new Subclass3();

        System.out.println("===============================");
        obj.display();

        Subclass1 c1 = obj;// позднее связывание
        c1.display();

        Subclass2 c2 = obj;// обход позднего связывания
        c1.printMethod();

        System.out.println("********************************");
        Subclass3.staticDisplay();
        Subclass2.staticDisplay();


        System.out.println(obj.field1);
        System.out.println(((Superclass)obj).field1);

        System.out.println(obj.method1());
        System.out.println(((Superclass)obj).method1());

        obj.method2();
        System.out.println(obj.field1);
        System.out.println(((Superclass)obj).field1);
    }
}
