package ua.od.hillel.oop.junithamcrest.impl;



import org.junit.Before;
import org.junit.Test;
import ua.od.hillel.oop.junithamcrest.CalcExpression;


import static org.junit.Assert.*;

public class CalcExpressionTest {

    private CalcExpressionImpl calcExpressionImpl1;



    @Before
    public void init(){
        this.calcExpressionImpl1 = new CalcExpressionImpl(30, CalcExpression.ADD, 10);

    }

    @Test
    public void addTest() {
        calcExpressionImpl1.add();
        assertTrue(calcExpressionImpl1.getResult() == 40);

    }
    @Test
    public void divideTest() {
        calcExpressionImpl1.divide();
        assertTrue(calcExpressionImpl1.getResult() == 3);

    }
    @Test
    public void multiplyTest() {
        calcExpressionImpl1.multiply();
        assertTrue(calcExpressionImpl1.getResult() == 300);

    }
    @Test
    public void substractionTest() {
        calcExpressionImpl1.substraction();
        assertTrue(calcExpressionImpl1.getResult() == 20);

    }
    @Test
    public void moduleDivTest() {
        calcExpressionImpl1.moduleDiv();
        assertTrue(calcExpressionImpl1.getResult() == 0);

    }


    @Test
    public void setOperation() {
        calcExpressionImpl1.setOperation(CalcExpression.ADD);
        assertTrue("", calcExpressionImpl1.getOperation().equals(CalcExpression.ADD));
    }

}
