package ua.od.hillel.HW8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HW6methodsTest {

    private HW6methods hw6;

    @Before
    public void init() {
        hw6 = new HW6methods();
    }

    @Test
    public void thirdArrayTest() {
        int[] arr1 = hw6.createArray(5);
        hw6.printArray(arr1);
        int[] arr2 = hw6.createArray(10);
        hw6.printArray(arr2);
        int[] arr3 = hw6.thirdArray(arr1, arr2);
        hw6.printArray(arr3);
        assertTrue((arr1.length + arr2.length) == arr3.length);
        assertTrue((hw6.sumArray(arr1) + hw6.sumArray(arr2)) == hw6.sumArray(arr3));
    }

    @Test
    public void getSumTest() {
        int[] arr = {1,3,6,8,10};
        hw6.printArray(arr);
        assertTrue(hw6.getSum(arr,11));
        assertFalse(hw6.getSum(arr,15));
    }
}
