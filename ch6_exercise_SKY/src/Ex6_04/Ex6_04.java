package Ex6_04;

public class Ex6_04 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "È«±æµ¿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("ÀÌ¸§:"+s.name);
		System.out.println("ÃÑÁ¡:"+s.getTotal());
		System.out.println("Æò±Õ:"+s.getAverage());
	}
}

	class Student {
	String name;
	int ban,no,kor,eng,math;
	
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		return Math.round(10*getTotal()/(float)3)/(float)10;
	}
}
	