package oncall.domain;

import java.time.DayOfWeek;
import java.time.Month;

public class Duty {
    private final Worker worker;
    private final Month month;
    private final DayOfWeek dayOfWeek;

    public Duty(Worker worker, Month month, DayOfWeek dayOfWeek) {
        this.worker = worker;
        this.month = month;
        this.dayOfWeek = dayOfWeek;
    }
}
