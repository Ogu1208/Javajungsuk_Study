import java.time.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

public class ch10_07 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, 12, 1);
		LocalDate tue = date.with(dayOfWeekInMonth(4,TUESDAY));
		System.out.println(tue);
	}

}
