package ua.od.hillel.oop.polymorphism.dynamic_polymorphism_overriding;

/**
 * Created by ruslangramatic on 4/4/18.
 */
public class Subclass extends Superclass {

    public String field1 = "field1 of subclass";

    public static void main(String[] args) {
        System.out.println("Access modifiers (widening concept): private > default > protected > public");
        System.out.println("Return type same or subtype or nothing (narrowing concept): ExceptionA > ExceptionB > ExceptionC");
        System.out.println("Return type same or subtype (narrowing concept): SampleA > SampleB > SampleC");
        System.out.println("you cant override final, static or private methods");

        System.out.println("==================================================");
        Subclass sc = new Subclass();
        System.out.println(sc.field1);
        Superclass spc = sc;
        System.out.println(spc.field1);


        System.out.println("***************************************************");
        Superclass testclass = new Superclass();
        testclass.test();
        testclass = new Subclass();
        testclass.test();
    }

    public void test() {
        System.out.println("Subclass Test");
    }
}
