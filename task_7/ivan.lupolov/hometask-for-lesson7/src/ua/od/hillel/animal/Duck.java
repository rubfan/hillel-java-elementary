package ua.od.hillel.animal;

public class Duck extends Animal implements Flyable, Swimable {

    public Duck(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println("I walk on 2 legs");
    }

    @Override
    void makeSound() {
        System.out.println("Quack quack!!!");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
