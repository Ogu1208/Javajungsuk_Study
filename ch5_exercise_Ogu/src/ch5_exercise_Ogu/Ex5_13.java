package ch5_exercise_Ogu;
import java.util.*;

public class Ex5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "television", "computer", "mouse", "phone" };
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			char[] question = words[i].toCharArray(); // String char[] �� �� ��ȯ
			for(int j = 0; j<words[i].length(); j++) {
				int n = (int)(Math.random()*question.length);
				char tmp;
				tmp = question[i];
				question[i] = question[n];
				question[n] = tmp;
			}
			System.out.printf("Q%d. %s�� ������ �Է��ϼ��� .>", i+1, new String(question));
			String answer = scanner.nextLine();
			// trim() answer , equals word[i] ���� �� �¿� ������ ������ �� �� �� ��
			if(words[i].equals(answer.trim()))
				System.out.printf("�¾ҽ��ϴ� .%n%n"); 
			else
				System.out.printf("Ʋ�Ƚ��ϴ� .%n%n"); 
		}

	}

}