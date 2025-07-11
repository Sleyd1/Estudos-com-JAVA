package org.wrappers;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.zip.DataFormatException;

public class CalendarTestt {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getDateInstance();
        df[1] = DateFormat.getInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);


        for (DateFormat data : df){
            System.out.println(data.format(calendar.getTime()));
        }

    }
}
