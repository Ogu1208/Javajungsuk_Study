import java.util.*;

public class ch04_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1;i<=6;i++)
			for(int j=1;j<=6;j++) {
				sum = i + j;
				if(sum==6)
					System.out.printf("[%d], [%d]%n", i, j);
			}
	}
}
