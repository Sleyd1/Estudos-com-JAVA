package exemple2;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavgablemapTest01 {
    public static void main(String[] args) {
        NavigableMap<String,String> map = new TreeMap<>();
            map.put("A", "Letra A");
            map.put("B", "Letra B");
            map.put("C", "Letra C");
            map.put("D", "Letra D");

            for(Map.Entry<String , String> entrv: map.entrySet()){
                System.out.println(entrv.getKey() + entrv.getValue());
            }

        System.out.println(map.headMap("C"));


    }
}
