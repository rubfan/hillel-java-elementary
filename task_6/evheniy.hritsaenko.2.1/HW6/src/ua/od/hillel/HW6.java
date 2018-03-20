package ua.od.hillel;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HW6 {

    public static void main(String[] args) {
        spendTime();

        int[] a = IntStream.rangeClosed(1, 50).filter(i -> i % 2 == 0).toArray();
        int[] b = IntStream.rangeClosed(1, 50).filter(i -> i % 2 != 0).toArray();

        sort2arrVer1(a, b);

        sort2arrVer2(a, b);

        int[] c = {1, 5, 7, 9, 12};
        System.out.println(sumNum(c ,12));
    }

    public static void spendTime() {
        /*
        Первый и третий вариант идентичны, но почему разница по времени приличная...
        */
        long start1 = System.currentTimeMillis();
        int minArr1 = IntStream.rangeClosed(1, 500000).min().getAsInt();
        System.out.println("Looking minimum for minArr1 number from 1 to 500000: " + minArr1);
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println("Spent time: " + timeConsumedMillis1);
        System.out.println("=========================================");

        /*
        Dif = O(n)
         */
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
        int minArr3 = IntStream.rangeClosed(1, 500000).min().getAsInt();
        System.out.println("Looking minimum for minArr3 number from 1 to 500000: " + minArr3);
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
        //индексы масивов
        int i = 0;
        int j = 0;
        //индекс нового масива
        int index;
        /*
        сравниваем элементы по очереди учитывая, что масивы уже отсортированы,
        заполняем новый масив, пока не закончатся элементы в одном из масивов
         */
        for(index = 0; i < lengthArr1 && j < lengthArr2; ++index) {
            if (arr1[i] < arr2[j]) {
                result[index] = arr1[i];
                ++i;
            } else {
                result[index] = arr2[j];
                ++j;
            }
        }
        /*
        добавляем оставшиеся элементы в конец нового масива по порядку,
         в зависимости какой масив остался не просмотренным
         */
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
//        printArray(result);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis3 = finish - start;
        System.out.println("Spent time sum sort arr 1: " + timeConsumedMillis3);
        System.out.println("=========================================");
    }

    public static void sort2arrVer2(int[] arr1, int[] arr2) {
        long start = System.currentTimeMillis();
        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;
        int[] result = new int[lengthArr1 + lengthArr2];
        System.arraycopy(arr1, 0, result, 0, lengthArr1);
        System.arraycopy(arr2, 0, result, lengthArr1, lengthArr2);
        Arrays.sort(result);
//        printArray(result);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis3 = finish - start;
        System.out.println("Spent time sum sort arr 2: " + timeConsumedMillis3);
        System.out.println("=========================================");
    }

    public static void dif() {
        // dif = O(n)
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
    }

    public static boolean sumNum(int[] arr, int findSum){
        /*
        Ищем в масиве число, которое равно желаемой сумме или больше него
        дабы отсеять все числа после него включительно,
        так как они уже заведомо не подходят
         */
        int indexFindSum = binarySearchMod(arr, 0, arr.length, findSum);
        System.out.println(indexFindSum);
        /*
        Перебираем каждый элемент масива и ищем ему пару для получения нужной суммы
        */
        for (int i = 0; i < indexFindSum; i++)
        {
            int first = arr[i];
            int second = findSum - first; // искомый элемент
            int index = binarySearchStandard(arr, 0, indexFindSum, second);
            //проверка: не являеться ли найденое число, именно тоже самое к которому ищем пару
            if (index > -1 && index != i)
            {
                return  true;
            }
        }
        return false;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    private static int binarySearchStandard(int[] a, int fromIndex, int toIndex,
                                     int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    /*
    Этот бинарный поиск выдает индекс ближайшего-большее число от того, что ищем,
    или на 1 индекс меньше, если это число есть в масиве
     */
    private static int binarySearchMod(int[] a, int fromIndex, int toIndex,
                                            int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid-1; // key found
        }
        int mid = (low + high) >>> 1;
        return mid;
    }
}
