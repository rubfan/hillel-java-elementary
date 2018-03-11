public class TestJAR {
    public static void main(String[] args) {
        if(args.length == 0 ) {
            System.out.println("There are no command-line options.");
        } else if (args.length == 1) {
            System.out.println("You must enter 2 operands.");
        } else {
            System.out.println("Sum: " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
        }
    }
}
