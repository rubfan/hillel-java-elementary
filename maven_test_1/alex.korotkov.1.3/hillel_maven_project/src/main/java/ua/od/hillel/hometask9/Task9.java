package ua.od.hillel.hometask9;

import java.util.stream.Stream;

public class Task9 {

    public static void main(String[] args) {

        //1
        System.out.println("Task1");
        System.out.println(characterCnange("person@gmail.com"));

        System.out.println("Task2");
        makeAbbreviation("internationalization localization cat elephant monitor");

        System.out.println("Task3");
        System.out.println("There are " + findPalindrom("deleveled, evitative, cat, dog, deified") + " palindromes in the text");

        System.out.println("Task4");
        translateToBinary(13);

    }



    /**1. Напишите программу, которая заменяет символы в почтовом адресе пользователя:

    @ заменяется на [ at ]
            . заменяется на [ dot ]

    Пример ввода:
    person@gmail.com
    Результат:
    person[ at ]gmail[ dot ]com
**/

    public static String characterCnange(String address){

        address = address.replaceAll("@", "[ at ]");
        address = address.replaceAll("\\.", "[ dot ]");
        return address;
    }

    /** 2. i18n используется для обозначения слова internationalization, где 18 означает количество букв между первой и последней в этом слове, такое можно встретить в среде разработчиков. Например, для слова localization используется сокращение l10n.
     Напишите функцию, которая преобразует слова введенные из консоли через пробел в сокращенную форму. Слова длиной меньше 4х оставить без изменений.

     Пример ввода:
     internationalization localization cat elephant monitor
     Результат:
     i18n l10n cat e6t m5r
     **/

    public static void makeAbbreviation(String word){

        Stream.of(word.split(" ")).forEach(x ->{
            if(x.length()>4) System.out.print((" " + x.charAt(0)) + (x.length()-2) + (x.charAt(x.length()-1) + " "));
            else System.out.print(x);});
        System.out.println("\n");

    }

    /**
     3. Определить является ли слово палиндромом, т.е. читается одинаково, слева направо и справа налево.
     Определить количество таких слов в тексте, в котором все слова введены через запятую.

     Пример ввода:
     deleveled, evitative, cat, dog, deified
     Результат:
     There are 3 palindromes in the text

     PS: используйте метод split c параметром "," и потом метод trim, чтобы удалить лишние пробелы слева и справа
     **/

    public static int findPalindrom(String word){
        int count = (int) Stream.of(word.split(","))
                .filter(x -> x.trim().equals(new StringBuilder(x.trim()).reverse().toString()))
                .count();
        return count;
    }

    /**
     4. Напишите перевод из 10ной системы счисления в 2ную с помощью рекурсии.
     */

    public static void translateToBinary(int decimalNumber){

        if(decimalNumber>1){
            translateToBinary(decimalNumber/2);
            System.out.print(decimalNumber%2);
        }
        else System.out.print(decimalNumber%2);
    }


}
