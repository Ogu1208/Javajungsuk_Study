
public class ch07_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product cart index 배열 에 사용될
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 "+p+"를 살 수 없습니다.");
			return;
		}
			
		money-=p.price;
		add(p);
	}
	void add(Product p) {
		if(i>=cart.length) {
			Product[] newcart=new Product[cart.length*2];
			for(int j=0;j<cart.length;j++) {
				newcart[j]=cart[j];
			}
			newcart=cart;
		}
		cart[i++]=p;
	} 
	void summary() {
		String list="";
		int sum=0;
		
		for(int i=0;i<cart.length;i++) {
			if(cart[i]==null)
				break;
			list+=cart[i]+", ";
			sum+=cart[i].price;
		}
		System.out.println("구입한 물건:"+list);
		System.out.println("사용한 금액:"+sum);
		System.out.println("남은 금액:"+money);
	}
}
class Product {
	int price; // 제품의 가격
	
	Product(int price) {
		this.price = price;
	}
}
class Tv extends Product {
	Tv() { super(100); }
	
	public String toString() { return "Tv"; }
}
class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() { return "Computer";}
}
class Audio extends Product {
	Audio() { super(50); }

	public String toString() { return "Audio"; }
}


