package ua.od.hillel;

public class Merge {
    public int[] merge(int[] ar1, int[] ar2) {
        int[] result = new int[ar1.length + ar2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] < ar2[j]) {
                result[k] = ar1[i];
                i++;
            } else {
                result[k] = ar2[j];
                j++;
            }
            k++;
        }
        while (i < ar1.length) {
            result[k] = ar1[i];
            k++;
            i++;
        }
        while (j < ar2.length) {
            result[k] = ar2[j];
            k++;
            j++;
        }
        return result;
    }
}
