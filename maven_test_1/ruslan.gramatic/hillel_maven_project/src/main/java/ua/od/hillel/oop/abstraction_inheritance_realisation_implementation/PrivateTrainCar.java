package ua.od.hillel.oop.abstraction_inheritance_realisation_implementation;

import ua.od.hillel.oop.abstraction_inheritance_realisation_implementation.interfaces.TestGroundCargo;

/**
 * Created by ruslangramatic on 4/1/18.
 */
public class PrivateTrainCar extends PrivateCargoCar implements TestGroundCargo {

    public float maxWeight = 8;

    @Override
    public float getMaxWeight() {
        return maxWeight;
        //return super.getMaxWeight() + super.getMaxWeight();
    }

    @Override
    public int getNumberOfWheel() {
        return super.getNumberOfWheel() + super.getNumberOfWheel() + 2;
    }

    public int getNumberOfPassengers() {
        return 1;
    }
}
