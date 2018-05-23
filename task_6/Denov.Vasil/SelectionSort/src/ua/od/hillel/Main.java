package ua.od.hillel;

import java.lang.*;




public class Main {


    public static void main(String[] args) {

        Sort t1= new Sort(100);
        Sort t2= new Sort (1000);
       t1.insert();
       t2.insert();

        System.out.println("Time befor sort 100 elements  ");
        System.out.print(System.currentTimeMillis()+"\n");
        t1.selectionSort();
        System.out.print("after "+System.currentTimeMillis()+"\n");

        System.out.println("Time befor sort 1000 elements  ");
        System.out.print(System.currentTimeMillis()+"\n");
        t2.selectionSort();
        System.out.print("after "+System.currentTimeMillis()+"\n");
    }




}
