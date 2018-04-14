public class GoodFlashlight {

    public static void main(String[] args) {

        FlashlightImpl flashinght1 = new FlashlightImpl();
        flashinght1.addBattery(2);
        flashinght1.blink();
        flashinght1.addBattery(3);
        flashinght1.addBattery(1);
        flashinght1.blink();
        flashinght1.shineRed();
        flashinght1.shineWhite();
        System.out.println(flashinght1.getAmtBattery());
        System.out.println(flashinght1.getName());
    }
}
