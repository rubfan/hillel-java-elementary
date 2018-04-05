package ua.od.hillel.oop.inner_classes;

/**
 * Created by ruslangramatic on 4/4/18.
 */
public class OutsidePlace {

    //Instantiating an inner class from outside
    public static void main(String args[]){
        MyOuterClassDemo.MyInnerClassDemo inner = new MyOuterClassDemo().new MyInnerClassDemo();
        inner.seeOuter();
    }
}
