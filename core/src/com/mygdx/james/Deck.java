package com.mygdx.james;

import java.util.*;
import java.util.ArrayList;

//TODO Add Joker Card

public class Deck {
    //Number of cards per color
    int n = 13;

    //From this deck you can take new cards for your deck (distributeCards, addCurrent/Public/Private)
    ArrayList<Card> cards = new ArrayList<>();

    //This deck is for laying the cards (layCard)
    ArrayList<Card> pile = new ArrayList<>();

    //If a deck is finished, it lands in the trash
    ArrayList<Card> trash = new ArrayList<>();

    //List of players
    ArrayList<Player> players = new ArrayList<>();

    //Card that lays on top of the pile
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
        fillDeck(Card.Color.CLUBS);
        fillDeck(Card.Color.DIAMONDS);
        fillDeck(Card.Color.SPADES);
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
