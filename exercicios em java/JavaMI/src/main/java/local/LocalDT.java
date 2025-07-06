package local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDT {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.parse("23:40:00");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        //-----------------------//
        LocalDateTime ldg = date.atTime(time);
        LocalDateTime dtd = time.atDate(date);
        System.out.println(ldg);
        System.out.println(dtd);

    }
}
