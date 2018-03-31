package ua.od.hillel;

import java.sql.SQLOutput;

public class Numbers {
    public void numbers1003(){

        for(int i=1000; i<100000; i+=3){
            System.out.println("Sequene#1: "+i);
        }
    }
    public void numbers55(){

        int i = 0;
        int j = 1;

         while(i<55 ){
             System.out.println("Seguence#2: "+j);
             j +=2;
             i++;
         }
    }
    public void numberPositive(){

        int p = 90;

        for(p=90; p>=0; p-=5){
            System.out.println("Positive numbers: "+p);
        }
    }
    public void nubbers20(){

        int i = 0;
        int s = 2;

        while(i<20){
            System.out.println("Pow2 sequence: "+s);
            s *=2;
            i++;
        }
    }

    public void sumOfN(int[] ar, int n){

        int sum = 0;

        for(int i=0; i<n; i++){
           sum += ar[i];
        }

        System.out.println("sum of "+n+" elements = "+sum);
    }

    public void minMaxOfaArray(int[] ar){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<ar.length; i++){
            max = Math.max(ar[i], max);
            min = Math.min(ar[i], min);
        }
        System.out.println("Min numner in array = "+min);
        System.out.println("Max numner in array = "+max);
    }

    public void oddAndEvenSum(int[] ar){

        int sumOdd= 0;
        int sumEven= 0;

        for(int i= 0; i<ar.length; i++){
            if(i%2==0){
               sumEven+=ar[i];
            }else{
                sumOdd+=ar[i];
            }
        }
        System.out.println("Sum of odd numbers = "+sumOdd);

        System.out.println("Sum of even numbers = "+sumEven);
    }

    public int[] splitNumberToDigits(int N){

        int[] ar = new int[6];

        //#0
        ar[0] = N%10;

        //#1
        N -= ar[0];
        ar[1] = (N%100)/10;

        //#2
        N -= ar[1];
        ar[2] = (N%1000)/100;

        //#3
        N -= ar[2];
        ar[3] = (N%10000)/1000;

        //#4
        N -= ar[3];
        ar[4] = (N%100000)/10000;

        //#5
        N -= ar[4];
        ar[5] = (N%1000000)/100000;

        return ar;
    }

    public void happyTickets(){

        for(int ticket = 100000; ticket<=999999; ticket++){
            int[] digits= this.splitNumberToDigits(ticket);
            if(digits[0]+digits[1]+digits[2]==digits[3]+digits[4]+digits[5]){
                System.out.println("Happy ticket is : "+ticket);
            }
        }
    }
    protected long pow2(int k){
        if(k==0){
          return 1;
        }
        long res = 1;
        for(int i = 1; i <= k; i++){
            res *=2;
        }
        return res;
    }
    public void integerToBinary(int x) {
        System.out.print("Binary representation of "+x+" is ");
        int bits[] = new int[32];
        for (int i = bits.length-1; i >= 0; i--) {
            long p = pow2(i);
            if (p <= x) {
                x -= p;
                bits[i] = 1;
            } else {
                bits[i] = 0;
            }
        }
        for (int i = 0; i < bits.length; i++) {
            System.out.print(bits[i]);
        }
        System.out.println(" ");
    }

    public void firstFiveMin(int[] ar){
        System.out.println("First five minimal elements of ");
        for(int j = 0; j<ar.length; j++) {
            System.out.print(" "+ar[j]);
        }
        System.out.println(" are");
        int [] min5 = { Integer.MAX_VALUE,
                        Integer.MAX_VALUE,
                        Integer.MAX_VALUE,
                        Integer.MAX_VALUE,
                        Integer.MAX_VALUE};

        int lastMin = Integer.MIN_VALUE;

        for(int i = 0; i <min5.length; i++){
            for(int j = 0; j<ar.length; j++) {
                if (ar[j] > lastMin) {
                    min5[i] = Math.min(ar[j], min5[i]);
                }
            }
            lastMin = min5[i];
        }
        for(int i = 0; i<min5.length; i++){
            System.out.print(" "+min5[i]);
        }
        System.out.println(" ");
    }
    public void clumpDigits (int k){

        int[] digits = splitNumberToDigits(k);
        int sum = k;
        while(sum >= 10){
            sum = 0;
            for(int i = 0; i<digits.length; i++){

                if(digits[i]==0)
                    continue;

                sum += digits[i];
                System.out.print(" "+digits[i]);
            }
            System.out.println(" = "+sum);
            digits = new int[0];
            digits = splitNumberToDigits(sum);
        }

    }
}
