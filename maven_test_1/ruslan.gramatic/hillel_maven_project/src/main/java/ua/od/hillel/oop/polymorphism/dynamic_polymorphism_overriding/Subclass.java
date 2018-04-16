package ua.od.hillel.oop.polymorphism.dynamic_polymorphism_overriding;

/**
 * Created by ruslangramatic on 4/4/18.
 */
public class Subclass extends Superclass {

    public String field1 = "field1 of subclass";
    public void test() {
        System.out.println("Subclass Test");
    }

    public static void main(String[] args) {
        System.out.println("Access modifiers (widening concept): private > default > protected > public");
        System.out.println("Return type same or subtype or nothing (narrowing concept): ExceptionA > ExceptionB > ExceptionC");
        System.out.println("Return type same or subtype (narrowing concept): SampleA > SampleB > SampleC");
        System.out.println("you cant override final, static or private methods");

        System.out.println("==================================================");
//        Subclass sc = new Subclass();
//        System.out.println(sc.field1);
//        Superclass spc = sc;
//        System.out.println(spc.field1);
//
//
//        System.out.println("***************************************************");
//        Superclass testclass = new Superclass();
//        testclass.test();
//        testclass = new Subclass();
//        testclass.test();




        ChildTest t = new ChildTest();
        t.add(111);

    }


}

class EE {}

class AA{}
class BB extends AA {}
class CC extends BB {}


class ExceptionAA extends Exception {
    ExceptionAA(){}
}
class ExceptionBB extends ExceptionAA {
    public ExceptionBB(int aaa) {
    }
}
class ExceptionCC extends ExceptionBB {
    public ExceptionCC(int aaa, int cccc) {
        super(aaa);
    }
}





//(widening) private > default > protected > public
//(narrowing) AA > BB > CC
//(narrowing) ExceptionA > ExceptionB > ExceptionC
class SuperTest {

    void add(int any) {
        System.out.println("SuperTest");

    }
}
class ChildTest extends SuperTest {

    void add(int any) {
        System.out.println("SuperChild");
    }
}
















