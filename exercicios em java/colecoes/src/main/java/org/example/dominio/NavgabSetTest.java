package org.example.dominio;

import java.util.*;

class OrdemPreco implements Comparator<OrdemTest> {
    @Override
    public int compare(OrdemTest o1, OrdemTest o2) {
        return Double.compare(o1.getPreco(),o2.getPreco());
    }
}

public class NavgabSetTest {
    public static void main(String[] args) {

        OrdemTest exq = new OrdemTest(1l,"wlsm",33.00);
        OrdemTest exq2 = new OrdemTest(3l,"blsm",34.00);
        OrdemTest exq3 = new OrdemTest(2l,"alsm",31.00);
        OrdemTest exq4 = new OrdemTest(2l,"Aalsm",39.00);

        NavigableSet<OrdemTest> listO = new TreeSet<>(new OrdemPreco());
        listO.add(exq);
        listO.add(exq2);
        listO.add(exq3);
        listO.add(exq4);

        for (OrdemTest o : listO){
            System.out.println(o);
        }

        /* Ordem inversa
        for (OrdemTest o : listO.descendingSet()){
            System.out.println(o);
        }

         */
        OrdemTest exq5 = new OrdemTest(1l,"wlsm",40.00);
        System.out.println(listO.size());
        System.out.println(listO.pollFirst());//remove a primera posiçao
        //System.out.println(listO.pollLast());//remove a ultima posiçao

        System.out.println(listO.size());
        /*
        * lower <
        * floor <=
        * higher >
        * ceiling >=
        * */
        System.out.println("\n--------------------\n");
        System.out.println(listO.floor(exq2));
        System.out.println(listO.lower(exq5));
        System.out.println(listO.higher(exq3));
        System.out.println(listO.ceiling(exq2));
    }
}
