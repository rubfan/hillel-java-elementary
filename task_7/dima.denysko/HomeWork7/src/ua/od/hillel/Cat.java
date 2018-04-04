package ua.od.hillel;
/**
 * Created by dmytro.denysko on 23.03.2018.
 */
public class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void feed() {
        super.feed();
        super.stomach += 5;
        System.out.println("Very Yammy!!!");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" and color " + color);
    }
}
