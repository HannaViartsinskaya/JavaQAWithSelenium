package com.collections.maintask;

public class Gerbera extends Flowers {

    public Gerbera(double price, String color, double lengthStem, int levelFresh) {
        super(price, color, lengthStem, levelFresh);
    }

    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Гербера " +
                super.toString();
    }
}
