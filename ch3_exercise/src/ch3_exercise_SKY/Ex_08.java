package ch3_exercise_SKY;

public class Ex_08 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b); // byte 표시
		char ch = 'A';
		ch = (char)(ch + 2); // char 표시
		float f = (float)3 / 2; // float 표시
		long l = 3000l * 3000 * 3000; // l 표시
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d==f2; // float 표시
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}

}
