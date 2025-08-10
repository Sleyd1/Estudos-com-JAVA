package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    private static List<DominioTest> lista = new ArrayList<>(List.of(new DominioTest("Round 6", 44),
            new DominioTest("Succession", 65),
            new DominioTest("The White Lotus",90)));

    public static void main(String[] args) {
        List<String> title = lista.stream().sorted(Comparator.comparing(DominioTest::getName))
                .filter(n -> n.getId() <= 70).limit(3)
                .map(DominioTest::getName).collect(Collectors.toList());

        System.out.println(title);
    }
}
