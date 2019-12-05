package com.collections.maintask;

import java.util.Comparator;

public class SortByLevelFresh implements Comparator<Flowers> {
    public int compare(Flowers a, Flowers b) {
        return a.getLevelFresh() - b.getLevelFresh();
    }
}
