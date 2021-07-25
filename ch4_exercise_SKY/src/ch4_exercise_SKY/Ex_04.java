package ch4_exercise_SKY;

public class Ex_04 {

	public static void main(String[] args) {
		boolean flag = true;
		int sum=0;
		int i=1; // 양수 진행
		int j= -2; // 음수 진행
		while(flag) {	
			sum+=i;
			i+=2;
			if(sum>=100) {
				flag= false;
			}
			sum+=j;
			j+=-2;	
		}
		System.out.println(i-2); // i가 더해진 채로 나오기 때문에 2를 빼줌
	}
}
