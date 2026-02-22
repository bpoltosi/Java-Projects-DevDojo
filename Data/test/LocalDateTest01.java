package Data.test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2025,1,1);
        LocalDate now = LocalDate.now();
//        System.out.println(date.getYear());
//        System.out.println(date.getDayOfMonth());
//        System.out.println(date.getDayOfYear());
//        System.out.println(date.isLeapYear());
//        System.out.println(date.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
        System.out.println(date);
        System.out.println(now);
    }
}
