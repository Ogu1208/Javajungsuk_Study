package ch7_exercise_Ogu;

class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];
	SutdaDeck2() {
		for (int i = 0; i < CARD_NUM; i++) {
			if(i==0 || i == 2 || i == 7) {
				cards[i] = new SutdaCard2(i+1, true);
			}
			else {
				cards[i] = new SutdaCard2(i%10+1, false);
			}
		}
	}
	void shuffle() {
		int n = 0;
		SutdaCard2 tmp;
		for(int i = 0; i < CARD_NUM; i++) {
			n = (int)(Math.random()*CARD_NUM)+1;
			tmp = cards[n];
			cards[n] = cards[i];
			cards[i] = tmp;
		}
	}
	
	public SutdaCard2 pick(int index) {
		if(index < 0 || index > CARD_NUM)
			return null;
		return cards[index];
	}
	
	public SutdaCard2 pick() {
		int n = (int)(Math.random()*CARD_NUM)+1;
		return cards[n];
	}
	
} // SutdaDeck
class SutdaCard2 {
	int num;
	boolean isKwang;
	
	SutdaCard2() {
		this(1, true);
	}
	SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}


public class Ex7_2 {

	public static void main(String[] args) {
		SutdaDeck2 deck = new SutdaDeck2();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));


	}
}

