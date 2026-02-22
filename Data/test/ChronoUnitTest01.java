package Data.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    static void main(String[] args) {
        LocalDateTime evelynBirthday = LocalDateTime.of(2008, Month.APRIL,25,00,0,1);
        LocalDateTime brunoBirthday = LocalDateTime.of(2006, Month.NOVEMBER,29,00,0,1);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.SECONDS.between(evelynBirthday, now) + " segundos de vida");
        System.out.println(ChronoUnit.DAYS.between(evelynBirthday, now) + " dias de vida");
        System.out.println(ChronoUnit.WEEKS.between(evelynBirthday, now) + " semanas de vida");
        System.out.println(ChronoUnit.MONTHS.between(evelynBirthday, now)+ " meses de vida");
        System.out.println(ChronoUnit.YEARS.between(evelynBirthday, now)+ " anos de vida");
        System.out.println("---------------------------------");
        System.out.println(ChronoUnit.SECONDS.between(brunoBirthday, now) + " segundos de vida");
        System.out.println(ChronoUnit.DAYS.between(brunoBirthday, now) + " dias de vida");
        System.out.println(ChronoUnit.WEEKS.between(brunoBirthday, now) + " semanas de vida");
        System.out.println(ChronoUnit.MONTHS.between(brunoBirthday, now)+ " meses de vida");
        System.out.println(ChronoUnit.YEARS.between(brunoBirthday, now)+ " anos de vida");
    }
}
