package org.example.CountingSundays;

import java.time.LocalDate;
import java.util.Locale;

public class CountingSundays {
    public static int countingSundays (int century){
        int counterSundays = 0;
        int startYear = (century-1) * 100;
        int endYear = startYear + 100;
        LocalDate date = null;

        for (int counter1 = startYear; counter1 <= endYear; counter1++) {

            for (int counter2 = 1; counter2 <= 12; counter2++) {

                date = LocalDate.of(counter1, counter2, 1);
                System.out.println(date.toString() + " " + date.getDayOfWeek().toString());
                counterSundays += "SUNDAY".equals(date.getDayOfWeek().toString()) ? 1 : 0;
                // System.out.println("SUNDAY".equals(date.getDayOfWeek().toString()) ? date.toString() + " " + counterSundays : "");
            }

        }



        return counterSundays;
    }
}
