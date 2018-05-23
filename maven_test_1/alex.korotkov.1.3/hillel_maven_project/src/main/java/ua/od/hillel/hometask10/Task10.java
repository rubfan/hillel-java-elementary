package ua.od.hillel.hometask10;
/**
Напишите программу, которая выводит n-ый член последовательности Фибоначчи:
        Последовательность Фибоначчи - первые 2 элемента равны 1, каждый следующий равен сумме двух предыдущих:
        1 1 2 3 5 8 13 21 34 55 ...
        Также определите сложность вашего решения
        Задачу нужно решить с рекурсией и без ее использования
**/

public class Task10 {
// Сложность одинаковая. тк задача выполнится что там что там O(n) раз, но рекурсия больше съест памяти тк
//    вся цепочка рекурсивных методов workRecursion будет жить пока не выполниться n-я итерация
    public static void main(String[] args) {

        System.out.println(outputWithOutRecursion(22));

        outputWithRecursion(22);
    }


    private static void outputWithRecursion(int number){
        int count = 2;
        int n1 = 0;
        int n2 = 1;
        workRecursion(number, count, n1, n2);

    }

    private static void workRecursion(int number, int count, int n1, int n2){
        if(count<number){
            workRecursion(number, ++count, n2, n1+n2);
        }
        else System.out.println(n1 + n2);
    }

    private static int outputWithOutRecursion(int number){
        int count = 1;
        int n1 = 0;
        int n2 = 1;
        int n3 =0;
        if(number == 1){
           return n1;
        }
        else{
            while (count < number){
                n3 = n1 +n2;
                n1=n2;
                n2=n3;
                count++;
            }
            return n3;
        }

    }
}
