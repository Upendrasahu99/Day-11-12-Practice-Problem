package com.bridgelebz.deck_of_cards;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DeckOfCards {

    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        private List<String> deck;

        public DeckOfCards() {
            deck = new ArrayList<>();
            for (String suit : SUITS) {
                for (String rank : RANKS) {
                    deck.add(rank + " of " + suit);
                }
            }
        }

        public void shuffle() {
            Collections.shuffle(deck, new Random());
        }

        public void distribute(String[][] players, int numberOfCards) {
            int k = 0;
            for (int i = 0; i < numberOfCards; i++) {
                for (int j = 0; j < players.length; j++) {
                    players[j][i] = deck.get(k);
                    k++;
                }
            }
        }

        public void print(String[][] players) {
            for (int i = 0; i < players.length; i++) {
                System.out.println("Player " + (i + 1) + ":");
                for (int j = 0; j < players[i].length; j++) {
                    System.out.println(players[i][j]);
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            DeckOfCards deckOfCards = new DeckOfCards();
            deckOfCards.shuffle();
            String[][] players = new String[4][9];
            deckOfCards.distribute(players, 9);
            deckOfCards.print(players);
        }

}
