package zzdoption;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionEx01 {
    private static List<Titulos> titulos = List.of(new Titulos("package zzdoption",1),
            new Titulos("Lost",2),
            new Titulos("Twin Peaks",3));

    public static void main(String[] args) {
        Optional<Titulos> l =  acharTitulo("Lost");
        l.ifPresent(m -> m.setTitulo("Lost2"));
        System.out.println(l);

        Optional<Titulos> exId =  acharId(3);
        exId.orElseThrow(IllegalArgumentException::new);
        System.out.println(exId);

        Optional<Titulos> td =  acharTitulo("The Leftovers");
        td = td.or(() -> Optional.of(new Titulos("The Leftovers", 5)));
        System.out.println(td);


    }

    public static Optional<Titulos> acharTitulo(String titulo){
        return acharTi(m -> m.getTitulo().equals(titulo));

    }
    public static Optional<Titulos> acharId(Integer id){
        Optional<Titulos> titulos1 = acharTi(m -> m.getId().equals(id));
        return titulos1;

    }

    public static Optional<Titulos> acharTi(Predicate<Titulos> titulo){
        Titulos found = null;
        for (Titulos t : titulos){
            if (titulo.test(t)) {
                found = t;
            }
        }
        return Optional.ofNullable(found);

    }



}
