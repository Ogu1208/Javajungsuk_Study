package ch9_exercise_Ogu;

public class Ex9_04 {

	static void printGraph(int[] dataArr, char ch) {
		for(int i = 0; i < dataArr.length; i++) {
			for(int j = 0; j < dataArr[i]; j++)
				System.out.print(ch);
			System.out.println(dataArr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGraph(new int[]{3,7,1,4},'*');

	}

}
