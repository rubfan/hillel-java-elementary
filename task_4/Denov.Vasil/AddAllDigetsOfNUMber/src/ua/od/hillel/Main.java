package ua.od.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ;
        int num;
        int leng = 0;
        Integer [] arr;
        String [] S;

        System.out.println("Input number: ");
        num = sc.nextInt();

        int sum = num;
        leng = lengthOfNumber(num);

        do {


            arr = splitting(sum, leng);    //тут при первой итырации сумма = num
            S=intToArray(arr);
            str=(String.join("+", S));

            System.out.println(str);// запитые поминять на плюст=ики
            sum = addDigits(arr);
        } while (sum > 9);

        System.out.println(sum);

    }


    //определяетедлну числа
    //identify length of number
    static int lengthOfNumber(int num) {
        int length = 0;
        for (int i = 0; true; i++) {
            if (num / (int) Math.pow(10, i) > 0) {
                ++length;
            } else break;
        }
        return length;
    }

    //spliting number to digit
    static Integer[] splitting(int num, int length) {
        Integer [] array = new Integer[length];

        for (int i = length, j = 0; i > 0; --i, j++) {

            if (i == length) {
                array[j] = num / (int) Math.pow(10, (i - 1));
            } else {
                array[j] = num / (int) Math.pow(10, (i - 1)) % 10;
            }
        }
        return array;
    }

    static int addDigits(Integer [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    static String[] intToArray(Integer [] arr){
        String [] Sarr=new String[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            Sarr[i]=arr[i].toString();
        }

        return Sarr;
    }
}


