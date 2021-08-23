package ch9_exercise_Ogu;

public class Ex9_06 {

	public static String fillZero(String src, int length) {
		if(src==null || src.length()==length)
			return src;
		else if(length<=0)
			return "";
		else if(src.length()>=length)
			return src.substring(0, length);
		
		char[] cArr = new char[length];
		for(int i=0; i<length; i++)
			cArr[i] = '0';
		
		System.arraycopy(src.toCharArray(), 0, cArr, length-src.length(), src.length());
		
		return new String(cArr);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}

}
