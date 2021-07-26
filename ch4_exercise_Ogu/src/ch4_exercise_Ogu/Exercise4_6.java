package ch4_exercise_Ogu;

public class Exercise4_6 {

	public static void main(String[] args) {
		int i, j, sum = 0;
		for(i=1;i<=6;i++)
			for(j=1;j<=6;j++) {
				sum = i + j;
				if(sum==6)
					System.out.printf("i = %d, j = %d%n", i, j);
			}
	}

}
