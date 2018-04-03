package ua.od.hillel.oop.junithamcrest;

/**
 * Created by ruslangramatic on 3/28/18.
 */
public interface CalcExpression {

    final static String ADD = "+";
    final static String DIVIDE = "/";
    final static String MULTIPLY = "*";
    final static String SUBSTRACTION = "-";
    final static String MODULE_DIVIDE = "%";

    void add();

    void divide();

    void multiply();

    void substraction();

    void moduleDiv();

    void setOperation(String op);

    String getOperation();

    double getResult();
}
