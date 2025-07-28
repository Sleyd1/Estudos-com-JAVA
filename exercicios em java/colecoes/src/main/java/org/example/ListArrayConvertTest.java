package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConvertTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Integer[] listToArray = numbers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        Integer[] numeros = new Integer[3];
        numeros[0] = 1;
        numeros[1] = 1;
        numeros[2] = 1;

        List<Integer> arrayToList = Arrays.asList(numeros);
        System.out.println(arrayToList);

        List<Integer> arrayToList2 =new ArrayList<>(Arrays.asList(numeros));
        arrayToList2.add(20);
        System.out.println(arrayToList2);
    }
}
