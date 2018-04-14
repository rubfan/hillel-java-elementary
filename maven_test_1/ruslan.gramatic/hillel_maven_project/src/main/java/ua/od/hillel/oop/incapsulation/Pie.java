package ua.od.hillel.oop.incapsulation;

/**
 * Created by ruslangramatic on 4/1/18.
 */
public interface Pie {

    static final float DEFAULT_COST = 50;
    static final float DEFAULT_FLOUR_AMOUNT = 500;

    void createPie();
    float getCost();
}
