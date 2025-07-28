package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(4);
        number.add(9);
        number.add(0);

        Iterator<Integer> exemploInt = number.iterator();
        while (exemploInt.hasNext()) {
            if (exemploInt.next() == 0) {
                exemploInt.remove();
            }
        }
        System.out.println(number);

    }
}
