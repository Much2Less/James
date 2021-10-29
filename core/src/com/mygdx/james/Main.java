package com.mygdx.james;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
/*
        deck.fillDeck(Card.Color.HEART);
        deck.fillDeck(Card.Color.CLOVERS);
        deck.fillDeck(Card.Color.PIKES);
        deck.fillDeck(Card.Color.TILES);
*/

/*
        deck.cards.forEach(card -> System.out.println(card.getCard()));

        deck.shuffleDeck();
        System.out.println("SHUFFLED DECK");
        System.out.println("SHUFFLED DECK");
        System.out.println("SHUFFLED DECK");
        System.out.println("SHUFFLED DECK");
        System.out.println("SHUFFLED DECK");
        System.out.println("SHUFFLED DECK");
        System.out.println("SHUFFLED DECK");
        System.out.println("SHUFFLED DECK");
        System.out.println("SHUFFLED DECK");
        System.out.println("SHUFFLED DECK");
        System.out.println("SHUFFLED DECK");

        deck.cards.forEach(card -> System.out.println(card.getCard()));
*/

        //First Step of the game, fill the deck with cards and shuflle the cards randomly
        deck.fillAllColors();
        deck.shuffleDeck();
        //The cards will be distributed to each player of the game
        for (Player p:deck.players) {
            deck.distributeCards(p);
        }

        //TODO Complete Gameflow in Main
        //TODO Make a class Gameflow

        /*
        TODO CUI Programming:
          User sees his Cards and can Use them (Keyboard Button: 1-3)
          If the user has two or more cards of the same value he can lay them all together
          If the user lays 4 cards of the same value, the current deck gets ended
          User can see his own and other public cards (Keyboard Button: 4)
          After pressing the button 4, the player will be sent to another screen where
          they can choose which player deck they want to see or go back if they want
          User can end the current deck if he thinks there are 4 cards of the same value (Keyboard Button: 5)
          User can take the current deck on his hand if he is not able to lay a legal card (Keyboard Button: 9)
         */

        /*
        TODO
            If some player has a 4 on his current deck he begins the game
            If two or more players have a 4, then the player with the first index begins the game
            If no one has a 4 in his current deck
         */
    }
}
