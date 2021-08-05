package ch7_exercise_Ogu;

class SutdaCard3 {
	final int num;  // ∞Ì¡§
	final boolean isKwang;
	SutdaCard3() {
		this(1, true);
	}
	SutdaCard3(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}

public class Ex7_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard3 card = new SutdaCard3(1, true);
	}

}
