package com.collections.optionaltask;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

    public int compare(String o1, String o2)
    {
        return o1.length()-o2.length();
    }
}
