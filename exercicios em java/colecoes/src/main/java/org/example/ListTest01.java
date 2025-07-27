package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nos = new ArrayList();

        nos.add("oi");
        nos.add("bom dia");
        for(String i : nos){
            System.out.print(i+ " ");
        }

        nos.add("ola");
        for (int i = 0; i < nos.size(); i++) {
            System.out.println(nos.get(i));
        }
    }
}
