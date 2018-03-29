package ua.od.hillel;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// first task;
        int[] arrayTest = {5, 1, 9, 12, 7};
        sort(arrayTest);

        //second task
        int[] c = IntStream.concat(IntStream.of(1, 3, 5),IntStream.of(2, 4, 8, 9, 12)).toArray();
        sort(c);
        //third task

    /*    public class Algorithm {
            public static void main(String[] args) {
                int k = 0;
                int n = 10;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        for (int z = j + 1; z < n; z++) {
                            k++;
                        }
                    }
                }
                System.out.println("The result is " + k);
            }
        }
        Сложность O(n) = n*n*(n-1)
        */



        // fourth task;
        findSameSumma(arrayTest, 12);

    }

    //Время О(n!)
    public static void sort (int[] array){
        for(int i=0; i<array.length;i++){
            int temp = 0;
            for(int j=i+1; j<array.length;j++){
                if(array[i]>array[j]){
                    temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;

                }
            }

        }
    }

    public static boolean findSameSumma (int[] array, int sum){
        for(int i=0; i<array.length-1;i++){
            for(int j=i+1; array[j]<sum && j < array.length;j++){
                if(array[i]+ array[j]==sum){
                    System.out.println(array[i] + " + " + array[j] + " = " + sum);
                    return true;

                }

            }

        }
        System.out.println("Nothing was found...");
        return false;
    }
}
