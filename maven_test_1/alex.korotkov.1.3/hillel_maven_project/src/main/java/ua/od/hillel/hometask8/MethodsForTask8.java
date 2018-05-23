package ua.od.hillel.hometask8;


import java.util.stream.IntStream;


public class MethodsForTask8 {

    public static void main(String[] args) {



    }


    public static int[] arraysAdd(int[] a1, int[] a2){
        int[] arrayResult = IntStream.concat(IntStream.of(a1),IntStream.of(a2)).toArray();
        for(int i=0; i<arrayResult.length;i++){
            int temp = 0;
            for(int j=i+1; j<arrayResult.length;j++){
                if(arrayResult[i]>arrayResult[j]){
                    temp = arrayResult[j];
                    arrayResult[j]=arrayResult[i];
                    arrayResult[i]=temp;

                }
            }

        }



        return arrayResult;
    }




    public static boolean findSameSumma (int[] array, int sum){
        for(int i=0; i<array.length-1;i++){
            for(int j=i+1;  j < array.length ;j++){
                if(array[i]+ array[j]==sum){
                    //System.out.println(array[i] + " + " + array[j] + " = " + sum);
                    return true;

                }

            }

        }
        //System.out.println("Nothing was found...");
        return false;
    }
}
