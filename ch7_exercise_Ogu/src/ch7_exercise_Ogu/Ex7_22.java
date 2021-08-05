package ch7_exercise_Ogu;

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

class Circle extends Shape {
	double r;
	Circle(double r){
		this(new Point(0, 0), r);
	}
	Circle(Point p, double r){
		super(p);
		this.r = r;
	}
	double calcArea() {
		return Math.PI*r*r;
	}
}

class Rectangle extends Shape {
	double width;
	double height;
	Rectangle(double w, double h){
		this(new Point(0, 0), w, h);
	}
	Rectangle(Point p, double w, double h){
		super(p);
		this.width = w;
		this.height = h;
	}
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare() {
		return (width == height && width*height!=0);
	}
}



public class Ex7_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
