package ua.od.hillel;
/**25.02.2018 class_lesson5
 *STATEMENTS
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(args[0]); //123
        // java -cp out Main 123 127
    short a = -128;
    short b = -20;
    int result = addNumbers(a,b);

	System.out.println(" result:  " + result);
//	for (int i=0; i<count; i++){
//        System.out.println(i);
//    }
    }

    public static long addNumbers(short x, short y) {
        return x%y;
    }
}
