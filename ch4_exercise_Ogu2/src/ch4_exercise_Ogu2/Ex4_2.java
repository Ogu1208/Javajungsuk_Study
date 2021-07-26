package ch4_exercise_Ogu2;

public class Ex4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum = 0;
		for(i=1;i<=20;i++) {
			if(i%2!=0 || i%3!=0)
				sum+=i;
		}
		System.out.println(sum);
	}

}
