package com.collections.maintask;

public class Rose extends Flowers {


    public Rose(double price, String color, double lengthStem, int levelFresh) {
        super(price, color, lengthStem, levelFresh);

    }


    @Override
    public String toString() {
        return "Роза " +
                super.toString();
    }
}
