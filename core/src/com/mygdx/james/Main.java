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

    }
}
