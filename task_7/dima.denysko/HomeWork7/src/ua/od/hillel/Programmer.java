package ua.od.hillel;
/**
 * Created by dmytro.denysko on 15.03.2018.
 */
public class Programmer {
    private String name;
    private String level;
    private int skill;
    private int stress;
    private int money;
    private boolean books;
    private boolean isLive;

    public Programmer(String name) {
        this.name = name;
        level = "Vilna Kassa";
        money = 100;
        isLive = true;
    }

    private boolean checkMoney(int money){
        if (this.money < money) {
            System.out.println("Sorry, not enough minerals:)");
            return false;
        } else
            return true;

    }

    private void checkLevel() {
        if (skill >= 30 && skill < 60) level = "Junior";
        else if (skill >= 60 && skill < 100) level = "Middle";
        else if(skill >= 100) level = "Senior";
    }

    private boolean chekALive() {
        if (stress >= 100) {
            isLive = false;
            System.out.println("You Dead\nGame Over");
        }
        return isLive;
    }

    public void showTotalInfo() {
        if (!chekALive()) return;
        System.out.println(name + " your Skill is " + skill + " and Level-" + level);
        System.out.println("Your stress is " + stress + "%");
        System.out.println("And money " + money);
    }

    public void buyBooks() {
        if (!chekALive()) return;
        if (books) {
            System.out.println("you already have a books");
            return;
        }
        if (!checkMoney(20)) {
            return;
        }
        money -= 20;
        books = true;
        System.out.println("You buy a books");
    }

    public void read() {
        if (!chekALive()) return;
        if (!books) {
            System.out.println("Go and buy a books");
            return;
        }
        if (skill >= 50) {
            System.out.println("you did not learn anything new");
            return;
        }
        stress += 20;
        if (!chekALive()) return;
        skill += 10;
        checkLevel();
    }

    public void goToHillelCourses() {
        if (!chekALive()) return;
        if (!checkMoney(120)) return;
        money -= 120;
        stress += 50;
        if (!chekALive()) return;
        skill += 40;
        checkLevel();
    }

    public void goToPub(){
        if (!chekALive()) return;
        if (!checkMoney(10)) return;
        money -= 10;
        stress = 0;
        System.out.println("I like a beer :)");
    }

    public void goToWork() {
        if (!chekALive()) return;
        switch (level) {
            case "Vilna Kassa":
                money += 30;
                stress += 40;
                System.out.println("McDonald's give you: 30 USD");
                break;
            case "Junior":
                money += 100;
                stress += 25;
                System.out.println("Good job, take 100 USD");
                break;
            case "Middle":
                money += 1000;
                stress += 15;
                System.out.println("Not Bad, take 1000 USD");
                break;
            case "Senior":
                money += 10000;
                stress = 0; //:)
                System.out.println("You slept well, take 10000 USD");
                break;
        }
        chekALive();
    }
}
