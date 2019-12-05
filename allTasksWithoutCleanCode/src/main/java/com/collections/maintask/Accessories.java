package com.collections.maintask;

public enum Accessories {
    bow(1.1), holidayWrap(1.4), miniToy(2.5);
    private double priceAccessories;

    Accessories(double priceAccessories) {
        this.priceAccessories = priceAccessories;
    }

    public double getPriceAccessories() {
        return priceAccessories;
    }
}
