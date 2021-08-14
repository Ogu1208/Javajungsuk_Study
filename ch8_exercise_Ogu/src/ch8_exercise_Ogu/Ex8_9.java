package ch8_exercise_Ogu;
// 사용자 정의 예외 클래스

class UnsupportedFuctionException extends RuntimeException{
	// 에러 코드 값을 저장하기 위한 필드를 추가
	private final int ERR_CODE;
	UnsupportedFuctionException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	
	UnsupportedFuctionException(String msg) { // 생성자
		this(msg, 100);
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return "[" + getErrCode() + "]" + super.getMessage();
	}
}

public class Ex8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100); 
	}

}
