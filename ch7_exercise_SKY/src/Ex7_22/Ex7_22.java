package Ex7_22;

public class Ex7_22 {
	public static void main(String args[]) {}
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

	

	class Circle extends Shape {
		double r;
		final double PI = 3.14;
		
		
		Circle(){
			super(new Point(0,0));
			this.r=1;
		}
		Circle(double r){
			super(new Point(0,0));
			this.r=r;
		}
		Circle(Point p, Double r){
			super.p=p;
			this.r=r;
		}
		
		double calcArea() {
			return r*r*PI;
		}
	}

	
	class Rectangle extends Shape {
		double width;
		double height;
		
		Rectangle(){
			super(new Point(0,0));
			this.width=1;
			this.height=1;
		}
		Rectangle(double width,double height){
			super(new Point(0,0));
			this.width=width;
			this.height=height;
		}
		Rectangle(Point p, double width,double height){
			super.p=p;
			this.width=width;
			this.height=height;
		}
		
		double calcArea() {
			return width*height;
		}
		
		boolean isSquare() {
			return (width==height) ? true : false;
		}
	}
// check