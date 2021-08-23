package ch9_exercise_Ogu;

public class Ex9_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = 0;
		
		try {
			if(args.length!=2)
				throw new Exception("시작과 끝 단, 두 개의 정수를 입력해 주세요.");
			
			start = Integer.parseInt(args[0]);
			end = Integer.parseInt(args[1]);
			
			if(!(start>=2 && start <= 9 && end>=2 && end <= 9))
				throw new Exception("단의 범위는 2와 9 사이의 값이어야 합니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
		}
		
		for(int i = start; i <= end; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
	}

}
