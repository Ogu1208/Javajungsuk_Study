package ch9_exercise_SKY;

public class Ex9_11 {

	public static void main(String[] args) {
		
			if(args.length != 2) {
				System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
			}
			else {
			int start = Integer.parseInt(args[0]);
			int end = Integer.parseInt(args[1]);
			
				if(start<2 || start>9 || end <2 || end>9) {
					System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
				}
				else {
					for(int i = start; i<=end; i++) {
						for(int j = 1;j <10; j++) {
							System.out.println(i+"*"+j+"="+i*j);
						}
						System.out.println();
				}
			}	
		}
	}
}
