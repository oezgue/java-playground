package java8inAction.dateTime;

import java.time.*;
import java.util.Date;

public class Clock {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.of(1985, 6, 25);
//        Month month = Month.of(6);
//        System.out.println(month);
//        System.out.println(date);

        // Java 1.0
        Date date = new Date();
        System.out.println(date);


        //Java 8

        LocalTime localTime1 = LocalTime.of(14,20);
        LocalTime localTime2 = LocalTime.of(16,19, 30);

        // Duration verwenden, bei allem was Sekunden hat
        Duration d = Duration.between(localTime2, localTime1);
        //System.out.println(d);

        LocalDate localDate1 = LocalDate.of(1985, Month.JUNE, 25);
        LocalDate localDate2 = LocalDate.of(1978, Month.OCTOBER, 3);

        // Bei Date (hat keine Uhrzeit) verwendet man Period
        Period period = Period.between(localDate1, localDate2);
        System.out.println(period); // P-6Y-8M-22D -> Period

        // Date + Time
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1, localTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate2, localTime2);

        // Duration zeigt immer Stunden und Sekunden an
        Duration durationLong = Duration.between(localDateTime1, localDateTime2);
        System.out.println(durationLong); // PT-58966H-30S -> Period of Time

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime1, ZoneId.of("Europe/Berlin"));
        System.out.println(zonedDateTime);

    }
}
