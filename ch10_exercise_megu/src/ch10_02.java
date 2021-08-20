import java.util.*;
import java.text.*;

public class ch10_02 {
	static int paycheckCount(Calendar from, Calendar to) {
		if(from == null || to == null)
			return 0;
		if(from.equals(to) && from.get(Calendar.DAY_OF_MONTH)==21)
			return 1;
		
		int fromDay = from.get(Calendar.DAY_OF_MONTH);
		int fromMonth = from.get(Calendar.MONTH);
		int fromYear = from.get(Calendar.YEAR);
		int toDay = to.get(Calendar.DAY_OF_MONTH);
		int toMonth = to.get(Calendar.MONTH);
		int toYear = to.get(Calendar.YEAR);
		int monDiff = (toYear*12+toMonth)-(fromYear*12+fromMonth);
		/*
		if (fromYear == toYear)
			monDiff = toMonth - fromMonth;
		else if (fromYear > toYear) {
			monDiff = (fromYear-toYear)*12 + (fromMonth - toMonth);
			if(monDiff<0)
				return 0;
		}			
		else if (fromYear < toYear) {
			monDiff = (toYear-fromYear)*12 + (toMonth - fromMonth);
			if(monDiff<0)
				return 0;
		}
		*/
		if(monDiff<0)
			return 0;
		
		if((fromDay==21 || fromDay<21) && (toDay==21 || toDay>21))
			monDiff++;
		else if(fromDay>21 && toDay<21)
			monDiff--;
		
		return monDiff;
	}

	static void printResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print(sdf.format(fromDate)+" ~ "
				+sdf.format(toDate)+":");
		System.out.println(paycheckCount(from, to));
	}

	public static void main(String[] args) {
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();
		
		fromCal.set(2010,0,1);
		toCal.set(2010,0,1);
		printResult(fromCal, toCal);
		
		fromCal.set(2010,0,21);
		toCal.set(2010,0,21);
		printResult(fromCal, toCal);
		
		fromCal.set(2010,0,1);
		toCal.set(2010,2,1);
		printResult(fromCal, toCal);
		
		fromCal.set(2010,0,1);
		toCal.set(2010,2,23);
		printResult(fromCal, toCal);
		
		fromCal.set(2010,0,23);
		toCal.set(2010,2,21);
		printResult(fromCal, toCal);
		
		fromCal.set(2011,0,22);
		toCal.set(2010,2,21);
		printResult(fromCal, toCal);
	}

}
