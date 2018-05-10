package ua.od.hillel.animal;

public class AnimalTest {

    public static void main(String[] args) {
        Dog dog = new Dog("Lucky");
        Duck duck = new Duck("Donald");


        System.out.println("========== Dog ==========");
        dog.eat();
        dog.move();
        dog.sleep();
        dog.makeSound();
        dog.swim();

        System.out.println("========== Duck ==========");
        duck.eat();
        duck.move();
        duck.fly();
        duck.makeSound();
        duck.swim();
        duck.sleep();
    }
}
