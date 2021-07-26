package ch5_exercise_SKY;

public class Ex5_06 {

	public static void main(String[] args) {
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		
		System.out.println("money="+money);
		
		for(int i=0;i<coinUnit.length;i++) {
			int change = money/coinUnit[i]; // 거스름돈 개수
			money = money%coinUnit[i]; // 나머지
			System.out.println(coinUnit[i]+"원: "+change);
			
		}
	}
}
