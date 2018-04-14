package ua.od.hillel;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        /**Task 1*/
        int[] sortArray = selectionSort(new int[]{1,84,0,8,73,457,-84,3,-7,3});

        for (int i = 0; i < sortArray.length; i++) {
            System.out.print(sortArray[i] + " ");
        }

        /**Task 2*/
        int[] arr1 = {3,4,5};
        int[] arr2 = {7,8,9,10};

        int[] mergeArray = mergeArray(arr1, arr2);

        for (int i = 0; i < mergeArray.length; i++) {
            System.out.print(mergeArray[i] + " ");
        }

        /**Task 3*/
        testAlgorithm();

        /**Task 4*/
        System.out.println(sumExists(30,new int[]{1, 5, 7, 9, 12, 24,25,26,50}));
    }

    /**Task 1 - Сложность данного алгоритма ~ O(n^2)*/
    public static int[] selectionSort(int[] array) {

        int min;
        int index;
        int tmp;


        for (int i = 0; i < array.length; i++) {
            min = array[i];
            index = i;
            for (int j = i; j < array.length; j++) {
                if(array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            tmp = array[i];
            array[i] = min;
            array[index] = tmp;
        }

        return array;
    }

    /**Task 2*/
    public static int[] mergeArray(int[] arr1, int[] arr2) {

        int len1 = arr1.length;
        int len2 = arr2.length;

        if(arr1[len1 -1] < arr2[0]) {
            int[] sumArr = Arrays.copyOf(arr1,len1 + len2);
            System.arraycopy(arr2,0,sumArr,len1,len2);
            return sumArr;
        } else {
            int[] sumArr = Arrays.copyOf(arr1,len1 + len2);
            System.arraycopy(arr2,0,sumArr,len1,len2);
            return selectionSort(sumArr);
        }
    }

    /** Task 3 - Сложность данного алгоритма ~ O(n^3)*/
    public static void testAlgorithm() {
        int k = 0;
        int n = 200;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int z = j + 1; z < n; z++) {
                    k++;
                }
            }
        }
        System.out.println("The result is " + k);
    }

    /** Task 4*/
    public static boolean sumExists(int sum, int[] arr) {

        for (int i = 0; i < arr.length; i++) { //обрежем массив дабы сократить количество операций на следущем шаге.
            if(arr[i] >= sum) {
                arr = Arrays.copyOf(arr, i+1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; arr[j] < arr.length; j++) {
                if (arr[i]+arr[j] == sum && j!=i)
                    return true;
            }
        }
        return false;
    }
}