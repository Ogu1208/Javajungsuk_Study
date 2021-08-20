import java.util.*;
import java.text.*;

public class ch10_05 {
	public static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		if(yyyymmdd1.length()!=8 || yyyymmdd2.length()!=8)
			return 0;
		int diff=0;
		
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		
		try {
			Date d1 = df.parse(yyyymmdd1);
			Date d2 = df.parse(yyyymmdd2);
			Calendar c1 = Calendar.getInstance();
			Calendar c2 = Calendar.getInstance();
			c1.setTime(d1);
			c2.setTime(d2);
			
			diff = (int)(c1.getTimeInMillis()-c2.getTimeInMillis())/(60*60*24*1000);
		} catch(Exception e) {
			return 0;
		}
		
		/*
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1 = df.parse(yyyymmdd1);
		int Day1 = yyyymmdd1.get(Calendar.DAY_OF_MONTH);
		int Month1 = yyyymmdd1.get(Calendar.MONTH);
		int Year1 = yyyymmdd1.get(Calendar.YEAR);
		int Day2 = yyyymmdd2.get(Calendar.DAY_OF_MONTH);
		int Month2 = yyyymmdd2.get(Calendar.MONTH);
		int Year2 = yyyymmdd2.get(Calendar.YEAR);
		*/
		return diff;
	}

	public static void main(String[] args) {
		System.out.println(getDayDiff("20010103","20010101"));
		System.out.println(getDayDiff("20010103","20010103"));
		System.out.println(getDayDiff("20010103","200103"));
	}

}
