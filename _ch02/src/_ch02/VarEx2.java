package _ch02;

public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x = 10, y = 20;
	int tmp = 0;
	
	System.out.println("x:" + x + " y:" + y);
	
	tmp = x;
	x = y;
	y = tmp;
	
	System.out.println("x:" + x + " y:" + y);
	
	final int MAX_SPEED = 10;
	System.out.println(MAX_SPEED);
	
	}

}
