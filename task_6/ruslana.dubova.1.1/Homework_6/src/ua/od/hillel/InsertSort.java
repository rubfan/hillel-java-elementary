package ua.od.hillel;

public class InsertSort {
    public int[] sort(int[] numbers) {

        for(int i = 0; i<numbers.length; i++){
            int minValue = numbers[i];
            int minIndex = i;
            for(int j = i; j<numbers.length; j++){
                if(numbers[j] < minValue) {
                    minValue = numbers[j];
                    minIndex = j;
                }
            }
            int k = numbers[i];
            numbers[i] = minValue;
            numbers[minIndex] = k;
        }
        return numbers;
    }
}
