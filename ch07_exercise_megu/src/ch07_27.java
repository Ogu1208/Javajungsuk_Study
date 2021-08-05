class Outer2 {
	int value=10;
	
	class Inner2 {
		int value=20;
		
		void method1() {
			int value=30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer2.this.value);
		}
	} // Inner클래스의 끝
} // Outer클래스의 끝

public class ch07_27 {

	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		Outer2.Inner2 inner = outer.new Inner2();
		
		inner.method1();
	}

}
