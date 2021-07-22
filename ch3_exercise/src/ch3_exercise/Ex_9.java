package ch3_exercise;

public class Ex_9 {

	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') );
		System.out.println(b);
	}

}
