import java.util.*;
import java.text.*;
public class ch10_04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		
		String result = "입력하신 날짜는 E요일입니다.";		
		DateFormat df2 = new SimpleDateFormat(result);
		
		Date d;
		do {
			System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11)");
			
			try {
				System.out.print(">> ");
				d = df.parse(s.nextLine());
				break;
			} catch(Exception e) {
				
			}
			
		} while(true);
		System.out.println(df2.format(d));
	}

}
