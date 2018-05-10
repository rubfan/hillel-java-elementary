package ua.od.hillel.oop.inner_classes;

/**
 * Created by ruslangramatic on 4/4/18.
 */
public class MyOuterClassDemo4 {
    public static void main(String[] args){

        // use both class names
        Outer.Nested1 n = new Outer.Nested1();
    }
}



class Outer{
    final static public String INITIAL_VALUE = "jahgdjahsgd";

    static class Nested1 {
        public String aaa = INITIAL_VALUE;
    }

    static class Nested2 {
        public String aaa = INITIAL_VALUE;
    }

    static class Nested3 {
        public String aaa = INITIAL_VALUE;
    }

    static class Nested4 {
        public String aaa = INITIAL_VALUE;
    }
}

