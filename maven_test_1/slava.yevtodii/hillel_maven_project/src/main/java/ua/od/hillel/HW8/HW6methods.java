package ua.od.hillel.HW8;

import java.util.Arrays;

public class HW6methods {

    public int[] createArray(int n) {
        int[] resultArray = randArray(n);
        Arrays.sort(resultArray);
        return resultArray;
    }

    public int[] thirdArray(int[] firstArr, int[] secondArr) {

        int[] result = new int[firstArr.length+secondArr.length];
        for (int i = 0; i < firstArr.length; i++) {
            result[i] = firstArr[i];
        }
        for (int i = 0; i < secondArr.length; i++) {
            result[i+firstArr.length] = secondArr[i];
        }
        Arrays.sort(result);
        return result;
    }

    public boolean getSum(int[] arr, int sum) {

        boolean isSum = false;

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
                    isSum = true;
                    return isSum;
                }
            }
        }
        System.out.println("False. Cannot get the sum " + sum);
        return isSum;
    }

    private int[] randArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int)(Math.random()*50);
        }
        return result;
    }


    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}
