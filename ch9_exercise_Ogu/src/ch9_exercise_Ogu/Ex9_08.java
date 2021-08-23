package ch9_exercise_Ogu;

import javax.annotation.processing.RoundEnvironment;

public class Ex9_08 {

	public static double round(double d, int n) {
		return Math.round(d * Math.pow(10,  n)) / Math.pow(10, n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
	}

}
