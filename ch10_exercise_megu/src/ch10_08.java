import java.time.*;
public class ch10_08 {

	public static void main(String[] args) {
		ZoneId zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime Seoul = ZonedDateTime.now();
		ZoneId nyid = ZoneId.of("America/New_York");
		ZonedDateTime NewYork = ZonedDateTime.now().withZoneSameInstant(nyid);
		
		System.out.println(Seoul);
		System.out.println(NewYork);
		
		long sec1 = Seoul.getOffset().getTotalSeconds();
		long sec2 = NewYork.getOffset().getTotalSeconds();
		
		System.out.println("sec1="+sec1);
		System.out.println("sec2="+sec2);
		
		long diff = (sec1-sec2)/(60*60);
		System.out.println("diff="+diff+"hrs");
	}

}
