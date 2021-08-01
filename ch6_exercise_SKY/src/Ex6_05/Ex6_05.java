package Ex6_05;

public class Ex6_05 {

	public static void main(String[] args) {
		Student s = new Student("ȫ�浿",1,1,100,60,76);
		System.out.println(s.info());

	}
}

	class Student {
		String name;
		int ban,no,kor,eng,math;
		
		Student(String name,int ban,int no, int kor, int eng, int math){
			this.name = name;
			this.ban = ban;
			this.no = no;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		int getTotal() {
			return kor+eng+math;
		}
		float getAverage() {
			return Math.round(10*getTotal()/(float)3)/(float)10;
		}
		
		String info() {
			return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
		}
}
	
	