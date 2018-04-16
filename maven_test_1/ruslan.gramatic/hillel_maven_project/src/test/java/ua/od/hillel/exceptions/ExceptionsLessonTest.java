package ua.od.hillel.exceptions;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by ruslangramatic on 4/15/18.
 */
public class ExceptionsLessonTest {
    private ExceptionsLesson el;

    @Before
    public void init() {
        el = new ExceptionsLesson();
    }

    @Test
    public void divideRightValuesTest() throws MyDivideArgsException {
        assertTrue(el.divide(10,5) == 2);
    }

    @Test(expected = MyDivideArgsException.class)
    public void divideByZeroTest() throws MyDivideArgsException {
        el.divide(0,0);
    }

    @Rule
    public ExpectedException exp = ExpectedException.none();

    @Test
    public void divideByZeroTest2() throws MyDivideArgsException {
        exp.expect(MyDivideArgsException.class);
        //exp.expectMessage("Index: 0, Size: 0");
        el.divide(0,0);

        exp.expect(MyDivideArgsException.class);
        el.divide(10,0);

        exp.expect(MyDivideArgsException.class);
        el.divide(0,10);
    }

    @Test
    public void testExceptionMessage() {
        try {
            el.divide(0,10);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (MyDivideArgsException ex) {
            assertThat(ex.getMySpecialMessage(), is("!!!!!This is very bad exception!!!"));
        }
    }
}
