package ua.od.hillel;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        sortingTime();
        thirdArray();
        getSum();
    }

    //===========================================================

    private static void sortingTime() {

        int[] arr1 = randArray();
        //printArray(arr1);
        int[] arr2 = randArray();
        //printArray(arr2);

        long startTime1 = System.currentTimeMillis();
        sortArr(arr1);
        long timeSpent1 = System.currentTimeMillis() - startTime1;
        //printArray(arr1);
        System.out.println("First array["+arr1.length+"] was sorted in "+timeSpent1+" ms.");

        long startTime2 = System.currentTimeMillis();
        sortArr(arr2);
        long timeSpent2 = System.currentTimeMillis() - startTime2;
        //printArray(arr2);
        System.out.println("Second array["+arr2.length+"] was sorted in "+timeSpent2+" ms.");

    }

        //=============================================================
    private static void thirdArray() {
        System.out.println("first array");
        int[] firstArr = randArraySort();
        System.out.println("second array");
        int[] secondArr = randArraySort();

        int[] result = new int[firstArr.length+secondArr.length];
        for (int i = 0; i < firstArr.length; i++) {
            result[i] = firstArr[i];
        }
        for (int i = 0; i < secondArr.length; i++) {
            result[i+firstArr.length] = secondArr[i];
        }
        Arrays.sort(result);
        printArray(firstArr);
        printArray(secondArr);
        printArray(result);
    }

        //=============================================================

        /*

    Определите сложность следующего алгоритма: O(n)=n*(n-1)*(n-2)

        public class Algorithm {
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
        */
        //=================================================================

    private static void getSum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the sum to find");
        int sum = scan.nextInt();

        int[] arr = randArraySort();
        printArray(arr);

        int checksum = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>sum) {
                checksum = i;
                break;
            }
        }

        for (int i = 0; i <= checksum; i++) {
            for (int j = i+1; j <= checksum; j++) {
                //System.out.println(i+" "+j);
                if (arr[i] + arr[j] == sum) {
                    System.out.println("True. At least we have "+arr[i]+" + "+arr[j]+" = "+sum);
                    return;
                }
            }
        }
        System.out.println("False. Cannot get the sum");
    }

    //====================================================

    private static int[] randArraySort() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int)(Math.random()*50);
        }
        Arrays.sort(result);
        return result;
    }

    private static int[] randArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int)(Math.random()*50);
        }
        return result;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    private static void sortArr(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j]<arr[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
