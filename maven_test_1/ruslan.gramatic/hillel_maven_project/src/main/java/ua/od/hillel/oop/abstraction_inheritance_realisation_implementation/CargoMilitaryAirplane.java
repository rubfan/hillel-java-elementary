package ua.od.hillel.oop.abstraction_inheritance_realisation_implementation;

import ua.od.hillel.oop.abstraction_inheritance_realisation_implementation.interfaces.Cargo;
import ua.od.hillel.oop.abstraction_inheritance_realisation_implementation.interfaces.FlyVehicle;
import ua.od.hillel.oop.abstraction_inheritance_realisation_implementation.interfaces.MilitaryAbilities;

/**
 * Created by ruslangramatic on 4/1/18.
 */
public class CargoMilitaryAirplane implements Cargo, FlyVehicle, MilitaryAbilities {
    private float fromX;
    private float fromY;
    private float toX;
    private float toY;
    private float fromZ;
    private float toZ;

    public float getMaxWeight() {
        return 20;
    }

    public int getNumberOfGuns() {
        return 2;
    }

    public void setTarget(float x, float y, float z) {
        System.out.println("Cargo Airplane started" + ": "+ x + ": "+ y + ": " + ": " + z + ": ");
    }

    public void move(float fromX, float fromY, float toX, float toY) {
        System.out.println("Cargo Airplane started" + ": "+ fromX + ": "+ fromY + ": " + ": " + toX + ": " + toY);
    }

    public void move(float fromX, float fromY, float toX, float toY, float fromZ, float toZ) {
        System.out.println("Cargo Airplane started" + ": "+ fromX + ": "+ fromY + ": " + ": " + toX + ": " + toY);
        this.fromX = fromX;
        this.fromY = fromY;
        this.toX = toX;
        this.toY = toY;
        this.fromZ = fromZ;
        this.toZ = fromZ;
    }

    public int getNumberOfWheel() {
        return 10;
    }

    public void start() {
        System.out.println("Cargo Airplane started");
        runAllTasks();
    }

    public void stop() {
        System.out.println("Cargo Airplane stopped");
    }

    public void callTrap() {
        System.out.println("Auuu!!! Trapp!!!");
    }

    private void runAllTasks() {
        this.move(10,20, 20, 30);
        this.move(20,30, 200, 30, 0, 5000);
        this.getMaxWeight();
        this.getNumberOfGuns();
        this.getNumberOfWheel();
        this.setTarget(1000,1000, 6000);
        this.move(1000,1000, 200, 30, 6000, 0);
        this.move(10,20, 20, 30);
    }
}
