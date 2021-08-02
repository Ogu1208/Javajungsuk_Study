package ch6_exercise_Ogu;

public class Ex6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s = new Student1("ȫ�浿 ",1,1,100,60,76); 
		System.out.println(s.info());

	}

}
class Student1 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return Math.round(getTotal()*10f/3f)/10f;
	}
	
	Student1(String name, int b, int n, int k, int e, int m){
		this.name = name;
		this.ban = b;
		this.no = n;
		this.kor = k;
		this.eng = e;
		this.math = m;
	}
	
	public String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+
				","+getAverage();
	}
}

