package ua.od.hillel;
/**
 * Created by dmytro.denysko on 15.03.2018.
 */
public class Monster {
    private String name;
    private int stomach;

    public Monster(String name) {
        this.name = name;
    }

    public void showStomach() {
        System.out.println(name + " Stomach is " + stomach + " %");
    }

    public void eatPeople() {
        if (stomach > 90) {
            System.out.println("Im not hungry");
            return;
        }
        stomach += 10;
        System.out.println("Mmm, tasty");
    }

    public void goToWC() {
        if (stomach < 30) {
            System.out.println("I do not want");
            return;
        }
        stomach -= 30;
        System.out.println("shhhhhhh");
    }
}
