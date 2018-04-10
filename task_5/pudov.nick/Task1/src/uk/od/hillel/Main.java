package uk.od.hillel;

public class Main {

    public static void main(String[] args)
    {
        int hight = 10;
        int [][] array1 = initializate(hight);
        drowTriangle(array1);
    }


    public static int[][] initializate(int hight)
    {
        int [][] massive = new int [hight][hight*2+1];
        massive [0][hight] = 1;

        return massive;
    }

    public static void drowTriangle(int[][] array)
    {
        int hight = array.length;
        System.out.println("\nВысота: " + hight);
        for (int i=1;i<hight;i++)
        {
            for(int j=1;j<hight*2-1;j++){
                array[i][j]= array[i-1][j-1] + array[i-1][j+1];
            }
        }
        for (int[] arraySimple: array)
        {
            for (int number: arraySimple )
            {
                if(number==0)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print(number );
                }
            }
            System.out.println("");
        }
    }
}
