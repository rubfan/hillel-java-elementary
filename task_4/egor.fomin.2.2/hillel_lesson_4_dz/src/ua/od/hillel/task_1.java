package ua.od.hillel;

/**Create a program that displays all four-digit numbers of the sequence 1000 1003 1006 1009 1012 1015 ....
 */
public class task_1 {
/**This is main performing method*/
    public static void main(String[] args) {
        System.out.println("Your sequence: ");
        for (int i = 998; i < 9998; ++i) {
            i = i+2;
            System.out.print(i + ", ");
        }
    }
}
