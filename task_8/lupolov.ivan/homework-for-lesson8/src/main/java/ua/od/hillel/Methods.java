package ua.od.hillel;

import java.util.Arrays;

public class Methods {
    public int[] selectionSort(int[] array) {

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

    public int[] mergeArray(int[] arr1, int[] arr2) {

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

    public boolean sumExists(int sum, int[] arr) {

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
