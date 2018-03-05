package ua.od.hillel;

import java.util.Scanner;

/**
 * Created by ruslangramatic on 3/4/18.
 */
public class Lesson6 {





    public static void main(String[] args) {
        //====Step-0 initialisation====
        String[] cards = {
                "2 чирва", "3 чирва", "4 чирва", "5 чирва", "6 чирва", "7 чирва", "8 чирва", "9 чирва", "10 чирва", "J чирва", "Q чирва", "K чирва", "A чирва",
                "2 буба", "3 буба", "4 буба", "5 буба", "6 буба", "7 буба", "8 буба", "9 буба", "10 буба", "J буба", "Q буба", "K буба", "A буба",
                "2 пика", "3 пика", "4 пика", "5 пика", "6 пика", "7 пика", "8 пика", "9 пика", "10 пика", "J пика", "Q пика", "K пика", "A пика",
                "2 крест", "3 крест", "4 крест", "5 крест", "6 крест", "7 крест", "8 крест", "9 крест", "10 крест", "J крест", "Q крест", "K крест", "A крест"
        };

        int[] costs = {
                2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11,
                2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11,
                2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11,
                2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11
        };

        int currentCardIndex = 0;

        int[] playersScores = new int[args.length];

        Scanner scanner = new Scanner(System.in);

        int playersInGame = args.length;

        //====Step-1====
        int[] deck = createDeck();

        //====Step-2 Prepare====
        showPlayers(args);

        //====Step-3 Shuffle====
        shuffleDeck(deck);

        //====Step-4 distribution======
        currentCardIndex = distribution(args, playersScores, costs, deck, cards, currentCardIndex);

        //====Step-5 Play====
        play(args, playersScores, costs, deck, cards, playersInGame, currentCardIndex, scanner);

        // ====Step-6 Scores====
        showScores(args, playersScores);

        // ====Step-7 Winner!====
        showWinners(args, playersScores);
    }

    private static int distribution(String[] players, int[] playersScores, int[] costs, int[] deck, String[] cards, int currentCardIndex) {
        System.out.println("============Distribution:===========");
        for (int i = 0; i < players.length; i++) {
            playersScores[i] += costs[deck[currentCardIndex]];
            System.out.println(players[i] + " Your card is: (" + cards[deck[currentCardIndex]] + ") and you scored " + playersScores[i] + " points!");
            currentCardIndex++;
        }
        return currentCardIndex;
    }

    private static void showWinners(String[] players, int[] playersScores) {
        int point = 21 + 100000;
        int max = 0;
        int i;
        for (i = 0; i < players.length; i++) {
            if (playersScores[i] > max && playersScores[i] <= point)
                max = playersScores[i];
        }
        for (i = 0; i < players.length; i++) {
            if (playersScores[i] > point) System.out.println(players[i] + " too much scores");
            if (playersScores[i] == max) System.out.println(players[i] + " Won!!!");
        }
    }

    public static void play(String[] players, int[] playersScores, int[] costs, int[] deck, String[] cards,
                            int playersInGame, int currentCardIndex, Scanner scanner) {
        exit:
        do {
            System.out.format("\n======ROUND %s=====", currentCardIndex/3 + 1);
            for (int i = 0; i < players.length; i++) {
                if (playersScores[i] < 100000) {
                    System.out.format("\n%s your turn. Would you like one card more?: ", players[i]);
                    String str = scanner.nextLine();
                    switch (str) {
                        case "exit":
                            break exit;
                        case "y":
                            if (costs[deck[currentCardIndex]] == 11) { //если выпал туз, то смотрим сколько очков и начисляем либо 1 либо 11
                                if (playersScores[i] > 10) {
                                    playersScores[i] += costs[deck[currentCardIndex]] - 10;
                                    System.out.println("Your card is: (" + cards[deck[currentCardIndex]] + ") and you scored " + playersScores[i] + " points!");
                                } else {
                                    playersScores[i] += costs[deck[currentCardIndex]];
                                    System.out.println("Your card is: (" + cards[deck[currentCardIndex]] + ") and you scored " + playersScores[i] + " points!");
                                }
                            } else { //если туз не выпал, то начисляем по стандарту
                                playersScores[i] += costs[deck[currentCardIndex]];
                                System.out.println("Your card is: (" + cards[deck[currentCardIndex]] + ") and you scored " + playersScores[i] + " points!");
                            }

                            break;
                        case "n":
                            playersScores[i] += 100000;
                            playersInGame--;
                            break;
                    }
                }
                if (currentCardIndex < deck.length - players.length) {
                    currentCardIndex++;
                } else {
                    break exit;
                }
            }
        } while (playersInGame > 0);
    }

    public static void showScores(String[] players, int[] playersScores) {
        System.out.println("\n============Blackjack results!===========");
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + players[i] + " scores: " + (playersScores[i] - 100000));
        }
    }

    public static void showPlayers(String[] players) {
        System.out.println("============Blackjack players:===========");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
    }

    public static int[] createDeck() {
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        return deck;
    }

    public static void shuffleDeck(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int newIndex = (int)(Math.random() * (deck.length - 1));
            int card = deck[i];
            deck[i] = deck[newIndex];
            deck[newIndex] = card;
        }
    }
}
