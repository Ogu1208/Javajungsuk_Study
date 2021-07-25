package ch4_exercise_SKY;

public class Ex_12 {

	public static void main(String[] args) {
		int i,j,k=2;
		boolean flag =true;
		while(flag) {
			for( i=1;i<4;i++) {
				for( j=k;j<k+3;j++) {
					if(j>9) {
						flag=false;
					}
					else {
					System.out.printf("%d*%d=%d \t", j,i,j*i);
					}
				}
				System.out.println();
			}
			k+=3;
			System.out.println();
			System.out.println();
		}
	}
}
