package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class hashsetSet {
    public static void main(String[] args) {
        //Set<Integer> intd = new HashSet<>();
        Set<Integer> intd = new LinkedHashSet<>();//matem na ordem de inserção
        intd.add(5);
        intd.add(4);
        intd.add(9);
        intd.add(0);
        intd.add(0);//elemento duplicado


        System.out.println(intd);

    }
}
