package ch8_exercise_SKY;

public class Ex8_09 {

	class UnsupportedFuctionException extends RuntimeException{
	//	final private int ERR_CODE;
		
		public int getErrorCode() {
			return ERR_CODE;
		}
		
		public String getMessage() {
			return getMessage();
		}
	}
	
	
	public static void main(String[] args) {
	//	throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);
	}
}

// 생성자 만들기 포기