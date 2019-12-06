package com.collections.maintask;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Flowers ger1 = new Gerbera(5.9, "красный", 1.2, 2);
        Rose rose1 = new Rose(3.34, "Розовый", 4.65, 1);
        Rose rose2 = new Rose(4.34, "Синий", 2.34, 3);
        Boquet boquet1 = new Boquet(Accessories.HOLIDAY_WRAP);
        boquet1.addFlower(ger1);
        boquet1.addFlower(rose1);
        boquet1.addFlower(rose2);
        System.out.println(boquet1.toString());
        System.out.println("Сортировка по уровню свежести\n");
        Collections.sort(boquet1.getFlowers(), new SortByLevelFresh());
        System.out.println(boquet1.toString());
        System.out.println("\nЦветы в букете с минимальной длиной стебля 1.2 и максимальной до 3\n");
        boquet1.searchingForLengthOfStem(1.2, 3.0);
    }

}
