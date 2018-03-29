package ua.od.hillel.oop.junithamcrest.impl;



import org.junit.*;

import static org.junit.Assert.*;

import ua.od.hillel.oop.junithamcrest.CalcExpression;


/**
 * Created by ruslangramatic on 3/25/18.
 */
public class CalcExpressionTest {
    private CalcExpression calcExpression;
    private CalcExpression calcExpression2;
    private CalcExpression calcExpression3;
    private CalcExpression calcExpression4;

    @Before
    public void init() {
        this.calcExpression = new CalcExpressionImpl(30, CalcExpression.DIVIDE, 10);
        this.calcExpression2 = new CalcExpressionImpl(30, CalcExpression.DIVIDE, 0);
        this.calcExpression3 = new CalcExpressionImpl(0, CalcExpression.DIVIDE, 40);
        this.calcExpression4 = new CalcExpressionImpl(Long.MAX_VALUE, CalcExpression.DIVIDE, Long.MAX_VALUE);
    }

    @Test
    public void addTest() {
        // case 1
        calcExpression.add();
        assertTrue(calcExpression.getResult() == 40);

        // case 2
        calcExpression4.add();
        double expr = calcExpression4.getResult();
        assertFalse(expr == (Long.MAX_VALUE * 2));
    }

    @Test
    public void divideTest() {
        // divide case 1
        calcExpression.divide();
        assertTrue(calcExpression.getResult() == 3);

        // divide case 2
        calcExpression3.divide();
        assertTrue(calcExpression3.getResult() == 0);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZeroTest() {
        // divide case 3
        calcExpression2.divide();
        assertTrue(calcExpression2.getResult() == -1);
    }

    @Test
    public void multiplyTest() {
        calcExpression.multiply();
        assertTrue(calcExpression.getResult() == 300);
    }

    @Test
    public void substractionTest() {
        calcExpression.substraction();
        assertTrue(calcExpression.getResult() == 20);
    }

    @Test
    public void moduleDivTest() {
        calcExpression.moduleDiv();
        assertTrue(calcExpression.getResult() == 0);
    }

    @Test
    public void setOpGetOP() {
        calcExpression.setOperation(CalcExpression.MULTIPLY);
        assertSame (
                calcExpression.getOperation(),
                CalcExpression.MULTIPLY
        );
    }

}
