package uk.od.hillel;


import java.util.Scanner;


public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        label: while (true)
        {
            System.out.println("Возможные операции: addition(1+), subtraction(2-), division(3/), multiplication(4*), Rdivision(5%),");
            System.out.println("___________________________________________________________________________________________________");
            System.out.println("Введите нвзывние операции:");
            int operation = in.nextInt();
            if (operation == 1)
            {
                System.out.println("Введите первый операнд: ");
                int firstOperand = in.nextInt();
                System.out.println("Введите второй операнд: ");
                int secondOperand = in.nextInt();
                int i = firstOperand + secondOperand;
                System.out.println("Сумма сложения:" + i);
                System.out.println("Продожить работу? 1 - да; 2 - нет");
                int work = in.nextInt ();
                if (work == 2)
                {
                    break label ;
                }
            }
            if (operation == 2)
            {
                System.out.println("Введите первый операнд: ");
                int firstOperand = in.nextInt();
                System.out.println("Введите второй операнд: ");
                int secondOperand = in.nextInt();
                int i = firstOperand - secondOperand;
                System.out.println("Вычитание: " + i);
                System.out.println("Продожить работу? 1 - да; 2 - нет");
                int work = in.nextInt ();
                if (work == 2)
                {
                    break label ;
                }
            }
            if (operation == 3)
            {
                System.out.println("Введите первый операнд: ");
                int firstOperand = in.nextInt();
                System.out.println("Введите второй операнд: ");
                int secondOperand = in.nextInt();
                int i = firstOperand / secondOperand;
                System.out.println("Деление: " + i);
                System.out.println("Продожить работу? 1 - да; 2 - нет");
                int work = in.nextInt ();
                if (work == 2)
                {
                    break label ;
                }
            }
            if (operation == 4)
            {
                System.out.println("Введите первый операнд: ");
                int firstOperand = in.nextInt();
                System.out.println("Введите второй операнд: ");
                int secondOperand = in.nextInt();
                int i = firstOperand * secondOperand;
                System.out.println("Умножение: " + i);
                System.out.println("Продожить работу? 1 - да; 2 - нет");
                int work = in.nextInt ();
                if (work == 2)
                {
                    break label ;
                }
            }
            if (operation == 5)
            {
                System.out.println("Введите первый операнд: ");
                int firstOperand = in.nextInt();
                System.out.println("Введите второй операнд: ");
                int secondOperand = in.nextInt();
                int i = firstOperand % secondOperand;
                System.out.println("Остаток от деления: " + i);
                System.out.println("Продожить работу? 1 - да; 2 - нет");
                int work = in.nextInt ();
                if (work == 2)
                {
                    break label ;
                }
            }


        }
    }
}
