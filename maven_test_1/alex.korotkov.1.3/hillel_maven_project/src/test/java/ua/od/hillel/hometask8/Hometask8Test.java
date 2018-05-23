package ua.od.hillel.hometask8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Hometask8Test {



    @Test
    public void addArraysTest() {
        int[] arrayTest = MethodsForTask8.arraysAdd(new int[]{1, 3, 5}, new int[]{2, 4, 8, 9, 12});

        assertEquals(arrayTest.length,8);
        assertTrue(arrayTest[0]<=arrayTest[arrayTest.length-1]);

    }

    @Test
    public void findSameSummaTest() {
        int[] arrayTest = {5, 1, 9, 12, 7};
        boolean checkFlag1 = MethodsForTask8.findSameSumma(arrayTest, 10 );
        boolean checkFlag2 = MethodsForTask8.findSameSumma(arrayTest, 12 );
        boolean checkFlag3 = MethodsForTask8.findSameSumma(arrayTest, 7 );
        assertTrue(checkFlag1);
        assertTrue(checkFlag2);
        assertFalse(checkFlag3);


    }
}
