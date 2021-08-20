import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class ch10_06 {

	public static void main(String[] args) {
		/*
		String pattern = "yyyy-MM-dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);
		
		Date BD = null;
		Date TD = null;
		System.out.print("birthday=");
		try {
			BD = df.parse(s.nextLine());
			Calendar today = Calendar.getInstance();
			TD.setDate(today);
			System.out.println("today\t="+today);
		} catch (Exception e) {}
		*/
		LocalDate BD = LocalDate.of(1999, 11, 5);
		LocalDate TD = LocalDate.now();
		System.out.println("birthday="+BD);
		System.out.println("today\t="+TD);
		
		long diff = BD.until(TD, ChronoUnit.DAYS);
		System.out.println(diff+"days");
		
	}

}
