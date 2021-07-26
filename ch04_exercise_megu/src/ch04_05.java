
public class ch04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		while(i<=10) {
			while(j<=i) {
			System.out.print("*");
			j++;
			}
			j=0;
			i++;
			System.out.println();
		}
	}

}
