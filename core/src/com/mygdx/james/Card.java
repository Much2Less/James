package com.mygdx.james;

public class Card {
    //2, 3, 4, 5, 6, 7, 8, 9, 10, 11=J, 12=Q, 13=K, 14=A
    int value;
    enum Color {HEART, TILES, CLOVERS, PIKES}
    Color color;

    Card(int value, Color color) {
        this.value = value;
        switch (color) {
            case HEART:
                this.color = Color.HEART;
                break;
            case TILES:
                this.color = Color.TILES;
                break;
            case CLOVERS:
                this.color = Color.CLOVERS;
                break;
            case PIKES:
                this.color = Color.PIKES;
                break;

        }

    }

    public Color getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }

    public String getCardString() {
        String value = "Value: ";
        String color = "Color: ";

        switch (getValue()) {
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

        switch (getColor()) {
            case HEART:
                color += "Heart\n";
                break;
            case CLOVERS:
                color += "Clovers\n";
                break;
            case PIKES:
                color += "Pikes\n";
                break;
            case TILES:
                color += "Tiles\n";
                break;
        }

        return value + color;

    }
}

