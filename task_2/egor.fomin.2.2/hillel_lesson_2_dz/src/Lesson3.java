/**
 * Created by egorf on 19.02.2018.
 */
public class Lesson3 {
    /**Main method*/
    public static void main(String [] args){
        minOfThreeNumbers(98,44,43); //#1
        minAndMaxOfThreeNumbers(32,45,67);//#2
        neskolkoMinVThreeNumbers(35,34,65);//#3 not work
        chetNechet(7);//#4
        divisionWhole(12,6);//#5
        closeToTen(9, 22);//#6
        costForFlat(8);//#7
    }
    /**1)Найти минимальное из трёх чисел*/
    public static void minOfThreeNumbers(int n1, int n2, int n3) {
        System.out.println("1)Найти минимальное из трёх чисел");
        int min = (n1 < n2 && n1 < n3) ? n1 : (n2 < n1 && n2 < n3) ? n2 : n3;
        System.out.println("min: " + min + " from: " + n1 + ", " + n2 + " ,"+  n3);
    }
    /**2)Найти среди 3х чисел максимальное и минимальное*/
    public static void minAndMaxOfThreeNumbers(int n1, int n2, int n3){
        System.out.println("2)Найти среди 3х чисел максимальное и минимальное");
        int min = (n1 < n2 && n1 < n3) ? n1 : (n2 < n1 && n2 < n3) ? n2 : n3;
        System.out.println("min: " + min + " from: " + n1 + ", " + n2 + " ,"+  n3);
        int max = (n1 > n2 && n1 > n3) ? n1 : (n2 > n1 && n2 > n3) ? n2 : n3;
        System.out.println("max: " + max + " from: " + n1 + ", " + n2 + " ,"+  n3);
    }
    /**3)Найти минимальное из 3х чисел, причем,
     *   если минимальных несколько вывести все такие числа*/
    public static void neskolkoMinVThreeNumbers (int n1,  int n2, int n3){
        System.out.println("3)Найти минимальное из 3х чисел, причем,если минимальных несколько вывести все такие числа");
        int min = (n1 < n2 && n1 < n3) ? n1 : (n2 < n1 && n2 < n3) ? n2 : n3;
        System.out.println("min: " + min + " from: " + n1 + ", " + n2 + " ,"+  n3);
    }
    /**4) Написать программу, которая проверит, является ли число четным или нечётным*/
    public static void chetNechet (int n){
        System.out.println("4) Является ли число чётным? ");
        System.out.println((n & 1) == 0 ? "чётное" : "нечётное");
    }
    /**5) Даны 2 числа, определить делится ли первое число на второе без остатка*/
    public static void divisionWhole (int n1, int n2){
        System.out.println("5) Даны 2 числа, определить делится ли первое число на второе без остатка");
        System.out.println((n1 % n2) > 0 ? "не делится нацело" : "делится нацело");
    }

    /**6) Найти ближайшее к 10 из 2х заданных чисел.
     *    Например, среди чисел 8 и 11 ближайшее к десяти 11*/
    public static void closeToTen (int n1, int n2){
        System.out.println("6) Найти из 2х чисел ближайшее к 10");
        int a=10;
        double b=Math.abs(a-n1);
        double c=Math.abs(a-n2);
        if (b==c){
            System.out.println("Числа " +n1 +" и " +n2 + " равноудалены от " + a);
        }
        if(b>c){
            System.out.println("Число "+ n2 +" ближе к " + a);
        }
        if (b<c) {
            System.out.println("Число "+ n1 +" ближе к " + a);
        }
    }


    /**7) Посчитайте, сколько будет стоить аренда квартиры за заданное число дней,
     * если известно, что за 1 день ее стоимость 40 грн.
     * Причем, если съемщик прожил в ней больше 5 дней, он получит скидку 20 грн,
     * а если больше 7 дней, то скидка составит 50 грн.*/

    public static void costForFlat(int days){
       // int cost = (d > 7)? (d*40)-50 :(d > 5)? (d*40)-20 : d*40;
        System.out.println("7) Кварплата ");
        int cost = days*40;
        if (days > 5 && days < 7){
             cost = cost-20;
        }
        else if (days > 7){
            cost = cost-50;
        }
        System.out.println("Итоговая стоимость = " + cost);
    }
}
