package vererbung;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Uhr {
    private int time;

    Uhr() {

    }

    public String tellTime() {
        LocalTime lcl = LocalTime.now();
        DateTimeFormatter stundenformat = DateTimeFormatter.ofPattern("HH:mm:ss");

        return lcl.format(stundenformat);

    }
}
