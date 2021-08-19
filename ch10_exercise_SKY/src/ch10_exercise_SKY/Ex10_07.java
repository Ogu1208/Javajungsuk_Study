package ch10_exercise_SKY;

import java.time.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

public class Ex10_07 {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2016, 12, 1);
		System.out.println(ld.with(dayOfWeekInMonth(4, TUESDAY)));
		}
}
