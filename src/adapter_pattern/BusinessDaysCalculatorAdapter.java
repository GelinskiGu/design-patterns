package adapter_pattern;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class BusinessDaysCalculatorAdapter implements BusinessDays {
    private final ExternalBusinessDayCalculator service;

    public BusinessDaysCalculatorAdapter(ExternalBusinessDayCalculator service) {
        this.service = service;
    }

    @Override
    public Boolean isBusinessDay(Date date) {
        LocalDate localDate = Instant.ofEpochMilli(date.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        return service.checkBusinessDay(localDate);
    }
}
