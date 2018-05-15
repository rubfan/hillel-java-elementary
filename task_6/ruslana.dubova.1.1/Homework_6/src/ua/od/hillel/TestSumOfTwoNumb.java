package ua.od.hillel;

public class TestSumOfTwoNumb {
    public int binarySearch(int[] ar, int numb, int low, int high){

        if ( high < low){
            return -1;
        }
        int middle = (low + high)/2;

        if (ar[middle] == numb){
            return middle;
        }
        if (ar[middle] < numb){
            return binarySearch(ar, numb, middle + 1, high);
        }else{
            return binarySearch(ar, numb, low, middle - 1);
        }
    }

    public boolean findSumOperands(int ar[], int sum) {
        for (int i = 0; i < ar.length; i++) {
            if (binarySearch(ar, sum - ar[i], 0, ar.length - 1) != -1) {
                return true;
            }
        }
        return false;
    }
}
