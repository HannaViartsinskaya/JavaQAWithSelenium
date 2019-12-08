package com.collections.maintask.enums;

public enum FlowerColor {
    RED, BLUE, YELLOW, WHITE, GREEN, PINK;



    public static String getColor(FlowerColor flowerColor) {
        String color = "";
        switch (flowerColor) {
            case RED:
                color = "Красный";
                break;
            case BLUE:
                color = "Голубой";
                break;
            case YELLOW:
                color = "Желтый";
                break;
            case WHITE:
                color = "Белый";
                break;
            case GREEN:
                color = "Зеленый";
                break;
            case PINK:
                color = "Розовый";
                break;
            default:
                color = "Цвет не найден";

        }
        return color;
    }
}
