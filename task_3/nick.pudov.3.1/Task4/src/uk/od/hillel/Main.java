package uk.od.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите качество обслуживания: *terrible* *poor*  *good*  *great*  *excellent* ");
        String service = sc.nextLine();
        System.out.println("Введите стоимость заказа: ");
        int a = Integer.parseInt(sc.nextLine());
        int b;

        if (service .equals("terrible"))
        {
        b = a;
        System.out.println("Сумма оплаты с чаевыми равна: " + b);
        }
        if (service .equals("poor"))
        {
            b = a + 5%a;
            System.out.println("Сумма оплаты с чаевыми равна: " + b);
        }
        if (service .equals("good"))
        {
            b = a + 10%a;
            System.out.println("Сумма оплаты с чаевыми равна: " + b);
        }
        if (service .equals("great"))
        {
            b = a + 15%a;
            System.out.println("Сумма оплаты с чаевыми равна: " + b);
        }
        if (service .equals("excellent"))
        {
            b = a + 20%a;
            System.out.println("Сумма оплаты с чаевыми равна: " + b);
        }
//        switch (service)
//        {
//            case 1: service = "terrible";
//                b = a;
//                System.out.println("Сумма оплаты с чаевыми равна: " + b);
//            break;
//            case 2: service = "poor";
//                b = a + 5%a;
//                System.out.println("Сумма оплаты с чаевыми равна: " + b);
//                break;
//            case 3: service = "good";
//                b = a + 10%a;
//                System.out.println("Сумма оплаты с чаевыми равна: " + b);
//                break;
//            case 4: service = "great";
//                b = a + 15% a;
//                System.out.println("Сумма оплаты с чаевыми равна: " + b);
//                break;
//            case 5: service = "excellent";
//                b = a + 20% a;
//                System.out.println("Сумма оплаты с чаевыми равна: " + b);
//                break;
//        }
    }
}
