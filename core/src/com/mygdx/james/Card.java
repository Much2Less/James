package com.mygdx.james;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

public class Card {
    //2, 3, 4, 5, 6, 7, 8, 9, 10, 11=J, 12=Q, 13=K, 14=A
    int value;
    enum Color {HEART, DIAMONDS, CLUBS, SPADES}

    private ShapeRenderer shapeRenderer;

    private Texture cardImage;
    float x,y,w,h,m;
    private Rectangle box;

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

        cardImage = new Texture(Gdx.files.internal(getImageName()));

        m = 2.25f;
        x = 128;
        y = 128;
        //width
        w = 94*m;
        //height
        h = 144*m;

        box = new Rectangle(x,y,w,h);

        //TODO Make method which sets the position of the card

    }

    public Color getColor() {
        return color;
    }

    public String getColorString() {
        switch (this.getColor()) {
            case HEART:
                return "Hearts";
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
        String color = this.getColorString().toLowerCase();
        int value = this.getValue();

        return "card-"+color+"-"+value+".png";

    }

    public Texture getCardImage() {
        return cardImage;
    }

    public Rectangle getBox() {
        return box;
    }

    public void setBox(Rectangle box) {
        this.box = box;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getW() {
        return w;
    }

    public void setW(float w) {
        this.w = w;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }
}

