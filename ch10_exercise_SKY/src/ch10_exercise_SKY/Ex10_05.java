package ch10_exercise_SKY;

import java.text.*;
import java.util.*;

public class Ex10_05 {
	
	static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		
			try {
				Date d1 = df.parse(yyyymmdd1);
				Date d2 = df.parse(yyyymmdd2);
				
				Calendar cal1 = Calendar.getInstance();
				cal1.setTime(d1);
				
				Calendar cal2 = Calendar.getInstance();
				cal2.setTime(d2);
				
				return (int)(cal1.getTimeInMillis()-cal2.getTimeInMillis())/(1000*24*60*60);
				
			} catch(Exception e) {return 0;}
	}
	/*
	(1) getDayDiff메서드를 작성하시오.
	*/
	public static void main(String[] args){
		System.out.println(getDayDiff("20010103","20010101"));
		System.out.println(getDayDiff("20010103","20010103"));
		System.out.println(getDayDiff("20010103","200103"));
	}
}
