package ua.od.hillel.oop.static_import;

import static java.lang.System.out;
import static java.lang.Math.*;

import static ua.od.hillel.oop.static_import.Class1.*;


/**
 * Created by ruslangramatic on 4/4/18.
 */
public class Class2 {
    public static void main(String args[]) {
        //instead of Math.sqrt need to use only sqrt
        double var1 = sqrt(5.0);
        //instead of Math.tan need to use only tan
        double var2 = tan(30);
        //need not to use System in both the below statements
        out.println("Square of 5 is:" + var1);
        out.println("Tan of 30 is:" + var2);


        String info = getSomeInfo();
        out.println("Info: " + info);
    }
}
