package ua.od.hillel;
import java.util.Scanner;

public class Main {

    /**This is main performing method*/
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
        String[] cards ={
                "6 чирва","7 чирва","8 чирва","9 чирва","10 чирва","J чирва","Q чирва","K чирва","A"
                "6 буба","7 буба","8 буба","9 буба","10 буба","J буба","Q буба","K буба","A буба"
                "6 пика","7 пика","8 пика","9 пика","10 пика","J пика","Q пика","K пика","A пика"
                "6 крест", "7 крест","8 крест","9 крест","10 крест","J крест","Q крест","K крест","A"
        };

        int[] costs = {
                6,7,8,9,10,10,10,10,11,
                6,7,8,9,10,10,10,10,11,
                6,7,8,9,10,10,10,10,11
                6,7,8,9,10,10,10,10,11
        };

        int[] deck = createDeck();

        shuffleDeck(deck);

        Scanner scanner = new Scanner(System.in);
        boolean condition = true;

        exit:
        while (condition){
            for (int i = 0; i < ; i++) {
            System.out.println("Would you like one card more? ");
            String str = scanner.nextLine();
                switch (str) {
                    case "exit":
                        break exit;
                    case "y":
                        break exit;
                    case "n":
                        break exit;
                }
            if (str.equals("exit")) break exit;
        }
    }

    public int[] createDeck(){
        int deck[] = new int[36];
        for (int i=0; i<36; i++){
            deck[i] = i;
        }
        return deck;
    }

    public int[] shuffleDeck(i
        nt[] deck){
        for (int i = 0; i < deck.length ; i++) {
            int newIndex = (int)(Math.random() * (deck.length - 1));
            int  card = deck[i];
            deck[i] = deck[newIndex];
            deck[newIndex] = card;
        }
        return;
    }
}
