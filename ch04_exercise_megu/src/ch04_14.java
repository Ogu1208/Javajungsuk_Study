
public class ch04_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
		int answer =(int)(Math.random()*100)+1;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
		count++;
		System.out.print("1과 100 사이의 값을 입력하세요 :"); 
		input = s.nextInt(); // input . 입력받은 값을 변수 에 저장한다
		if(input==answer) {
			System.out.println("맞췄습니다.");
			System.out.println("시도횟수는 "+count+"번입니다.");
			break;
		}
		else if(input>=answer)
			System.out.println("더 작은 수를 입력하세요.");
		else if(input<=answer)
			System.out.println("더 큰 수를 입력하세요.");
		} while(true); // 무한반복문
	}

}
