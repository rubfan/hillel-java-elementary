package ua.od.hillel.junithamcrest.impl;

import ua.od.hillel.junithamcrest.CalcExpression;

/**
 * Created by ruslangramatic on 3/25/18.
 */
public class CalcExpressionImpl implements CalcExpression {
    private double result = 0;
    private double op1;
    private String op2 = CalcExpression.ADD;
    private double op3;

    public CalcExpressionImpl(double op1, String op2, double op3) {
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
    }

    public CalcExpressionImpl(double op1, double op3) {
        // ??? next lesson
    }

    public CalcExpressionImpl(double[] ops) {
        // ??? next lesson
    }

    public void add() {
        result = (op1 + op3);
    }

    public void divide() {
        result = (op1 / op3);
    }

    public void multiply() {
        result = (op1 * op3);
    }

    public void substraction() {

    }

    public void moduleDiv() {
        result = (op1 % op3);
    }

    public void setOperation(String op) {
        op2 = op;
    }

    public String getOperation() {
        return op2;
    }

    public double getResult() {
        return result;
    }
}
