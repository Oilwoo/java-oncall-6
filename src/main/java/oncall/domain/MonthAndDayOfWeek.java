package oncall.domain;

import java.time.DayOfWeek;
import java.time.Month;

public class MonthAndDayOfWeek {
    private final Month month;
    private final DayOfWeek dayOfWeek;

    public MonthAndDayOfWeek(Month month, DayOfWeek dayOfWeek) {
        this.month = month;
        this.dayOfWeek = dayOfWeek;
    }


}
