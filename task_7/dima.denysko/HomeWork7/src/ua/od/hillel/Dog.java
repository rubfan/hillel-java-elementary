package ua.od.hillel;
/**
 * Created by dmytro.denysko on 23.03.2018.
 */
public class Dog extends Animal {
    private int speed;

    public Dog(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public void feed() {
        super.feed();
        super.stomach += 15;
        System.out.println("Very Yammy");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" and have speed " + speed);
    }
}
