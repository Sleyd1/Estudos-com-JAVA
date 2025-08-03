package exemple2;

import org.example.dominio.OrdemTest;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("E");
        fila.add("A");
        fila.add("C");
        fila.add("B");
        for (String i : fila){
            System.out.println(i);
        }

    }
}
