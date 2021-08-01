package Ex6_07;

	class MyPoint {
		int x;
		int y;
		MyPoint(int x, int y) {
			this.x = x;
			this.y = y;
		}
		double getDistance(int x,int y) {
		return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
		}
	}
	
public class Ex6_07 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1,1);
		// p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2,2));
	}
}
