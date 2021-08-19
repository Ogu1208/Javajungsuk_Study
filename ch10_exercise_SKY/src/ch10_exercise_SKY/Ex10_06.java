package ch10_exercise_SKY;

import java.text.*;
import java.util.*;

public class Ex10_06 {
		public static void main(String[] args){
			
		
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
			try {
				System.out.print("birth day=");
				Scanner s = new Scanner(System.in);
				String bstr =s.nextLine();
				Date birthday = df.parse(bstr);
				
				System.out.print("today    =");
				String tstr =s.nextLine();
				Date today = df.parse(tstr);
				
				Calendar cal1 = Calendar.getInstance();
				cal1.setTime(today);
				
				Calendar cal2 = Calendar.getInstance();
				cal2.setTime(birthday);
				
				long days =(long)(cal1.getTimeInMillis()-cal2.getTimeInMillis())/(1000*24*60*60);
				System.out.println(days + "days");
			} catch(Exception e) {}
	}
}
//check