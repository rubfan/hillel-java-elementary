package ua.od.hillel.oop.junitharmcrest;

public interface CalcExpression {

    final static String ADD = "+";
    final static String DIVIDE = "/";
    final static String MULTIPLY = "*";
    final static String SUBTRACTION = "-";
    final static String MODULE_DIVIDE = "%";

    void add();

    void divide();

    void multiply();

    void subtract();

    void moduleDiv();

    void setOperation(String op);

    String getOperation();

    double getResult();

}
