package com.collections.maintask.classes;

import com.collections.maintask.enums.FlowerColor;
import com.collections.maintask.enums.FlowerType;

import java.util.Random;

import static com.collections.maintask.enums.FlowerType.getNameByCategory;

public class Flower {
    private int flowerId;
    private FlowerType flowerCategory;
    private String flowerName;
    private FlowerColor flowerColor;
    private double lengthStem;
    private int levelFresh; //from 1 to 3
    private double price;

    public Flower(int flowerId, FlowerType flowerCategory, String flowerName, FlowerColor flowerColor, double lengthStem, int levelFresh, double price) {
        this.flowerId = flowerId;
        this.flowerCategory = flowerCategory;
        this.flowerName = flowerName;
        this.flowerColor = flowerColor;
        this.lengthStem = lengthStem;
        this.levelFresh = levelFresh;
        this.price = price;
    }


    public Flower(int flowerId, double lengthStem, int levelFresh, double price) {
        this.flowerId = flowerId;
        this.lengthStem = lengthStem;
        FlowerType flowerType = getRandomFlowerType();
        String nameFlower = getNameByCategory(flowerType);
        this.flowerColor = getRandomFlowerColor();
        this.flowerCategory = flowerType;
        this.flowerName = nameFlower;
        this.levelFresh = levelFresh;
        this.price = price;
    }

    public int getFlowerId() {
        return flowerId;
    }


    public void setFlowerId(int flowerId) {
        this.flowerId = flowerId;
    }

    public FlowerType getFlowerCategory() {
        return flowerCategory;
    }

    public void setFlowerCategory(FlowerType flowerCategory) {
        this.flowerCategory = flowerCategory;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public FlowerColor getFlowerColor() {
        return flowerColor;
    }


    public FlowerColor getRandomFlowerColor() {
        Random random = new Random();
        FlowerColor flowerColor = FlowerColor.values()[random.nextInt(FlowerColor.values().length)];
        return flowerColor;
    }

    public FlowerType getRandomFlowerType() {
        Random random = new Random();
        FlowerType flowerType = FlowerType.values()[random.nextInt(FlowerType.values().length)];
        return flowerType;
    }

    public void setFlowerColor(FlowerColor flowerColor) {
        this.flowerColor = flowerColor;
    }

    public double getLengthStem() {
        return lengthStem;
    }

    public void setLengthStem(double lengthStem) {
        this.lengthStem = lengthStem;
    }

    public int getLevelFresh() {
        return levelFresh;
    }

    public void setLevelFresh(int levelFresh) {
        this.levelFresh = levelFresh;
    }

    @Override
    public String toString() {
        return "Тип цветка " + flowerCategory +
                ", название " + flowerName +
                ", цвет " + flowerColor +
                ", длина стебля " + lengthStem +
                ", уровень свежести " + levelFresh;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}
