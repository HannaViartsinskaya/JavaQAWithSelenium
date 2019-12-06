package com.collections.maintask;

public enum Accessories {
    BOW(1.1), HOLIDAY_WRAP(1.4), MINI_TOY(2.5);
    private double priceAccessories;

    Accessories(double priceAccessories) {
        this.priceAccessories = priceAccessories;
    }

    public double getPriceAccessories() {
        return priceAccessories;
    }
}
