package com.collections.maintask.classes;

import java.util.Comparator;

public class SortByLevelFresh implements Comparator<Flower> {
    public int compare(Flower a, Flower b) {
        return a.getLevelFresh() - b.getLevelFresh();
    }
}
