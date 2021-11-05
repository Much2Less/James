package com.mygdx.james;

import java.util.ArrayList;

public class Player {
    int playerNumber;
    String name;
    ArrayList<Card> publics = new ArrayList<>();
    ArrayList<Card> privates = new ArrayList<>();
    ArrayList<Card> currents = new ArrayList<>();

    Player() {

    }

    Player(int n) {
        this.playerNumber = n;
    }

    Player(int n, String name) {
        this.playerNumber = n;
        this.name = name;
    }

    //Removes one or more current cards from the player
    public void layCard(int[] c) {
        for (int i: c) {
            this.currents.remove(i);
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
            System.out.print(p.getCardString());
        }
    }

    public void showCurrents() {
        //currents.forEach(c -> System.out.print(c.getCard()));
        for(Card c : currents){
            System.out.print(c.getCardString());
        }
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    //TODO Create addPublic, addPrivate, addCurrent methods

    public void addPublic(Card c) {
        this.publics.add(c);
    }

    public void addPrivate(Card c) {
        this.privates.add(c);

    }

    public void addCurrent(Card c) {
        this.currents.add(c);

    }

}
