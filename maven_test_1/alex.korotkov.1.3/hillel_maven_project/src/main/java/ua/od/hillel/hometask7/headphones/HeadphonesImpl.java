package ua.od.hillel.hometask7.headphones;

public class HeadphonesImpl implements Headphones{

    boolean connectFlag = false;
    boolean onFlag = false;
    BatteryOfHeadphones battery;

    public HeadphonesImpl() {
       this.battery = new BatteryOfHeadphones();
        battery.showCharge();

    }


    public void onHeadphones() {
        battery.chargeLevel -=10;
        if( battery.chargeLevel>0){
            this.onFlag =true;
            System.out.println("Headphones ON");
            battery.showCharge();
        }
        else {
            System.out.println("Please charged your headphones");
            battery.showCharge();
            offHeadphones();
        }

    }

    public void offHeadphones() {
        battery.chargeLevel -=10;
        this.connectFlag = false;
        this.onFlag = false;
        System.out.println("Headphones OFF");
        battery.showCharge();

    }

    public void connect() {
        battery.chargeLevel -=10;
        if(onFlag==false){
            System.out.println("Please on your headphones before connection!!");
            battery.showCharge();
        }
        else if (onFlag == true  && connectFlag==false){
            System.out.println("Headphones connected");
            battery.showCharge();
            this.connectFlag = true;
        }
        else if (onFlag == true  && connectFlag==true){
            System.out.println("Your headphones are already connect, please disconnect it before new connection ");
            battery.showCharge();
        }

    }

    public void disconnect() {
        if(onFlag==false){
            System.out.println("You should ON your headphones before disconnection!!");
            battery.showCharge();
        }
        else {
            battery.chargeLevel -= 10;
            this.connectFlag = false;
            System.out.println("Headphones disconnected");
            battery.showCharge();
        }

    }

    public void charging() {
        battery.charge();
    }

    private class BatteryOfHeadphones {

        private float chargeLevel = 100;

        public void showCharge() {
            System.out.println("Battery = " + chargeLevel);


        }

        public void charge() {
            chargeLevel = 100;
            System.out.println("Your headphones has successful charged! battery = 100%");


        }
    }
}
