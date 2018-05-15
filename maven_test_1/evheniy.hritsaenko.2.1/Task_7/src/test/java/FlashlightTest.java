import static junit.framework.TestCase.*;
import org.junit.Test;

public class FlashlightTest {

    @Test
    public void addBatteryTest(){
        assertTrue(new FlashlightImpl(0).addBattery(-1) >= 0);
        assertTrue(new FlashlightImpl(0).addBattery(1) >= 0);
    }

    @Test
    public void shineWhiteTest(){
        assertFalse(new FlashlightImpl(0).shineWhite());
        assertTrue(new FlashlightImpl(1).shineWhite());
        assertTrue(new FlashlightImpl(2).shineWhite());
        assertTrue(new FlashlightImpl(3).shineWhite());
    }

    @Test
    public void shineRedTest(){
        assertFalse(new FlashlightImpl(0).shineRed());
        assertFalse(new FlashlightImpl(1).shineRed());
        assertTrue(new FlashlightImpl(2).shineRed());
        assertTrue(new FlashlightImpl(3).shineRed());
    }

    @Test
    public void blinkTest(){
        assertFalse(new FlashlightImpl(0).blink());
        assertFalse(new FlashlightImpl(1).blink());
        assertFalse(new FlashlightImpl(2).blink());
        assertTrue(new FlashlightImpl(3).blink());
    }
}
