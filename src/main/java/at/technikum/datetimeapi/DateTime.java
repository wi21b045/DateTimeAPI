package at.technikum.datetimeapi;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime {

    public LocalDate getToday () {
        return LocalDate.now();
    }

    public LocalTime getNow(){
        return LocalTime.now();
    }
}
