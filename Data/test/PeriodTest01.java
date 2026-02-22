package Data.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate começoNamoro = LocalDate.of(2024, 9, 18);
        Period p1 = Period.between(now, começoNamoro);
        Period p2 = Period.ofDays(100);
        Period p3 = Period.ofWeeks(17);
        Period p4 = Period.ofMonths(20);
        Period p5 = Period.ofYears(10);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.DAYS));
    }
}
