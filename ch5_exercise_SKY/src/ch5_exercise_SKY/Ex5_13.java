package ch5_exercise_SKY;

import java.util.Scanner;
public class Ex5_13 {

	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone" };
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			char[] question = words[i].toCharArray(); // String�� char[]�� ��ȯ
		
			for(int j=0; j<question.length; j++) {
				int tmp = (int)(Math.random()*question.length);
				char ch = question[j];
				question[j] = question[tmp];
				question[tmp] = ch;
			}
		System.out.printf("Q%d. %s�� ������ �Է��ϼ���.>",i+1, new String(question));
		
		String answer = scanner.nextLine();
		// trim()���� answer�� �¿� ������ ������ ��, equals�� word[i]�� ��
		if(words[i].equals(answer.trim()))
			System.out.printf("�¾ҽ��ϴ�.%n%n");
		else
			System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
		}
	}
}