package ua.od.hillel;
import java.util.Scanner;
/**This program helps you count the tips.*/

public class Tip {
    static Scanner scanner = new Scanner(System.in);

    /**This is main performing method */
    public static void main(String[] args) {
        System.out.println("The tips.");
        System.out.println("1. Terrible(0%)\n2. Poor(5%)\n3. Good(10%)\n4. Great(15%)\n5. Excellent(20%)");
        char score = getOpinion();
        double sum = Sum();
        double result = calcTip(sum, score);
        System.out.println("Your total check is: " + result);
    }

    /**This method get your opinion about service*/
    public static char getOpinion() {
        System.out.println("Please, choose your opinion about service and enter one of number: ");
        char score;
        if (scanner.hasNext()) {
            score = scanner.next().charAt(0);
        } else {
            System.out.println("You make mistake. Please reenter your operation. ");
            scanner.next();//recursion
            score = getOpinion();
        }
        return score;
    }

    /**This method get your incoming cost*/
    public static double Sum(){
        System.out.println("Please enter start cost of your meal: ");
        int sum = scanner.nextInt();
        return sum;
    }

    /**This method calculate your total cost with tips*/
    public static double calcTip( double sum, char score) {
        double result;
        switch (score) {
            case '1':
                result = sum;
                break;
            case '2':
                result = sum*1.05 ;
                break;
            case '3':
                result = sum*1.1;
                break;
            case '4':
                result = sum*1.15;
                break;
            case '5':
                result = sum*1.20;
                break;
            default:
                System.out.println("You make mistake. Please reenter.");
                result = calcTip(score, getOpinion());//recursion
        }
        return (float)result; // почему надо преобразовывать к float ? Пока не преобразовал выдавал не точные результаты.
    }
}