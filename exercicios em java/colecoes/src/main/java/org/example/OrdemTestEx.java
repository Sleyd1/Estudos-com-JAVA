package org.example;

import org.example.dominio.OrdemTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class OrdemTById implements Comparator<OrdemTest>{
    @Override
    public int compare(OrdemTest o1, OrdemTest o2) {
        return o1.getId().compareTo(o2.getId());
    }



}

public class OrdemTestEx {
    public static void main(String[] args) {
        OrdemTest exq = new OrdemTest(1l,"wlsm",30.00);
        OrdemTest exq2 = new OrdemTest(3l,"blsm",30.00);
        OrdemTest exq3 = new OrdemTest(2l,"alsm",30.00);

        List<OrdemTest> listO = new ArrayList<>();
        listO.add(exq);
        listO.add(exq2);
        listO.add(exq3);

        Collections.sort(listO);//por nome
        for (OrdemTest i : listO){
            System.out.println(i.toString());
        }
        System.out.println("------------------------\n");

        // Por id
        Collections.sort(listO, new OrdemTById());//por nome
        for (OrdemTest i : listO){
            System.out.println(i.toString());
        }






    }
}
