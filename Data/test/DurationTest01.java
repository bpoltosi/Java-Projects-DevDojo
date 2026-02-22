package Data.test;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest01 {
    static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime começoNamoro = LocalDateTime.of(2024, 9, 18, 0, 0);
        Duration duration1 = Duration.between(now, começoNamoro);

        long totalSegundos = Math.abs(duration1.getSeconds());
        long dias = totalSegundos / (24 * 3600);
        long horas = (totalSegundos % (24 * 3600)) / 3600;

        System.out.printf("Foram %d dias e %d horas de namoro.%n",
                dias, horas);
        System.out.println("Ou melhor...");

        long horasTotais = Math.abs(duration1.toHours());
        System.out.println(horasTotais + " horas");

        long minutosTotais = Math.abs(duration1.toMinutes());
        System.out.println(minutosTotais + " minutos");

        long segundosTotais = Math.abs(duration1.toSeconds());
        System.out.println(segundosTotais + " segundos");

        System.out.println("--------------------------------------------------");

    }
}
