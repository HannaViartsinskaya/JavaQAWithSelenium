package com.collections.maintask.enums;

public enum FlowerType {
    ROSE, LILY, GERBERA, TULIPAN, SUNFLOWER;


    public static String getNameByCategory(FlowerType flowerType) {
        String name = "";
        switch (flowerType) {
            case ROSE:
                name = "Роза";
                break;
            case LILY:
                name = "Лилия";
                break;
            case GERBERA:
                name = "Гербера";
                break;
            case TULIPAN:
                name = "Тюльпан";
                break;
            case SUNFLOWER:
                name = "Подсолнух";
                break;
            default:
                name = "Не определена";
        }
        return name;
    }
}
