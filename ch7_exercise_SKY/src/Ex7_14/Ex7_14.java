package Ex7_14;

	class SutdaCard {
		final int NUM;
		final boolean IS_KWANG;
		SutdaCard() {
			this(1, true);
		}
		SutdaCard(int num, boolean isKwang) {
			this.NUM = num;
			this.IS_KWANG = isKwang;
		}
		public String toString() {
			return NUM + ( IS_KWANG ? "K":"");
		}
	}

public class Ex7_14 {
	public static void main(String args[]) {
		SutdaCard card = new SutdaCard(1, true);
		}
}
