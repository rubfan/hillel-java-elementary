package ua.od.hillel.oop.junithamcrest.impl;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import ua.od.hillel.oop.junitharmcrest.CalcExpression;
import ua.od.hillel.oop.junitharmcrest.impl.CalcExpressionImpl;

public class CalcExpressionTest {

    private CalcExpressionImpl calcExpressioImpl1;
    private CalcExpressionImpl calcExpressioImpl2;
    private CalcExpressionImpl calcExpressioImpl3;
    private CalcExpressionImpl calcExpressioImpl4;
    private CalcExpressionImpl calcExpressioImpl5;
    private CalcExpressionImpl calcExpressioImpl6;


    @Before
    public void init() {
        this.calcExpressioImpl1 = new CalcExpressionImpl(10, CalcExpression.ADD, 20);
        this.calcExpressioImpl2 = new CalcExpressionImpl(12, CalcExpression.DIVIDE, 20);
        this.calcExpressioImpl3 = new CalcExpressionImpl(20.6, CalcExpression.SUBTRACTION, 20);
        this.calcExpressioImpl4 = new CalcExpressionImpl(0.03, CalcExpression.MULTIPLY, 20);
        this.calcExpressioImpl5 = new CalcExpressionImpl(0, CalcExpression.MULTIPLY, 20);
        this.calcExpressioImpl6 = new CalcExpressionImpl(10, CalcExpression.MULTIPLY, 0);
    }

    @Test
    public void addTest() {
        calcExpressioImpl1.add();
        assertTrue(calcExpressioImpl1.getResult() == 30);

    }

    @Test
    public void divideTest() {
        calcExpressioImpl2.divide();
        assertTrue(calcExpressioImpl2.getResult() == 0.6);

    }

    @Test
    public void multiplyTest() {
        calcExpressioImpl3.multiply();
        assertTrue(calcExpressioImpl3.getResult() == 0.6);

    }

    @Test
    public void subtractTest() {
        calcExpressioImpl4.subtract();
        assertTrue(calcExpressioImpl4.getResult() == 0.6);

    }

    @Test
    public void moduleDivTest() {
        calcExpressioImpl4.moduleDiv();
        assertTrue(calcExpressioImpl4.getResult() == 0.6);

    }

    @Test
    public void setGetOp() {
        calcExpressioImpl1.setOperation(CalcExpression.ADD);
        assertTrue("ok", calcExpressioImpl1.getOperation().equals(CalcExpression.MULTIPLY));
    }


}
