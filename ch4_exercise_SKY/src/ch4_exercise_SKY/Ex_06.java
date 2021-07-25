package ch4_exercise_SKY;

public class Ex_06 {

	public static void main(String[] args) {
		int x,y;
		for(x=1;x<=6;x++) {
			for(y=1;y<=6;y++) {
				if(x+y==6) {
				System.out.printf("[%d , %d] ",x,y);
				}
				else {
					System.out.printf("%7c ",' '); // 격자식으로 출력하기 위해서
				}
			}
			System.out.println();
		}
	}
}
