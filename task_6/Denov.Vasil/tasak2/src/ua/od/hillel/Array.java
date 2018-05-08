package ua.od.hillel;

public class Array {
    private long[] a;
    private int nElems;

    public Array(int max){


        a = new long[max];
        nElems = 0;
    }

    public int size(){

     return nElems;
    }


    // Вставка элемента в массив
    public void insert(long value)

    {
        int j;
        for(j=0; j<nElems; j++)
// Определение позиции вставки
            if(a[j] > value)

                break;
        for(int k=nElems; k>j; k--)  //// Перемещение последующих элементов
            a[k] = a[k-1];
        a[j] = value;    //  вставка

        nElems++;   // увелечение размера

    }

    public void display()
// Вывод содержимого массива
    {
        for(int j=0; j<nElems; j++)
// Перебор всех элементов
            System.out.print(a[j] + " "); // Вывод текущего элемента
        System.out.println("");
    }

    public long getArray(int i){

            return a[i];

    }

}
