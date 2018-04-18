package ua.od.hillel.HW8;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FlashlightTest {

    private Flashlight flashTest;

    @Before
    public void init() {
        flashTest = new Flashlight();
    }

    @Test
    public void batteryNumTest() {
        assertTrue(flashTest.getBattery() == 0);
        flashTest.addBattery(2);
        assertTrue(flashTest.getBattery() == 2);
        flashTest.removeBattery(1);
        assertTrue(flashTest.getBattery() == 1);
    }

    @Test
    public void nameTest() {
      assertFalse(flashTest.getName().equals("FIRST"));
      flashTest.setName("FIRST");
      assertTrue(flashTest.getName().equals("FIRST"));
    }

    @Test
    public void colorTest() {
        flashTest.setColor("white");
        assertTrue(flashTest.getColor().equals("white"));
        flashTest.setColor("green");
        assertTrue(flashTest.getColor().equals("white"));
        flashTest.setColor("red");
        assertTrue(flashTest.getColor().equals("red"));
        flashTest.changeColor();
        assertFalse(flashTest.getColor().equals("white"));
        flashTest.setBattery(2);
        flashTest.changeColor();
        assertTrue(flashTest.getColor().equals("white"));
    }

    @Test
    public void blinkTest() {
        assertFalse(flashTest.blinking());
        flashTest.setBattery(3);
        assertFalse(flashTest.blinking());
        flashTest.turnOn();
        assertTrue(flashTest.blinking());
        flashTest.removeBattery(1);
        assertFalse(flashTest.blinking());
    }

    @Test
    public void workingTest() {
        assertFalse(flashTest.working());
        flashTest.setBattery(1);
        assertFalse(flashTest.working());
        flashTest.turnOn();
        assertTrue(flashTest.working());
        flashTest.setColor("red");
        assertFalse(flashTest.working());
        flashTest.setColor("white");
        flashTest.addBattery(1);
        flashTest.changeColor();
        assertTrue(flashTest.working());
    }

}
