package ch4_exercise_Ogu;

public class Exercise4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int computerNumber = (int)(Math.random() * 100) + 1;
	        int userNumber = 0;
	        int trial = 0;
	        while(userNumber != computerNumber){
	            System.out.println("1과 100사이의 값을 입력하세요.");
	            userNumber = scanner.nextInt();
	            if(userNumber > computerNumber){
	                System.out.println("더 작은 수를 입력하세요.");
	            }else{
	                System.out.println("더 큰수를 입력하세요.");
	            }
	            trial++;
	        }
	        System.out.println("맞췄습니다.\n시도횟수는 " + trial + "번입니다.");
	}

}
