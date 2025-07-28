package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest02 {
    public static void main(String[] args) {
        List<Double> dou = new ArrayList<>();
        dou.add(10d);
        dou.add(1d);
        dou.add(6.55);

        System.out.println(dou);

        Collections.sort(dou);
        System.out.println(dou);
    }
}
