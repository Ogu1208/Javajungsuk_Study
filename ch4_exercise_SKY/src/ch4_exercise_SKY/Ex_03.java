package ch4_exercise_SKY;

public class Ex_03 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			for(int j=0; j<i;j++) {
				sum+=(j+1);
			}
	
		}
		System.out.println(sum);
	}
}
