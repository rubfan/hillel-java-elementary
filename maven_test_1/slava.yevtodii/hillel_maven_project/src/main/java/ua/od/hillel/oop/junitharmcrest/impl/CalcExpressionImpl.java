package ua.od.hillel.oop.junitharmcrest.impl;

import ua.od.hillel.oop.junitharmcrest.CalcExpression;

public class CalcExpressionImpl implements CalcExpression {


    private double result;
    private double op1;
    private String op2;
    private double op3;



    public CalcExpressionImpl(double op1, String op2, double op3) {
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
    }

    public void add() {
        result = (op1 + op3);

    }

    public void divide() {

        if (op3 == 0) {
            result = -1; //err div 0
        }
        else {
            result = (op1/op3);
        }

    }

    public void multiply() {
        result = (op1 * op3);

    }

    public void subtract() {
        result = (op1 - op3);
    }

    public void moduleDiv() {
        result = (op1 % op3);

    }

    public void setOperation(String op) {
        op2 = op;

    }

    public double getResult() {
        return result;
    }

    public String getOperation() {
        return op2;
    }
}
