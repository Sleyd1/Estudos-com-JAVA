package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<DominioTest> lista = new ArrayList<>(List.of(new DominioTest("Round 6", 44),
            new DominioTest("Succession", 65),
            new DominioTest("The White Lotus",90)));

    public static void main(String[] args) {
        Stream<DominioTest> str = lista.stream();
        lista.forEach(System.out::println);

        long counte = str.distinct().filter(n -> n.getId() <=60).count();

        System.out.printf("%d item(s)",counte);


    }
}
