package adapter_pattern;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ExternalBusinessDayCalculator {
    public boolean checkBusinessDay(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        return day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY;
    }
}
