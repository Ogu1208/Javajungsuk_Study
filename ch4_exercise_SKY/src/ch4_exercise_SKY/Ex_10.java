package ch4_exercise_SKY;

public class Ex_10 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		int x=10;
		while(true) {
			sum+=num%x/(x/10);
			if(x>num) break;
			x*=10;
		}
		System.out.println("sum="+sum);
	}
}
