package ch5_exercise_Ogu;

public class Ex5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		for(int i=0; i < answer.length;i++) {
		 counter[(answer[i]-1)]++;
		}
		for(int i=0; i < counter.length;i++) {
		for(int j = 0; j<counter[i]; j++) {
			System.out.printf("*");
			
		}
		System.out.println();
		}

	}

}
