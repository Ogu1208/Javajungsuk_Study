package ch10_exercise_SKY;

import java.text.*;

public class Ex10_03 {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#,###.##");	
		DecimalFormat df2 = new DecimalFormat("#,####.##");	
		String str = new String("123,456,789.5");
		System.out.println("data : " + str);
		
		try {
			Number num =df.parse(str);
			double d = num.doubleValue();
			System.out.println("반올림 : " + Math.round(d));
			
			Number num2 =df2.parse(str);
			double d2 = num2.doubleValue();
			System.out.println("만단위 : " + df2.format(Math.round(d2)));
			
		} catch(Exception e) {}
	}
}
//check