package ua.od.hillel;

/**
 * Created by dmytro.denysko on 12.03.2018.
 */
public class HomeWork6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 8, 9, 12};
        int[] arr3 = new int[10];
        initArray(arr3);
        int[] newArr = twoArrays(arr1, arr2);
        printArray(newArr);
        System.out.println("\n" + findSumOfTwoNumbers(12, arr2));
        printArray(arr3);
        selectionSort(arr3);
        printArray(arr3);

    }
    public static void algoritm(String[] args) {
        int k = 0;
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {     // O(n^2)
                for (int z = j + 1; z < n; z++) {
                    k++;                }
            }
        }
        System.out.println("The result is " + k);
    }

    public static void selectionSort(int[] numbers) {
        int min, temp;

        for (int i = 0; i < numbers.length - 1; i++) {    //сложность O(n^2)
            min = i;
            for (int j = i + 1; j < numbers.length; j++) { // добавление елементов O(1)
                if (numbers[j] < numbers[min])
                    min = j;
            }
            temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }
    }


    public static boolean findSumOfTwoNumbers(int sum, int[] arr) {
        boolean answer = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i != j && arr[i] + arr[j] == sum) answer = true;
            }
        }
        return answer;
    }

    public static int[] twoArrays(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] newArr = new int[length];
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < length) {
            if (i < arr1.length && j < arr2.length && Math.min(arr1[i], arr2[j]) == arr1[i]) {
                newArr[count++] = arr1[i++];
            } else if (i < arr1.length && j < arr2.length && Math.min(arr1[i], arr2[j]) == arr2[j]) {
                newArr[count++] = arr2[j++];
            }
            if (i > arr1.length - 1) newArr[count++] = arr2[j++];
            else if (j > arr2.length - 1) newArr[count++] = arr1[i++];
        }
        return newArr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void initArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50);
        }
    }
}
