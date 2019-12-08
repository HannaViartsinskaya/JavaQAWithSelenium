package com.collections.maintask.classes;

import com.collections.maintask.enums.Accessories;
import com.collections.maintask.interfaces.IGoodsForSale;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Boquet implements IGoodsForSale {
    private double priceBoquet;
    private Accessories accessories;
    private List<Flower> flowers = new ArrayList<Flower>();

    public Boquet() {
        Accessories accessories=getRandomAccessories();
        this.accessories = accessories;
        priceBoquet += accessories.getPriceAccessories();
    }

    public Boquet addFlower(Flower flower) {
        flowers.add(flower);
        priceBoquet += flower.getPrice();
        return this;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public final Accessories getRandomAccessories() {
        Random random = new Random();
        Accessories accessories = Accessories.values()[random.nextInt(Accessories.values().length)];
        return accessories;
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

    public double averagePriceForFlower() {
       return ((priceBoquet*(100-percentOfDiscount())/100)-accessories.getPriceAccessories())/flowers.size();
    }

    public int percentOfDiscount() {
        return priceBoquet>15.0 ? 5:0;
    }

    public String messageForCustomer() {
        double pr=priceBoquet*(100-percentOfDiscount())/100;
        return "Спасибо, что выбрали нас. Окончательная цена с применением скидки "+ percentOfDiscount()+"%"+
                " составляет "+pr ;
    }
    public void searchingForLengthOfStem(double minLength, double maxLength) {
        for (int i = 0; i < flowers.size(); i++) {
            if (flowers.get(i).getLengthStem() >= minLength && flowers.get(i).getLengthStem() <= maxLength) {
                System.out.println(flowers.get(i).toString());
            }
        }
    }
}
