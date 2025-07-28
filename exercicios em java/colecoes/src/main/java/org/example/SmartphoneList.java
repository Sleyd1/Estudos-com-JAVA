package org.example;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneList {
    public static void main(String[] args) {
       Smartphone s1 = new Smartphone("1ABC1","Motorola");
       Smartphone s2 = new Smartphone("7ABC2","Iphone");
       Smartphone s3 = new Smartphone("5ABC4","Samsung");

        List<Smartphone> list = new ArrayList<>(6);

        list.add(s1);
        list.add(s3);
        list.add(0,s2);

        for (Smartphone s : list){
            System.out.println(s);

        }

        System.out.println(list.contains(s3));
        int indiceDoArray = list.indexOf(s3);
        System.out.println(indiceDoArray);
        System.out.println(list.get(indiceDoArray));
    }
}
