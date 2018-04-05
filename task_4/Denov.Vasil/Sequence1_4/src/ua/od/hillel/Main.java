package ua.od.hillel;

import java.util.stream.IntStream;

public class Main {
    /*
     Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128
     */

    public static void main(String[] args)
    {

        int k=0;


        IntStream.iterate(1000,n->n+3)
                .limit((10000-1000)/3).forEach(System.out::println);

        System.out.println("=========");






        IntStream.iterate(1, i -> i + 2)
                .limit(55).forEach(System.out::println);

        System.out.println("=========");


        IntStream.iterate(90, n->n-5)
                .limit(18).forEach(System.out::println);
        System.out.println("++++++++++++++++");



// Map не работает с Math.pow и Integer count=count*n;
//        Integer count=new Integer(1);
//        IntStream.rangeClosed(1, 20)
//                .flatMap(n -> IntStream.of(count=n*count))
//                .forEach(System.out::println);


        for (int i = 1; i <21 ; i++) {

            k=(int)Math.pow(2, i);
            System.out.print(k+ " ");
        }
 }




    }
