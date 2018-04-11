package ua.od.hillel.hometask8;

import org.junit.Before;
import org.junit.Test;
import ua.od.hillel.hometask7.lamp.SimpleLampImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LampTest {
    private SimpleLampImpl lamp1;
    private SimpleLampImpl lamp2;
    private SimpleLampImpl lamp3;
    private SimpleLampImpl lamp4;
    private SimpleLampImpl lamp5;



    @Before
    public void init(){
        this.lamp1 = new SimpleLampImpl();
        this.lamp2 = new SimpleLampImpl(3);
        this.lamp3 = new SimpleLampImpl(1);
        this.lamp4 = new SimpleLampImpl(2);
        this.lamp5 = new SimpleLampImpl(3);


    }

    @Test
    public void showQtyOfBatteryTest() {
        assertEquals(lamp1.showQtyOfBattery(), 0);
        assertEquals(lamp2.showQtyOfBattery(),3);
    }

    @Test
    public void insertBatteryTest() {
        lamp1.insertBattery(2);
        assertEquals(lamp1.showQtyOfBattery(), 2);
    }
    @Test
    public void removeBatteryTest() {
        lamp2.removeBattery(2);
        assertEquals(lamp2.showQtyOfBattery(), 1);
    }
    @Test
    public void shineWhiteStarTest() {
        assertFalse(lamp1.shineWhiteStart());
        assertTrue(lamp3.shineWhiteStart());
        assertTrue(lamp4.shineWhiteStart());
        assertTrue(lamp5.shineWhiteStart());
    }
    @Test
    public void shineRedStartTest() {
        assertFalse(lamp3.shineRedStart());
        assertTrue(lamp4.shineRedStart());
        assertTrue(lamp5.shineRedStart());

    }
    @Test
    public void shineBlinkStart() {
        assertFalse(lamp3.shineBlinkStart());
        assertFalse(lamp4.shineBlinkStart());
        assertTrue(lamp5.shineBlinkStart());

    }
    @Test
    public void shineStop() {
        assertTrue(lamp1.shineStop());

    }

}
