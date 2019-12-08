package com.collections.maintask;

import com.collections.maintask.classes.Boquet;
import com.collections.maintask.classes.Flower;
import com.collections.maintask.classes.SortByLevelFresh;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Boquet boquet=new Boquet();
        boquet.addFlower(new Flower(1, 1.5, 4, 3.5));
        boquet.addFlower(new Flower(2, 1.3,7,5.1));
        boquet.addFlower(new Flower(3, 2.1,9,9.0));
        boquet.addFlower(new Flower(4, 1.1,5,3.6));
        System.out.println(boquet.toString());
        System.out.println(boquet.messageForCustomer());
        System.out.printf("Средняя цена цветка в букете составляет %.2f %n",boquet.averagePriceForFlower());
        System.out.println("--------");
        System.out.println("Сортировка по уровню свежести\n");
        Collections.sort(boquet.getFlowers(), new SortByLevelFresh());
        System.out.println(boquet.toString());
        System.out.println("--------");
        System.out.println("\nЦветы в букете с минимальной длиной стебля 1.2 и максимальной до 3\n");
        boquet.searchingForLengthOfStem(1.5, 3.0);
    }
}
