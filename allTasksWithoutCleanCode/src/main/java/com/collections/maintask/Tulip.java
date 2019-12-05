package com.collections.maintask;

public class Tulip extends Flowers {


    public Tulip(double price, String color, double lengthStem, int levelFresh) {
        super(price, color, lengthStem, levelFresh);

    }

    @Override
    public String toString() {
        return "Тюльпан " +
                super.toString();
    }
}
