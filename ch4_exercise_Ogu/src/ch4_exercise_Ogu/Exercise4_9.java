package ch4_exercise_Ogu;

public class Exercise4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
			int c = str.charAt(i)-48;
			System.out.println("c="+c);
			sum+=c;
		}
		System.out.println("sum="+sum);
	}

}
