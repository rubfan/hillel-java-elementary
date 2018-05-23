package ua.od.hillel.hometask7.headphones;

public class HeadphonesObj {

    public static void main(String[] args) {
        Headphones headphones = new HeadphonesImpl();
        headphones.connect();
        headphones.onHeadphones();
        headphones.connect();
        headphones.connect();
        headphones.disconnect();
        headphones.connect();
        headphones.charging();
        headphones.offHeadphones();



    }

}
