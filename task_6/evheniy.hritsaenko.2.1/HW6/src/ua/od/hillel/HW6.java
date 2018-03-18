//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ua.od.hillel;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HW6 {

    public static void main(String[] args) {
        spendTime();
        int[] a = IntStream.rangeClosed(1, 500000).filter((i) -> {
            return i % 2 == 0;
        }).toArray();
        int[] b = IntStream.rangeClosed(1, 500000).filter((i) -> {
            return i % 2 != 0;
        }).toArray();
        sort2arrVer1(a, b);
        sort2arrVer2(a, b);
        dif();
    }

    public static void spendTime() {
        long start1 = System.currentTimeMillis();
        int arr1 = IntStream.rangeClosed(1, 500000).min().getAsInt();
        System.out.println("Looking minimum for arr1 number from 1 to 500000: " + arr1);
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println("Spent time: " + timeConsumedMillis1);
        System.out.println("=========================================");

        long start2 = System.currentTimeMillis();
        int[] arr2 = IntStream.rangeClosed(1, 500000).toArray();
        int minArr2 = arr2[0];

        for(int i = 0; i < arr2.length; ++i) {
            if (arr2[i] < minArr2) {
                minArr2 = arr2[i];
            }
        }

        System.out.println("Looking minimum for arr2 number from 1 to 500000: " + minArr2);
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println("Spent time: " + timeConsumedMillis2);
        System.out.println("=========================================");

        long start3 = System.currentTimeMillis();
        int arr3 = IntStream.rangeClosed(1, 500000).min().getAsInt();
        System.out.println("Looking minimum for arr3 number from 1 to 500000: " + arr3);
        long finish3 = System.currentTimeMillis();
        long timeConsumedMillis3 = finish3 - start3;
        System.out.println("Spent time: " + timeConsumedMillis3);
        System.out.println("=========================================");
    }

    public static void sort2arrVer1(int[] arr1, int[] arr2) {
        long start = System.currentTimeMillis();
        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;
        int[] result = new int[lengthArr1 + lengthArr2];
        int i = 0;
        int j = 0;

        int index;
        for(index = 0; i < lengthArr1 && j < lengthArr2; ++index) {
            if (arr1[i] < arr2[j]) {
                result[index] = arr1[i];
                ++i;
            } else {
                result[index] = arr2[j];
                ++j;
            }
        }

        while(i < lengthArr1) {
            result[index] = arr1[i];
            ++index;
            ++i;
        }

        while(j < lengthArr2) {
            result[index] = arr2[j];
            ++index;
            ++j;
        }

        long finish = System.currentTimeMillis();
        long timeConsumedMillis3 = finish - start;
        System.out.println("Spent time sum sort arr 1: " + timeConsumedMillis3);
        System.out.println("=========================================");
    }

    public static void sort2arrVer2(int[] arr1, int[] arr2) {
        long start = System.currentTimeMillis();
        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        Arrays.sort(result);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis3 = finish - start;
        System.out.println("Spent time sum sort arr 2: " + timeConsumedMillis3);
        System.out.println("=========================================");
    }

    public static void dif() {
        int k = 0;
        int n = 10;

        int dif;
        for(dif = 0; dif < n; ++dif) {
            for(int j = dif + 1; j < n; ++j) {
                for(int z = j + 1; z < n; ++z) {
                    ++k;
                }
            }
        }

        System.out.println("The result is " + k);
        dif = n * (n - 1) * (n - 2);
        System.out.println("Dif = " + dif);
    }
}
