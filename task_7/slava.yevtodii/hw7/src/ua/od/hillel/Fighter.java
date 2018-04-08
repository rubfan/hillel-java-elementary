package ua.od.hillel;

public class Fighter {

    public String name = "Fighter";
    public int power = 0;

    public void training() {
        System.out.println("Training starts!");
        running();
        swimming();
        pushingUp();
        visitGym();
        System.out.println("Good job! " + name + " is much more stronger now");
    }

    public void training(String trainingMode) {
        switch (trainingMode) {
            case "light":
                System.out.println("Lets train a little");
                running();
                pushingUp();
                System.out.println("Finished! " + name + " has become little bit stronger");
                break;
            case "hard":
                System.out.println("Lets train a lot!!!");
                running();
                pushingUp();
                running();
                visitGym();
                swimming();
                pushingUp();
                running();
                System.out.println("Finished! " + name + " has become an iron man!!!!!!!");
                break;
        }

    }

    private void running() {
        System.out.println(name + " is running!");
        power += 5;
    }

    private void swimming() {
        System.out.println(name + " is swimming!");
        power += 5;
    }

    private void pushingUp() {
        System.out.println(name + " is pushing-up!");
        power += 5;
    }

    private void visitGym() {
        System.out.println(name + " is training in the gym!");
        power += 5;
    }

    public void battle(Frankenstein opponent) {
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!\nIt is " + name + " vs " + opponent.name + "!\nLet the battle begin!");
        System.out.println(name + "'s power = " + power);
        System.out.println(opponent.name + "'s power = " + opponent.power);

        if (power > opponent.power) {
            System.out.println(name + " defeated " + opponent.name + "! He saved the world! Thanks God");
        }
        else if (power < opponent.power) {
            System.out.println(opponent.name + " defeated " + name + "... Now nobody can stop him from destroying this world...");
        }
        else {
            System.out.println("Equal powers!!!");
            double luck = Math.random();
            if (luck < 0.5) {
                System.out.println(name + " has more luck! He won...");
            }
            else {
                System.out.println(opponent.name + " has more luck... Unfortunately he won...");
            }
        }

    }

    public void rest() {
        System.out.println("Need some rest");
        sleeping();
    }

    private void sleeping() {
        System.out.println(name + " is sleeping");
        power += 50;
    }
}
