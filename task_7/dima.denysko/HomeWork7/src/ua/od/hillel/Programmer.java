package ua.od.hillel;

/**
 * Created by dmytro.denysko on 15.03.2018.
 */
public class Programmer {
    private String name;
    private String level;
    private int skill;
    private Animal animal;
    private int levelOfHappy;
    private int stress;
    private Purse purse;
    private Book[] books;
    private boolean isLive;
    protected Flashlight flashlight;
    private Girl girl;

    public Programmer(String name) {
        this.name = name;
        level = "Vilna Kassa";
        purse = new Purse(100);
        isLive = true;
    }

    public void findAGirl() {
        if (girl != null) {
            System.out.println("You have a girl " + girl.getName());
            return;
        }
        girl = new Girl("Anya");
    }

    public void goWithGirlWatchMovie() {
        if (girl == null) {
            System.out.println("Find a Girl, looser");
            return;
        }
        if (purse.getMoney() < 300) {
            System.out.println("Go to work - no cash");
            return;
        }
        purse.spendMoney(300);
        girl.addLevelOfAtanition(30);
        levelOfHappy += 10;
    }

    public void goToZooWithGirl() {
        if (girl == null) {
            System.out.println("Find a Girl, looser");
            return;
        }
        if (purse.getMoney() < 1000) {
            System.out.println("Go to work - no cash");
            return;
        }
        purse.spendMoney(1000);
        girl.addLevelOfAtanition(50);
        levelOfHappy += 20;

    }

    public void buyFlashlight() {
        if (flashlight != null) {
            System.out.println("You already buy a flashlight");
            return;
        }
        flashlight = new Flashlight("Fonarik");
        levelOfHappy += 10;
    }

    public void feedAnimal() {
        if (animal == null) {
            System.out.println("You need Buy Animal");
            return;
        }
        animal.feed();

    }

    public void showInfoAnimals() {
        if (animal == null) {
            System.out.println("Go and buy Animal");
            return;
        }
        animal.showInfo();

    }

    public void buyACat() {
        if (animal != null) {
            System.out.println("You already have an animal");
            return;
        }
        animal = new Cat("Murka", "Red");
        System.out.println("Mayyyyyy");
        levelOfHappy += 30;
    }

    public void buyADog() {
        if (animal != null) {
            System.out.println("You already have an animal");
            return;
        }
        animal = new Dog("Barbos", 100);
        System.out.println("Gaavvv");
        levelOfHappy += 30;
    }

    private boolean checkMoney(int money) {
        if (purse.getMoney() < money) {
            System.out.println("Sorry, not enough minerals:)");
            return false;
        } else
            return true;

    }

    private void checkLevel() {
        if (skill >= 30 && skill < 60) level = "Junior";
        else if (skill >= 60 && skill < 100) level = "Middle";
        else if (skill >= 100) level = "Senior";
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
        System.out.println("And money " + purse.getMoney());
        System.out.println("You happy on " + levelOfHappy + " percent");
        if (girl != null)
            System.out.println("Yor Girl " + girl.getName() + " happy on " + girl.getLevelOfAttention() + " percent");
        if (animal != null) System.out.println("Your Animal " + animal.name + " Hungry on " + animal.stomach);
    }

    public void buyBooks() {
        if (!chekALive()) return;
        if (books != null && books[2] != null) {
            System.out.println("you already have a books");
            return;
        }
        if (!checkMoney(20)) {
            return;
        }
        purse.spendMoney(20);
        if (books == null) {
            books = new Book[3];
            books[0] = new Book("Bruce Ekkel", "Philosophy Java");
            System.out.print("You buy book ");
            books[0].getInfo();
        } else if (books[1] == null) {
            books[1] = new Book("Joshua Bloch", "Effective Programming");
            System.out.print("You buy book ");
            books[1].getInfo();
        } else {
            books[2] = new Book("Robert Lafore", "Data structures and algorithms in Java");
            System.out.print("You buy book ");
            books[2].getInfo();
        }

    }

    public void readBook() {
        if (!chekALive()) return;
        if (books == null) {
            System.out.println("Go and buy a books");
            return;
        }
        if (skill >= 55) {
            System.out.println("You did not learn anything new");
            return;
        }
        if (girl != null) {
            if (girl.chekAttantion()) girl = null;
            else if (girl.getLevelOfAttention() < 30) girl = null;
            else girl.removeLevelOfAttention(30);
        }
        stress += 20;
        if (!chekALive()) return;
        if (books[0].checkPercent()) {
            books[0].readingBook();
            skill += 5;
            System.out.print("You read ");
            books[0].getInfo();
        } else if (books[1] == null) {
            System.out.println("Go and Buy next Book");
            return;
        } else if (books[1].checkPercent()) {
            books[1].readingBook();
            skill += 10;
            System.out.print("You read ");
            books[1].getInfo();
        } else if (books[2] == null) {
            System.out.println("Go and Buy next Book");
            return;
        } else if (books[2].checkPercent()) {
            books[2].readingBook();
            skill += 15;
            System.out.print("You read ");
            books[2].getInfo();
        }
        checkLevel();
    }

    public void goToHillelCourses() {
        if (!chekALive()) return;
        if (!checkMoney(120)) return;
        purse.spendMoney(120);
        stress += 50;
        if (!chekALive()) return;
        skill += 20;
        checkLevel();
    }

    public void goToPub() {
        if (!chekALive()) return;
        if (girl != null && girl.chekAttantion() && girl.getLevelOfAttention() < 30) {
            girl = null;
            System.out.println("Your Girl Leave you");
        } else if (girl != null && girl.getLevelOfAttention() > 30) {
            girl.removeLevelOfAttention(30);
        }
        if (!checkMoney(10)) return;
        purse.spendMoney(10);
        stress = 0;
        System.out.println("I like a beer :)");
    }

    public void goToWork() {
        if (!chekALive()) return;
        switch (level) {
            case "Vilna Kassa":
                purse.addMoney(30);
                stress += 40;
                System.out.println("McDonald's give you: 30 USD");
                break;
            case "Junior":
                purse.addMoney(100);
                stress += 25;
                System.out.println("Good job, take 100 USD");
                break;
            case "Middle":
                purse.addMoney(1000);
                stress += 15;
                System.out.println("Not Bad, take 1000 USD");
                break;
            case "Senior":
                purse.addMoney(10000);
                stress = 0; //:)
                System.out.println("You slept well, take 10000 USD");
                break;
        }
        chekALive();
    }
}
