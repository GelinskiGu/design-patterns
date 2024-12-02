package adapter_pattern;

import java.util.Calendar;
import java.util.Date;

public class Client {
    private final BusinessDays businessDays;

    public Client(BusinessDays clientInterface) {
        this.businessDays = clientInterface;
    }

    public void execute() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.NOVEMBER, 17);
        Date date = calendar.getTime();

        boolean isBusinessDay = businessDays.isBusinessDay(date);
        System.out.println("A data " + date + " é dia útil? " + isBusinessDay);
    }

    public static void main(String[] args) {
        ExternalBusinessDayCalculator service = new ExternalBusinessDayCalculator();

        BusinessDays adapter = new BusinessDaysCalculatorAdapter(service);

        Client client = new Client(adapter);

        client.execute();
    }
}
