package ch6_exercise_Ogu;

public class Ex6_24 {

	static int abs (int value) {
		if(value>0)
			return value;
		else {
			return -value;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 5;
		System.out.println(value+"의 절대값 :"+abs(value)); 
		value = -10;
		System.out.println(value+"의 절대값 :"+abs(value)); 
	}

}
