package ch4_exercise_Ogu;

public class Exercise4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		for(x=0;x<=10;x++) {
			for(y=0;y<=10;y++) {
				if(2*x + 4*y == 10)
					System.out.printf("x=%d, y=%d%n", x, y);
			}
			//System.out.println();
		}
	}

}
