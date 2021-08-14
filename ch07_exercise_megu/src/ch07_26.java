class Outer1 {
	static class Inner1 {
		int iv=200;
	}
}
public class ch07_26 {

	public static void main(String[] args) {
		
		Outer1.Inner1 in = new Outer1.Inner1();
		System.out.println(in.iv);
		
	}

}
