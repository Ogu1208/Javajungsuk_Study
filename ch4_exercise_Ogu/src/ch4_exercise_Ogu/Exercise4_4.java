package ch4_exercise_Ogu;

public class Exercise4_4 {

	public static void main(String[] args) {
		int sum = 0, i = 0;
		while(true) {
			if(sum>=100) break;
			i++;
			if(i%2!=0)
				sum+=i;
			else
				sum-=i;
		}
		
		System.out.println("i = " + i);
	}

}
