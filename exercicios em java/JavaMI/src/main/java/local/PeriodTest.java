package local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        LocalDate now  = LocalDate.now();
        LocalDate now2  = LocalDate.now().plusYears(2).plusDays(7);

        Period p1 = Period.between(now, now2);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(3);
    }
}
