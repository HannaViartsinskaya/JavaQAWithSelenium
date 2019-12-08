package com.collections.maintask.enums;

public enum Accessories {
    BOW(1.1), HOLIDAY_WRAP(1.4), MINI_TOY(1.6);
    private double priceAccessories;

    Accessories(double priceAccessories) {
        this.priceAccessories = priceAccessories;
    }

    public double getPriceAccessories() {
        return priceAccessories;
    }
}
