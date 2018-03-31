package ua.od.hillel;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Numbers n = new Numbers();
        n.numbers1003();
        n.numbers55();
        n.numberPositive();
        n.nubbers20();

        int[] ar ={1, 6, 7, 9, 3, 4};
        n.sumOfN(ar, 4);

        int[] ar2 ={3, 6, 1, 8, 4, 3, 2, -596, 9, 8, -3, 7, -143, 5, 56903, 0};
        n.minMaxOfaArray(ar2);

        int[] ar3={2, 5, 6, 1, 7, 8, 45, 1, 67, 98, 2, 1, 4, 6, 6, 90};
        n.oddAndEvenSum(ar3);

        n.happyTickets();

        n.integerToBinary(3);
        n.integerToBinary(1234);
        n.integerToBinary(65789);

        int[] ar4={1, 25, 932, 194, 2, 6, 643, 642, 55, 11, 8, 50};
        n.firstFiveMin(ar4);

        n.clumpDigits(555555);
        n.clumpDigits(979879);
    }
}
