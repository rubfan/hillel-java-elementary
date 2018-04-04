package ua.od.hillel.oop.junithamcrest.impl;

public class CalcExpressionsImpl implements ua.od.hillel.oop.junithamcrest.CalcExpressions {
    private double result;
    private double op1;
    private String op2;
    private double op3;


    CalcExpressionsImpl(double op1, String op2, double op3) {
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
    }


    public void add() {

    }

    public void divide() {

    }


    public void multiply() {

    }


    public void substraction() {

    }


    public void moduleDiv() {

    }

    @Override
    public void setOperation(String op) {
        op2 = op;

    }

    @Override
    public String getOperation() {
        return "";
    }

    @Override
    public double getResult() {
        return 0;
    }
}
