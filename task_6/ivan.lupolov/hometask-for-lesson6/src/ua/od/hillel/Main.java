package ua.od.hillel;

public class Main {


    public static void main(String[] args) {

        int[] sortArray = selectionSort(new int[]{1,84,0,8,73,457,-84,3,-7,3});

        for (int i = 0; i < sortArray.length; i++) {
            System.out.print(sortArray[i] + " ");
        }
    }

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
}
