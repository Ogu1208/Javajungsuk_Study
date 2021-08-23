package ch9_exercise_Ogu;

import javax.naming.spi.DirStateFactory.Result;

public class Ex9_10 {

	public static String format(String str, int length, int alignment) {
		if(length < str.length())
			return str.substring(0, length);
		
		char[] origin = str.toCharArray();
		char[] cArr = new char [length];
		for(int i = 0; i < length; i++) 
			cArr[i] = ' ';
		
		switch (alignment) {
		case 0:
			System.arraycopy(origin, 0, cArr, 0, cArr.length);
			break;
		case 1:
			System.arraycopy(origin, 0, cArr, (length-str.length())/2, length);
			break;
		case 2:
			System.arraycopy(origin, 0, cArr, length-str.length(), length);
			break;
		default:
			System.arraycopy(origin, 0, cArr, 0, length);
			break;
		}
		
		return new String(cArr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "가나다"; 
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬
	}

}
