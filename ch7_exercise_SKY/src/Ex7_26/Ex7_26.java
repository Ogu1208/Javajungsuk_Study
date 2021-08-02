package Ex7_26;

class Outer {
	static class Inner {
		int iv=200;
	}
}
public class Ex7_26 {
	public static void main(String[] args) {
		Outer.Inner i = new Outer.Inner();
		System.out.println(i.iv);
	}
}
//check