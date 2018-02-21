package edu.kodzhebash.hillelLessons.Hillel2;

public class First {
    public static void main(String[]args){
        int N = 3;
        int[] array1 = new int[N];
        initArray(array1);
        printArray(array1);
        System.out.println("Min ---->" + min(array1));
    }
    static void initArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);

        }
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();

    }
    static int min( int [] array1) {
        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        return min;
    }
}
