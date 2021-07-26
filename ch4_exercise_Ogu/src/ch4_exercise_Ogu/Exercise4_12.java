package ch4_exercise_Ogu;

public class Exercise4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i < 10; i+=3) {
			for (int j = 1; j <= 3; j++) {
				for(int k = 0; k<=k+2&&j<10;j++)
				{
					System.out.println(j+"*"+i+"="+j*i+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
