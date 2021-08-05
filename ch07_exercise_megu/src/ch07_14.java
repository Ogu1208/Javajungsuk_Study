class SutdaCard1 {
	final int NUM;
	final boolean ISKWANG;
	SutdaCard1() {
		this(1, true);
	}
	SutdaCard1(int num, boolean isKwang) {
		this.NUM = num;
		this.ISKWANG = isKwang;
	}
	public String toString() {
		return NUM + ( ISKWANG ? "K":"");
	}
}

public class ch07_14 {

	public static void main(String[] args) {
		SutdaCard1 card = new SutdaCard1(1, true);
	}

}
