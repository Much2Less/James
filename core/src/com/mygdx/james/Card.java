package com.mygdx.james;

import com.badlogic.gdx.graphics.Texture;

public class Card {
    //2, 3, 4, 5, 6, 7, 8, 9, 10, 11=J, 12=Q, 13=K, 14=A
    int value;
    enum Color {HEART, DIAMONDS, CLUBS, SPADES}
    private Texture cardImage;
    Color color;

    Card(int value, Color color) {
        this.value = value;
        switch (color) {
            case HEART:
                this.color = Color.HEART;
                break;
            case DIAMONDS:
                this.color = Color.DIAMONDS;
                break;
            case CLUBS:
                this.color = Color.CLUBS;
                break;
            case SPADES:
                this.color = Color.SPADES;
                break;

        }

    }

    public Color getColor() {
        return color;
    }

    public String getColorString() {
        switch (this.getColor()) {
            case HEART:
                return "Heart";
            case CLUBS:
                return "Clubs";
            case SPADES:
                return "Spades";
            case DIAMONDS:
                return "Diamonds";
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public String getCardString() {
        String value = "Value: ";
        String color = "Color: ";

        switch (this.getValue()) {
            case 11:
                value += "Jack\n";
                break;
            case 12:
                value += "Queen\n";
                break;
            case 13:
                value += "King\n";
                break;
            case 14:
                value += "Ace\n";
                break;
            default:
                value += getValue() + "\n";
        }

        color += getColorString() + "\n";

        return value + color;

    }

    //TODO needs some testing
    public String getImageName() {
        String color = this.getColorString().toLowerCase()+"-";
        int value = this.getValue();

        return "card-"+color+(value)+".png";

    }
}

