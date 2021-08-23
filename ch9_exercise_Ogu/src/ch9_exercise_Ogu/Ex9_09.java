package ch9_exercise_Ogu;

public class Ex9_09 {

	public static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src.length());
		
		for(int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			
			if(delCh.indexOf(ch)==-1)
				sb.append(ch);   // 자신의 주소 반환
		}
			
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("(1!2@3^4~5)"+" -> "
				+ delChar("(1!2@3^4~5)","~!@#$%^&*()"));
				System.out.println("(1 2 3 4\t5)"+" -> "
				+ delChar("(1 2 3 4\t5)"," \t"));
	}

}
