package local;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Temp {
    public static void main(String[] args) {
        LocalTime timeN = LocalTime.now();
        LocalTime localOf = LocalTime.of(23,30,12);
        System.out.println(timeN);
        System.out.println(localOf);
        System.out.println(timeN.getHour());
        System.out.println(timeN.getMinute());
        System.out.println(timeN.getSecond());
        System.out.println(timeN.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(localOf.MAX);
        System.out.println(localOf.MIN);
    }
}
