package ch9_exercise_SKY;

public class Ex9_06 {
	public static String fillZero(String src, int length) {
		
		if(src.length()==length||src == null)
			return src;
		else if(length <=0)
			return "";
		else if(src.length() >length)
			return src.substring(0, length);
		else {
			char[] fstr = new char[length];
			for(int i=0;i<fstr.length;i++)
				fstr[i]='0';
			
			char[] csrc = new char[src.length()];
			for(int i=0;i<src.length();i++)
				csrc[i]=src.charAt(i);
			
			System.arraycopy(csrc ,0 ,fstr ,length-src.length() ,src.length());
			String str = new String(fstr);
			return str;
					
		}
	}

	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}	
}

//check