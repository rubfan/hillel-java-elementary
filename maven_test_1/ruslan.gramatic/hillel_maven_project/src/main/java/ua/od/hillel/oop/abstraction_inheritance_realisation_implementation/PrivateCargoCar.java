package ua.od.hillel.oop.abstraction_inheritance_realisation_implementation;

import ua.od.hillel.oop.abstraction_inheritance_realisation_implementation.interfaces.Cargo;

/**
 * Created by ruslangramatic on 4/1/18.
 */
public class PrivateCargoCar extends PrivateCar implements Cargo {

    public float maxWeight = 4;

    public float getMaxWeight() {
        return maxWeight;
    }

    @Override
    public void start() {
        System.out.println("Cargo car start!");
    }

    public int getNumberOfPassengers() {
        return 2;
    }

}
