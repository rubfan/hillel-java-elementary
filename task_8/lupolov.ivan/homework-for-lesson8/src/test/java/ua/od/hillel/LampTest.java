package ua.od.hillel;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class LampTest {

    Lamp l0;
    Lamp l1;
    Lamp l2;
    Lamp l3;

    @Before
    public void init() {
        l0 = new Lamp();
        l1 = new Lamp(1);
        l2 = new Lamp(2);
        l3 = new Lamp(3);
    }

    @Test
    public void lightWhiteTest() {
        assertFalse(l0.lightWhite(true));
        assertFalse(l0.lightWhite(false));

        assertFalse(l1.lightWhite(true));
        assertTrue(l1.lightWhite(false));

        assertFalse(l2.lightWhite(true));
        assertTrue(l2.lightWhite(false));

        assertTrue(l3.lightWhite(true));
        assertTrue(l3.lightWhite(false));
    }

    @Test
    public void lightRedTest() {
        assertFalse(l0.lightRed(true));
        assertFalse(l0.lightRed(false));

        assertFalse(l1.lightRed(true));
        assertFalse(l1.lightRed(false));

        assertFalse(l2.lightRed(true));
        assertTrue(l2.lightRed(false));

        assertTrue(l3.lightRed(true));
        assertTrue(l3.lightRed(false));
    }

    @Test
    public void setBatteryTest() {
        l0.setBattery(1);
        assertTrue(l0.getBattery() == 1);
        l0.setBattery(4);
        assertTrue(l0.getBattery() == 1);
        l0.setBattery(0);
        assertTrue(l0.getBattery() == 0);
    }

    @Test
    public void getBatteryTest() {
        assertTrue(l0.getBattery() == 0);
        assertTrue(l1.getBattery() == 1);
        assertTrue(l2.getBattery() == 2);
        assertTrue(l3.getBattery() == 3);
    }
}
