
public class ch05_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		
		int money2;
		for(int i=0;i<coinUnit.length;i++) {
			money2 = money/coinUnit[i];
			money =  money%coinUnit[i];
			System.out.printf("%d¿ø : %d%n", coinUnit[i], money2);
		}
	}

}
