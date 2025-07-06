package local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Chronounittest {
    public static void main(String[] args) {
        LocalDateTime aniversio = LocalDateTime.of(2006, Month.APRIL, 15,20,4);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Se passaram " +ChronoUnit.DAYS.between(aniversio,now)+ " dias desde o seu nascimento");
        System.out.println("Se passaram " +ChronoUnit.WEEKS.between(aniversio,now)+ " semanas desde o seu nascimento");
        System.out.println("Se passaram " +ChronoUnit.MONTHS.between(aniversio, now)+ " meses desde o seu nascimento");
        System.out.println("Se passaram " + ChronoUnit.YEARS.between(aniversio, now) + " anos desde o seu nascimento");

    }
}
