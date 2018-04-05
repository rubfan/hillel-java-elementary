package ua.od.hillel;
/**
 * Created by dmytro.denysko on 23.03.2018.
 */
public class Purse {
    private int money;

    public Purse(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public void spendMoney(int money) {
        this.money -= money;
    }
}
