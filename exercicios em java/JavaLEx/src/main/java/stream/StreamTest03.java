package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<DominioTest> lista = new ArrayList<>(List.of(new DominioTest("Round 6", 44),
            new DominioTest("Succession", 65),
            new DominioTest("The White Lotus",90)));

    public static void main(String[] args) {
        System.out.println(lista.stream().anyMatch(n -> n.getId() > 9));
        System.out.println(lista.stream().allMatch(n -> n.getId() > 0));
        System.out.println(lista.stream().noneMatch(n -> n.getId() < 0));

        lista.stream().filter(n -> n.getId() > 3).findAny().ifPresent(System.out::println);

        lista.stream().filter(n -> n.getId() > 3).sorted(Comparator.comparing(DominioTest::getId).reversed()).findFirst().ifPresent(System.out::println);


    }
}
