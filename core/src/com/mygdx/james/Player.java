package com.mygdx.james;

import java.util.ArrayList;
import java.util.Objects;

public class Player {
    int player;
    ArrayList<Card> publics = new ArrayList<>();
    ArrayList<Card> privates = new ArrayList<>();
    ArrayList<Card> currents = new ArrayList<>();

    Player(int player) {
        this.player = player;
    }

    //TODO Complete the layCard Method
    public void layCard(int c) {
        for(Card card : currents){
            System.out.print(card.getCard());
        }

    }

    public ArrayList<Card> getCurrents() {
        return currents;
    }

    public ArrayList<Card> getPrivates() {
        return privates;
    }

    public ArrayList<Card> getPublics() {
        return publics;
    }

    public void showPublics() {
        for(Card p : publics){
            System.out.print(p.getCard());
        }
    }

    public void showCurrents() {
        //currents.forEach(c -> System.out.print(c.getCard()));
        for(Card c : currents){
            System.out.print(c.getCard());
        }
    }

    public int getPlayer() {
        return player;
    }

    //TODO Create addPublic, addPrivate, addCurrent methods
}
