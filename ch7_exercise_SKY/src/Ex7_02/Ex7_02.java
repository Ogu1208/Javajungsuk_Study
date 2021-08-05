package Ex7_02;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		for(int i=0;i<CARD_NUM; i++) {
			if((i==0 || i==2 || i==7) && i<CARD_NUM/2)  //  광이면서 배열의 인덱스가 10을 넘지 않는 경우
				cards[i] = new SutdaCard(i+1,true);
			
			else if(i<CARD_NUM/2) // 광이 아니면서 배열의 인덱스가 10을 넘지 않는 경우
				cards[i] = new SutdaCard(i+1,false);
			
			else  // 광이 아니면서 배열의 인덱스가 10을 넘는 경우
				cards[i] = new SutdaCard(i-9,false);

		}				
	} //7-1
	 void shuffle() {
		for(int i=0;i<CARD_NUM;i++) {
		int num = (int)(Math.random()*CARD_NUM);
		
		SutdaCard tmp = cards[i];
		cards[i]=cards[num];
		cards[num]=tmp;
		}
	}
	 
	 SutdaCard pick(int index) {
		 return cards[index];
	 }
	 
	 SutdaCard pick() {
		 int num = (int)(Math.random()*CARD_NUM);
		 return cards[num];
	 }
	
}

class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() { this(1, true); }
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}

public class Ex7_02 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}

// check