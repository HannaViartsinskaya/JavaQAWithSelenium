package com.collections.maintask;

import java.util.ArrayList;

public class Boquet extends Flowers {
    private double priceBoquet;
    private Accessories accessories;
    private ArrayList<Flowers> flowers = new ArrayList<Flowers>();


    Boquet(Accessories accessories) {
        priceBoquet += accessories.getPriceAccessories();
        this.accessories = accessories;
    }

    public Boquet addFlower(Flowers flower) {
        flowers.add(flower);
        priceBoquet += flower.getPrice();
        return this;
    }


    public ArrayList<Flowers> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flowers> flowers) {
        this.flowers = flowers;
    }


    @Override
    public String toString() {
        int n;
        String res = "";
        n = flowers.size();
        res += "Общая цена букета " +
                priceBoquet +
                ", аксессуары " + accessories + " \nЦветы:\n";
        for (int i = 0; i < n; i++) {
            res += flowers.get(i).toString();
            res += "\n";
        }
        return res;

    }

    public void searchingForLengthOfStem(double minLength, double maxLength) {
        for (int i = 0; i < flowers.size(); i++) {
            if (flowers.get(i).getLengthStem() >= minLength && flowers.get(i).getLengthStem() <= maxLength) {
                System.out.println(flowers.get(i).toString());
            }
        }
    }
}
