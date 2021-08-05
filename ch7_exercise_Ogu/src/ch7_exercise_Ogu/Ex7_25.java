package ch7_exercise_Ogu;

class Outer {
	class Inner {
		int iv=100;
	}
}


public class Ex7_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		
		System.out.println(inner.iv);
	}

}
