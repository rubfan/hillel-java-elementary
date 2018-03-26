<<<<<<< HEAD
package ua.od.hillel;
=======
﻿package ua.od.hillel;
>>>>>>> 12455952ea2e25e89b64f7ecb9c96191b7f22ecf

import java.util.Scanner;

/**
 * Created by ruslangramatic on 3/4/18.
 */
public class Lesson6 {





    public static void main(String[] args) {
        //====Step-0 initialisation====
        String[] cards = {
<<<<<<< HEAD
            "6 чирва","7 чирва","8 чирва","9 чирва","10 чирва","J чирва","Q чирва","K чирва","A чирва",
            "6 буба","7 буба","8 буба","9 буба","10 буба","J буба","Q буба","K буба","A буба",
            "6 пика","7 пика","8 пика","9 пика","10 пика","J пика","Q пика","K пика","A пика",
            "6 крест","7 крест","8 крест","9 крест","10 крест","J крест","Q крест","K крест","A крест"
        };

        int[] costs = {
            6, 7, 8, 9, 10, 10, 10, 10, 11,
            6, 7, 8, 9, 10, 10, 10, 10, 11,
            6, 7, 8, 9, 10, 10, 10, 10, 11,
            6, 7, 8, 9, 10, 10, 10, 10, 11
=======
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
>>>>>>> 12455952ea2e25e89b64f7ecb9c96191b7f22ecf
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

<<<<<<< HEAD
        //====Step-4 Play====
        play(args, playersScores, costs, deck, cards, playersInGame, currentCardIndex, scanner);

        // ====Step-5 Winners====
        showWinners(args, playersScores);
    }

=======
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
>>>>>>> 12455952ea2e25e89b64f7ecb9c96191b7f22ecf

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
<<<<<<< HEAD
                            playersScores[i] += costs[deck[currentCardIndex]];
                            System.out.println("Your card is: (" + cards[deck[currentCardIndex]] + ") and you scored " + playersScores[i] + " points!");
=======
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

>>>>>>> 12455952ea2e25e89b64f7ecb9c96191b7f22ecf
                            break;
                        case "n":
                            playersScores[i] += 100000;
                            playersInGame--;
                            break;
                    }
                }
<<<<<<< HEAD
                if (currentCardIndex < 36) {
=======
                if (currentCardIndex < deck.length - players.length) {
>>>>>>> 12455952ea2e25e89b64f7ecb9c96191b7f22ecf
                    currentCardIndex++;
                } else {
                    break exit;
                }
            }
        } while (playersInGame > 0);
    }

<<<<<<< HEAD
    public static void showWinners(String[] players, int[] playersScores) {
=======
    public static void showScores(String[] players, int[] playersScores) {
>>>>>>> 12455952ea2e25e89b64f7ecb9c96191b7f22ecf
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
<<<<<<< HEAD
        int[] deck = new int[36];
        for (int i = 0; i < 36; i++) {
=======
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
>>>>>>> 12455952ea2e25e89b64f7ecb9c96191b7f22ecf
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
