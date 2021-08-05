package ch7_exercise_Ogu;



public class Ex7_23 {
	
	public static double sumArea(Shape[] arr) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum+=arr[i].calcArea();
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println(" :"+sumArea(arr));
	}

}
