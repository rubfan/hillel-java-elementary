package ua.od.hillel.animal;

public abstract class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    abstract void move();

    abstract void makeSound();

    public void setName(String name) {
        this.name = name;
    }
}
