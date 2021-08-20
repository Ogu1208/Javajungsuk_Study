import java.util.*;
import java.text.*;
public class ch10_01 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		today.set(2010,0,1);
		
		SimpleDateFormat sdf1;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.");
		
		for(int i=0; i<12; i++) {
			int weekday = today.get(Calendar.DAY_OF_WEEK);
			int sunday;
			if(weekday == 1)
				sunday = 8;
			else sunday = 16 - weekday;
			
			today.set(Calendar.DAY_OF_MONTH, sunday);
			
			Date d = new Date();
			d = today.getTime();
			System.out.println(sdf1.format(d));
			today.add(Calendar.MONTH, 1);
			today.set(Calendar.DAY_OF_MONTH, 1);
		}
		
	}

}
