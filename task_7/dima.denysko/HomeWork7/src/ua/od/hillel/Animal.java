package ua.od.hillel;

/**
 * Created by dmytro.denysko on 23.03.2018.
 */
public class Animal {
    protected String name;
    protected int stomach;

    public Animal(String name) {
        this.name = name;
    }

    public void feed() {
        if (checkStomach()) return;
        stomach += 30;
    }

    public void showInfo() {
        System.out.print(name + " " + "Hungry on " + stomach);
    }

    private boolean checkStomach() {
        if (stomach < 100) return false;
        else return true;
    }
}
