package zzdoption;

import java.util.List;
import java.util.Optional;

public class OptionTest01 {
    public static void main(String[] args) {
        Optional<String> nameOption = findName("William");
        String empty = nameOption.orElse("EMPITY");
        System.out.println(empty);
        nameOption.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    public static Optional<String> findName(String name){
        List<String> list = List.of("William","Marques");
        int i = list.indexOf(name);
        if (i != 1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
