package ua.od.hillel;
/**class_lesson_04.03.2018*/

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            if (i == 5 ) continue; // continue - пропускает одну целую итерацию
            System.out.println(i);
            System.out.println("======");//step 2
            System.out.println("******");//step 3
            System.out.println("@@@@@@");//step 4
            System.out.println("&&&&&&");//step 5

        }

    }
}
