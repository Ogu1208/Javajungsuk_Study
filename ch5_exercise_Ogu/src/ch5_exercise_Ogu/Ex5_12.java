package ch5_exercise_Ogu;

import java.util.Scanner;

public class Ex5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"	},
				{"integer", "정수"}
		};
		
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		
		for(int i = 0; i<words.length; i++) {
			System.out.printf("Q%d.  %S의 뜻은?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
				n++;
			}
				
			else {
				System.out.printf("틀렸습니다.%n%n");
			}
		}
		
		System.out.printf("전체 3문제중 %d문제 맞추셨습니다.", n);
		
	}

}
