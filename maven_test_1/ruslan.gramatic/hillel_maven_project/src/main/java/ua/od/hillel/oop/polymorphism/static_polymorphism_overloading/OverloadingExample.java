package ua.od.hillel.oop.polymorphism.static_polymorphism_overloading;

/**
 * Created by ruslangramatic on 4/4/18.
 */
public class OverloadingExample {

    public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(char c, int num)
    {
        System.out.println(c + " "+num);
    }
}
