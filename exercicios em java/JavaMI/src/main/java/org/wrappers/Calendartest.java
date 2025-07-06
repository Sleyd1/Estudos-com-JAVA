package org.wrappers;

import java.time.LocalDate;
import java.util.Calendar;

public class Calendartest {
    public static void main(String[] args) {
        Calendar dia =Calendar.getInstance();
        if (dia.getFirstDayOfWeek() == Calendar.SATURDAY){
            System.out.println("final de semana");
        }

        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);

    }

}
