package Data.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeTest01 {
    static void main(String[] args) {
        LocalTime tempo = LocalTime.of(22,27,35);
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd ' at ' HH:mm:ss");

        System.out.println(tempo);
        System.out.println(agora.format(fmt));
    }
}
