package ua.od.hillel.oop.junithamcrest.impl;

import org.junit.Before;
import org.junit.Test;
import ua.od.hillel.oop.junithamcrest.CalcExpressions;

import static org.junit.Assert.*;

public class CalcExpressionsTest {
    private CalcExpressionsImpl calcExpressionsImpl1;
    private CalcExpressionsImpl calcExpressionsImpl2;
    private CalcExpressionsImpl calcExpressionsImpl3;
    private CalcExpressionsImpl calcExpressionsImpl4;
    private CalcExpressionsImpl calcExpressionsImpl5;
    private CalcExpressionsImpl calcExpressionsImpl6;


    @Before
    public void init() {
        this.calcExpressionsImpl1 = new CalcExpressionsImpl(10, CalcExpressions.ADD, 2022);
        this.calcExpressionsImpl2 = new CalcExpressionsImpl(17, CalcExpressions.DIVIDE, 20243);
        this.calcExpressionsImpl3 = new CalcExpressionsImpl(122, CalcExpressions.MULTIPLY, 20324);
        this.calcExpressionsImpl4 = new CalcExpressionsImpl(552, CalcExpressions.SUBSTRACTION, 270);
        this.calcExpressionsImpl5 = new CalcExpressionsImpl(0, CalcExpressions.SUBSTRACTION, 270);
        this.calcExpressionsImpl6 = new CalcExpressionsImpl(552, CalcExpressions.SUBSTRACTION, 0);


    }

    @Test
    public void addTest() {
        calcExpressionsImpl4.add();

    }

    @Test
    public void divideTest() {

    }

    @Test
    public void multiplyTest() {

    }

    @Test
    public void substractionTest() {

    }

    @Test
    public void moduleDivTest() {

    }

    @Test
    public void SetOpTest() {
        calcExpressionsImpl1.setOperation(CalcExpressions.ADD);
        //  assertTrue("ok",calcExpressionsImpl1.getOperation().equels(CalcExpressions.ADD));

    }


}
