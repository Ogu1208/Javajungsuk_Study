
public class CharToCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		int code = (int)ch;
		
		System.out.printf("%c=%d(%#X)%n", ch, code, code);
		
		char hch = '°¡';
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
	}

}
