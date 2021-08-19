package ch10_exercise_SKY;

import java.util.*;
import java.text.*;

public class Ex10_04 {
	public static void main(String[] args) {
		DateFormat idf = new SimpleDateFormat("yyyy/MM/dd");
		DateFormat odf = new SimpleDateFormat("입력하신 날짜는 E요일입니다");
		while(true) {
			try {
				System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요. (입력예: 2007/05/11)");
				System.out.print(">>");
				Scanner s = new Scanner(System.in);
				String str =s.nextLine();
				Date d = idf.parse(str);
				System.out.println(odf.format(d));
				break;
			} catch(Exception e) {}
		}
	}
}
