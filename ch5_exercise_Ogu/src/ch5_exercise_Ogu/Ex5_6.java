package ch5_exercise_Ogu;

public class Ex5_6 {

	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			int x = money / coinUnit[i];
			money %= coinUnit[i];  // 나머지 연산자
			System.out.printf("%d원 : %d%n", coinUnit[i], x);
		}

	}

}
