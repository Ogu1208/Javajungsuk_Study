abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0,0));
	}
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}
class Point {
	int x;
	int y;
	Point() {
		this(0,0);
	}
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}
}

class Circle1 extends Shape{
	public double r;
	Circle1(double r){
		this(new Point(0,0), r);
	}
	Circle1(Point p, double r){
		super(p);
		this.r=r;
	}
	double calcArea() {
		return Math.PI*r*r;
	}
}

class Rectangle1 extends Shape{
	public double width;
	public double height;
	
	Rectangle1(double width, double height){
		this(new Point(0,0),width,height);
	}
	Rectangle1(Point p, double width, double height){
		super(p);
		this.width=width;
		this.height=height;
	}
	boolean isSquare() {
		if(width==height && width!=0 && height!=0)
			return true;
		else return false;
	}
	double calcArea() {
		return width*height;
	}
}

public class ch07_22 {

	static double sumArea(Shape[] arr) {
		double sum = 0;
		for(int i=0; i < arr.length;i++)
			sum+= arr[i].calcArea();
			return sum;
		}
	
		public static void main(String[] args)
		{
			Shape[] arr = {new Circle1(5.0), new Rectangle1(3,4), new Circle1(1)};
			System.out.println("면적의 합:"+sumArea(arr)); 
		}
}
