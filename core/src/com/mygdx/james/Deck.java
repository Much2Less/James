package com.mygdx.james;

import java.sql.Array;
import java.util.*;
import java.util.ArrayList;

//TODO Add Joker Card

public class Deck {
    //Number of cards per color
    int n = 13;
    int size;
    ArrayList<Card> cards = new ArrayList<>();
    ArrayList<Card> pile = new ArrayList<>();
    ArrayList<Player> players = new ArrayList<>();
    Card top;

    //fills deck with cards in order of value
    public void fillDeck(Card.Color color) {
        int j = 2;
        for (int i = 0; i < n; i++) {
            cards.add(i, new Card(j, color));
            j++;
        }
    }

    public void fillAllColors() {
        fillDeck(Card.Color.HEART);
        fillDeck(Card.Color.CLOVERS);
        fillDeck(Card.Color.TILES);
        fillDeck(Card.Color.PIKES);
    }

    //randomizes set of cards
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    //TODO Rework code
    public void distributeCards(Player player) {
        player.privates.add(cards.get(cards.size()-1));
        cards.remove(cards.size()-1);
        player.privates.add(cards.get(cards.size()-1));
        cards.remove(cards.size()-1);
        player.privates.add(cards.get(cards.size()-1));
        cards.remove(cards.size()-1);
        player.publics.add(cards.get(cards.size()-1));
        cards.remove(cards.size()-1);
        player.publics.add(cards.get(cards.size()-1));
        cards.remove(cards.size()-1);
        player.publics.add(cards.get(cards.size()-1));
        cards.remove(cards.size()-1);
        player.currents.add(cards.get(cards.size()-1));
        cards.remove(cards.size()-1);
        player.currents.add(cards.get(cards.size()-1));
        cards.remove(cards.size()-1);
        player.currents.add(cards.get(cards.size()-1));
        cards.remove(cards.size()-1);
    }

    public void giveCards(Player player) {
        player.currents.add(cards.get(cards.size()-1));
        cards.remove(cards.size()-1);
    }

    public void setTop() {
        this.top = cards.get(cards.size()-1);
    }

    public Card getTop() {
        return top;
    }
}
