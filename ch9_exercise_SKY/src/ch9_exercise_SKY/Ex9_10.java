package ch9_exercise_SKY;

public class Ex9_10 {

	static String format(String str, int length, int alignment) {
		if(length < str.length())
			return str.substring(0, length);
		else {
			char[] nstr = new char[length];
			for(int i=0;i<nstr.length;i++)
				nstr[i]= ' ';
			
			switch (alignment){
			case 0: 
				System.arraycopy(str.toCharArray(), 0, nstr, 0, str.length());
				break;
			case 1:
				System.arraycopy(str.toCharArray(), 0, nstr, nstr.length/2-str.length()/2 , str.length());
				break;
			case 2: 
				System.arraycopy(str.toCharArray(), 0, nstr, nstr.length-str.length(), str.length());
				break;
			}
			return new String(nstr);
				
		}
	}
	

	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬
	}
}

//check