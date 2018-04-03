package ua.od.hillel;

import ua.od.hillel.tools.Calculator;

import java.util.stream.IntStream;

public class MyMainApp {

    public static void main(String[] args) {
        System.out.println("hello JAR!!!");
        Calculator calc = new Calculator();
        //System.out.println(calc.add(22, 33));

        IntStream.iterate(0,n->n+5)
            .limit(10).forEach(System.out::println);

//        IntStream.rangeClosed(0, 50)
//            .filter(n -> n % 5 == 0)
//            .forEach(System.out::println);
//
//        IntStream.rangeClosed(0, 10)
//            .flatMap(n -> IntStream.of(n * 5))
//            .forEach(System.out::println);

//        IntStream i = IntStream.generate(()->{return (int)(Math.random()*100);});
//        i.limit(10).forEach(System.out::println);
    }
}
