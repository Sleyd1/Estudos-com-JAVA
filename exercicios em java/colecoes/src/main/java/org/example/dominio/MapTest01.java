package org.example.dominio;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("voce", "Você");
        map.put("bd", "bom dia");
        map.put("ola", "oi");
        System.out.println(map);

        for (String i : map.keySet()){
            System.out.println("chave: "+i);
        }

        System.out.println("\n------------\n");
        for (String i : map.values()){
            System.out.println("Valor: "+i);

        }

        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " - "+ entry.getValue());
        }


    }
}
