package ua.od.hillel.animal;

public class Dog extends Animal implements Swimable {

    public Dog(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println("I run on 4 paws.");
    }

    @Override
    void makeSound() {
        System.out.println("Woof woof!!!");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
