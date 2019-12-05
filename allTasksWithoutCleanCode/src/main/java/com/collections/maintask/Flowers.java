package com.collections.maintask;

public class Flowers {
    int id;
    private double price;
    private String color;
    private double lengthStem;
    private int levelFresh; //from 1 to 3

    Flowers() {
    }

    Flowers(double price, String color, double lengthStem, int levelFresh) {
        this.id = 1000 + (int) (Math.random() * ((9999 - 1000) + 1));
        if (price < 0) {
            throw new IllegalArgumentException("Price can't be negative");
        }
        this.price = price;
        if (color == null) {
            throw new NullPointerException("The color can't be empty");
        }
        this.color = color;
        if (lengthStem < 0) {
            throw new IllegalArgumentException("Length of stem can't be negative");
        }
        this.lengthStem = lengthStem;
        if (levelFresh <= 0 || levelFresh >= 4) {
            throw new IllegalArgumentException("Level of fresh flower should be from 1(low) to 3(hight)");
        }
        this.levelFresh = levelFresh;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flowers)) return false;

        Flowers flowers = (Flowers) o;

        if (getId() != flowers.getId()) return false;
        if (Double.compare(flowers.getLengthStem(), getLengthStem()) != 0) return false;
        if (getLevelFresh() != flowers.getLevelFresh()) return false;
        return getColor() != null ? getColor().equals(flowers.getColor()) : flowers.getColor() == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId();
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        temp = Double.doubleToLongBits(getLengthStem());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getLevelFresh();
        return result;
    }

    @Override
    public String toString() {
        return "Цена " + price + " [id " + id + "] цвет " + color +
                ", длина стебля " + lengthStem +
                ", степень свежести " + levelFresh;
    }

}
