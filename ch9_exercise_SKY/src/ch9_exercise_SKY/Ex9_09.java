package ch9_exercise_SKY;

public class Ex9_09 {

	static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer("");
		
		for(int i=0;i<src.length();i++) {
				if(delCh.indexOf(src.charAt(i))==-1)
					sb.append(src.charAt(i));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+" -> "
				+ delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)"+" -> "
				+ delChar("(1 2   3  4\t5)"," \t"));
	}
}

// ¾î·Á¿üÀ½...