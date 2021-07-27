import java.util.Scanner;

public class ch05_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][]words= {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		Scanner scanner = new Scanner(System.in);
		int count=0;
		for(int i=0;i<words.length;i++) {
			System.out.printf("Q%d. %s의 뜻은?",i+1,words[i][0]);
			
			String tmp=scanner.nextLine();
			
			
			if(tmp.equals(words[i][1])) {
				count++;
				System.out.printf("정답입니다.%n%n");
			}else System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
		}
		System.out.printf("전체 "+words.length+"문제 중 %d문제 맞추셨습니다.%n", count);
}
}
