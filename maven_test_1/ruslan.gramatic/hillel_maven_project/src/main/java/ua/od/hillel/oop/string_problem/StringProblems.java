package ua.od.hillel.oop.string_problem;

/**
 * Created by ruslangramatic on 4/4/18.
 */
public class StringProblems {
    public static void main(String[] args) {
        //        String methods:
        //            - charAt
        //            - getNumberOfSymbols('s', str)
        //            - concat and "+"
        //            - \" symbol
        //            - trim
        //            - replace
        //            - substring
        //            - split
        //            - Reverse a string problem
        //        Strings:
        //            - new String creation (with new keyword and with "")
        //            - show the String class implementation
        //        String memory model:
        //            - pool of strings
        //            - creation of the same string
        //            - intern method
        //        StringBuilder:
        //          - reverse method
        //          - with cycle and "+" operator

        Integer i = 10;
        Integer ii = new Integer(10);

        int a = i;

        String s = "dddd" + "dfsdfdd";

        System.out.println(s);


        String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");
        final String s4 = s3.intern();

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));

        String s5 = new String("abc");
        String s6 = new String("abc");

        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
        System.out.println(s5.intern() == s6.intern());
        System.out.println(s5 == s6.intern());


        // StringBuffer threadsafe
        StringBuilder str = new StringBuilder("ukraine");
        System.out.println("string = " + str);
        System.out.println("reverse = " + str.reverse());
        str = new StringBuilder("odessa");
        System.out.println("string = " + str);
        System.out.println("reverse = " + str.reverse());

    }
}
