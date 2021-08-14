
class UnsupportedFuctionException extends RuntimeException {
	private final int ERR_CODE;
		
	UnsupportedFuctionException(String m, int e){ super(m); ERR_CODE = e; }
	UnsupportedFuctionException(String m){ this(m, 100); }
	
	public int getErrorCode() { return ERR_CODE; }
	public String getMessage() { return getErrorCode() + super.getMessage(); }
}

public class ch08_09 {
	
	public static void main(String[] args) throws Exception{
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);
	}

}
