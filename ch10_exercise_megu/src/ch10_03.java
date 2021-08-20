import java.text.*;
public class ch10_03 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###.#");
		DecimalFormat df2 = new DecimalFormat("#,####,###0");
		
		String str = "123,456,789.5";
		
		Number num;
		try {
			num = df.parse(str);
			double doubleNum = num.doubleValue();
			System.out.println("data:"+str);
			System.out.println("반올림:"+Math.round(doubleNum));
			System.out.println("만단위:"+df2.format(doubleNum));
		} catch (ParseException e) {
			
		}
		
	}

}
