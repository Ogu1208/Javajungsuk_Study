package ch10_exercise_SKY;

import java.time.*;
import java.time.temporal.ChronoField;

public class Ex10_08 {
	public static void main(String[] args) {
		ZonedDateTime zdtkr = ZonedDateTime.now();
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime zdtny = ZonedDateTime.now().withZoneSameInstant(nyId);
		
		System.out.println(zdtkr);
		System.out.println(zdtny);
		
		long sec1 = zdtkr.get(ChronoField.OFFSET_SECONDS);
		long sec2 = zdtny.get(ChronoField.OFFSET_SECONDS);
		long diff = (sec1 - sec2)/3600;
		
		System.out.println("sec1="+sec1);
		System.out.println("sec2="+sec2);
		System.out.println("diff= "+diff+ " hrs");
	}
}
// getTotalSeconds()