package uk.od.hillel;

public class Main {

    public static void main(String[] args)
    {
        int [][] array = initializate(5, 5);
        drovMassiv(array);
    }

    public static int[][] initializate(int width, int hight)
    {
        int [][] array = new int[hight][width];
        array[0][0]=0;
        return array;
    }

    public static void drovMassiv(int [][] array)
    {
        int hight, width;
        hight = array.length;
        width = array[0].length;
        System.out.println("\nВысота: "+ hight + " Широта: " + width);

        int count = 0;
        int previousNumber = 0;
        while(previousNumber<width*hight -1) {
            for (int i =  count; i < width  - count; i++, previousNumber++) {
                array[count][i] = previousNumber + 1;
            }
            for (int i = 1 + count; i < hight - count; i++, previousNumber++) {
                array[i][width - count - 1] = previousNumber + 1;
            }

            for (int i = width - 1 - count; i > 0 + count; i--, previousNumber++) {
                array[hight - count - 1][i - 1] = previousNumber + 1;
            }

            for (int i = hight - 1 - count; i > 0 + count + 1; i--, previousNumber++)
            {array[i - 1][count] = previousNumber + 1;
            }
                count++;
            }

            for (int[] arrayInArray: array)
            {
                for (int member:arrayInArray)
                {
                    System.out.print(member + "  ");
                }
                System.out.println("");
            }
    }
}
