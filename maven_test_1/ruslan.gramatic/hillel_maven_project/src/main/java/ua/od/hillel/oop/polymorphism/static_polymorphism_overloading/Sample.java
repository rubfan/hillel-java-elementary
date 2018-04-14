package ua.od.hillel.oop.polymorphism.static_polymorphism_overloading;

/**
 * Created by ruslangramatic on 4/4/18.
 */
class Sample
{
    public static void main(String args[])
    {
        OverloadingExample obj = new OverloadingExample();
        obj.disp('a');
        obj.disp('a',10);
    }
}