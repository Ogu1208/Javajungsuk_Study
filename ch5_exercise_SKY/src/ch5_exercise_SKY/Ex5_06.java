package ch5_exercise_SKY;

public class Ex5_06 {

	public static void main(String[] args) {
		// ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		
		System.out.println("money="+money);
		
		for(int i=0;i<coinUnit.length;i++) {
			int change = money/coinUnit[i]; // �Ž����� ����
			money = money%coinUnit[i]; // ������
			System.out.println(coinUnit[i]+"��: "+change);
			
		}
	}
}