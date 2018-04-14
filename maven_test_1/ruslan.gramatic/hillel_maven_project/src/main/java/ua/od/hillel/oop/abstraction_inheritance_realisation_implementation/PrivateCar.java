package ua.od.hillel.oop.abstraction_inheritance_realisation_implementation;

import ua.od.hillel.oop.abstraction_inheritance_realisation_implementation.interfaces.GroundVechicle;

/**
 * Created by ruslangramatic on 4/1/18.
 */
public abstract class PrivateCar implements GroundVechicle {
    public void move(float fromX, float fromY, float toX, float toY) {
        System.out.println("My task to move: " + ": "+ fromX + ": "+ fromY + ": " + ": " + toX + ": " + toY);
    }

    public int getNumberOfWheel() {
        return 4;
    }

    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car sopped");
    }

    public abstract int getNumberOfPassengers();
}
