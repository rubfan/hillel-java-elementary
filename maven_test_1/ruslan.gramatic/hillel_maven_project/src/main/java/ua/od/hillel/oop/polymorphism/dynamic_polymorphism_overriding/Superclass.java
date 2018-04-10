package ua.od.hillel.oop.polymorphism.dynamic_polymorphism_overriding;

/**
 * Created by ruslangramatic on 4/4/18.
 */
public /*abstract*/ class Superclass {

    public String field1 = "field1 of superclass";

    private SampleB method1(int par1, String par2, char par3) throws ExceptionB {
        return null;
    }

    SampleB method2(String par1, int par2) throws ExceptionB {
        return null;
    }

    protected SampleB method3(String par1, String par2) throws ExceptionB {
        return null;
    }

    public SampleB method4(String par1, int par2, boolean par3) throws ExceptionB {
        return null;
    }

    public SampleB method5(String par1, int par2, boolean par3, String par4) throws ExceptionB {
        return null;
    }



    // abstract private SampleB method6(int par1, String par2, char par3, boolean b) throws ExceptionB;

    // abstract SampleB method7(String par1, int par2) throws ExceptionB;

    // abstract protected SampleB method8(String par1, String par2) throws ExceptionB;

    // abstract public SampleB method9(String par1, int par2, boolean par3) throws ExceptionB;


    public void test(){
        System.out.println("Superclass Test");
    }
}
