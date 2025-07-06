package local;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Durationtest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowo = LocalDateTime.now().plusYears(2).plusMinutes(1);
        LocalTime timenow = LocalTime.now();
        LocalTime timeM = LocalTime.now().minusMinutes(7);


        //-----------------------//
        Duration d1 = Duration.between(now,nowo);
        Duration d2 = Duration.between(timenow,timeM);
        Duration d3 = Duration.between(Instant.now(),Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofMinutes(3);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);


    }
}
