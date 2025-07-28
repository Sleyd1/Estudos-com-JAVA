package org.example;

import org.example.dominio.Consumidor;
import org.example.dominio.OrdemTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor cons1 = new Consumidor("navi");
        Consumidor cons2 = new Consumidor("angelica");


        OrdemTest exp = new OrdemTest(1l,"wlsm",30.00);
        OrdemTest exp2 = new OrdemTest(3l,"blsm",30.00);
        OrdemTest exp3 = new OrdemTest(2l,"alsm",30.00);
        OrdemTest exp4 = new OrdemTest(4l,"aalsm",30.00);

        //Map<Consumidor , OrdemTest> map = new HashMap<>();
        //map.put(cons1, exp);

        List<OrdemTest> ms = List.of(exp,exp2);
        List<OrdemTest> ms2 = List.of(exp3,exp4);

        Map<Consumidor , List<OrdemTest>> map = new HashMap<>();

        map.put(cons1,ms);
        map.put(cons2, ms2);

        for (Map.Entry<Consumidor, List<OrdemTest>> i : map.entrySet()){
            System.out.println(i.getKey().getNome() + " - " + i.getValue());
            for (OrdemTest e : i.getValue()){
                System.out.println(exp.getNome());
            }
        }


        /*
        for (Map.Entry<Consumidor, OrdemTest> i : map.entrySet()){
            System.out.println(i.getKey().getNome() + " - " + i.getValue().getNome());
        }*/





    }
}
