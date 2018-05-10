package ua.od.hillel;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.*;

public class MethodsTest {
    Methods methods;

    @Before
    public void init(){
        methods = new Methods();
    }

    @Test
    public void mergeArrayTest(){
        int[] arr1 = {2,3,6,9};
        int[] arr2 = {-5,4,8};
        assertTrue(Arrays.equals(new int[]{-5,2,3,4,6,8,9},methods.mergeArray(arr1,arr2)));
    }

    @Test
    public void sumExistsTest() {
        assertTrue(methods.sumExists(13, new int[]{-1,0,2,5,14,58,78}));
        assertFalse(methods.sumExists(8, new int[]{-1,0,2,5,14,58,78}));
    }
}
