package ua.od.hillel.junithamcrest.impl;



import org.junit.*;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

import ua.od.hillel.junithamcrest.CalcExpression;


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
        try {
            calcExpression2.divide();
            fail("should throw an exception");
        } catch (ArithmeticException e){
            assertThat(e.getMessage(), containsString("/ by zero"));
            assertThat(e, instanceOf(ArithmeticException.class));
        }
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
