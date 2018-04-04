package ua.od.hillel.oop.abstraction_inheritance_realisation_implementation.interfaces;

/**
 * Created by ruslangramatic on 4/1/18.
 */
public interface FlyVehicle extends Vehicle {
    void move(float fromX, float fromY, float toX, float toY, float fromZ, float toZ);
    void callTrap();
}
