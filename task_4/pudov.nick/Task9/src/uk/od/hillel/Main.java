package uk.od.hillel;

public class Main {

    public static void main(String[] args) {
        for(int i = 100000; i<=999999; i++)
        {
            int sFirst = 0;
            int sSecond = 0;
            int firstHalf = i/1000;
            int secondHalf = i%1000;
            for(int y = 1; y < 4; y++)
            {
                sFirst = sFirst + firstHalf%10;
                sSecond = sSecond + secondHalf%10;
                firstHalf = (firstHalf - firstHalf%10)/10;
                secondHalf = (secondHalf - secondHalf%10)/10;
            }
            if(sFirst==sSecond) {
                System.out.print(i + "\n");
            }

        }
    }
}
