package edu.kodzhebash.hillelLessons.Hillel2;

public class HomeWork4 {
    public static void main(String[] args) {
        TaskOne();
        TaskTwo();
        TaskThree();
        TaskFour();
        int[] array = new int[15];
        printArray(array);
        initArray(array);
        System.out.println("");
        System.out.println(TaskFive(array,5));
        TaskSix(array);
        TaskSeven(array);
        TaskEight();
        TaskNine(11);
        TaskTen(array);


    }

    public static void TaskOne() {
        for (int i = 1000; i < 10000; i += 3) {
            System.out.print("1st - " + i + " ");
        }
    }

    public static void TaskTwo() {
        int number = 1;
        System.out.println(" ");
        for ( int i = 0; i < 55; i++){
            System.out.print("2nd - "+ number + " ");
            number+=2;
        }
    }
    public static void TaskThree(){
        System.out.println(" ");
        for (int i = 90; i >=0; i-=5){
            System.out.print("3rd - " + i + " ");
        }
    }

    public static void TaskFour(){
        int number = 2;
    System.out.println( " ");
        for (int i = 0; i <=20; i++){
            System.out.print("4th - " + number + " ");
            number *=2;
        }
    }

    public static int TaskFive(int[] array, int number){
        int sum = 0;
        for( int i = 0; i < number; i++){
            sum += array[i];
        }
        return sum;

    }
    static int[] initArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
    static void printArray(int[] array) {
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("5th - " + array[i] + " ");
        }
    }

    public static void TaskSix(int[] array) {
        int min = array[0], max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        System.out.println("6th - " + "min - " + min + " max - " + max);
    }

    public static void TaskSeven(int[] array) {
        int ChetSum = 0;
        int NeChetSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) ChetSum += array[i];
            else NeChetSum += array[i];
        }
        System.out.println("7th - " + "Summa Chet: " + ChetSum + " Summa Ne Chet: " + NeChetSum);
    }

    public static void TaskEight() {
        int FirstPart, SecondPart;
        for (int i = 100000; i <= 999999; i++) {
            FirstPart = i / 1000;
            SecondPart = i % 1000;
            if ((FirstPart / 100) + (FirstPart % 10) + (FirstPart % 100 / 10) == (SecondPart / 100) + (SecondPart % 10) + (SecondPart % 100 / 10))
                System.out.println("8th - " + "All Lucky Numbers: " + i);
        }
    }

    public static void TaskNine(int a) {
        int i, b;
        while(a !=0 ) {
            b = a%2;
            System.out.println("9th - "+ "Binar code: "+ b);
            a = a/2;
        }
    }

    public static void TaskTen(int[] array) {
        int min = array[0];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (count == 5) return;
            if (array[i] == min) {
                System.out.println("10th - " + array[i]);
                count++;
            }
        }
    }

}
