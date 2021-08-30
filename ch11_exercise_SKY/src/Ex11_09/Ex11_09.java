package Ex11_09;

import java.util.*;

class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int total;
	int schoolRank;
	int classRank;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor+eng+math;
	}
	int getTotal() {
		return total;
	}
	
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student tmp = (Student)o;
			return tmp.total - this.total;
			} 
		else {
			return -1;
		}
	}
	
	public String toString() {
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal()
				+","+getAverage()
				+","+schoolRank
				+","+classRank
				;
	}
} // class Student

class ClassTotalComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.ban-s2.ban;
	}
}

public class Ex11_09 {
	
	public static void calculateClassRank(List list) {
		Collections.sort(list,new ClassTotalComparator()); // 먼저 list를 총점기준 내림차순으로 정렬한다.
		
		int prevBan = -1;
		int prevRank = -1; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();
		
		int crank=1;
		Iterator it = list.iterator();

		while(it.hasNext()) {
			Student s = (Student)it.next();
			if(s.ban != prevBan) {
				prevRank = -1;
				prevTotal =-1;
				 crank=1; 
			}

			if(s.getTotal() == prevTotal) {
				
				crank++;
	
				s.classRank = prevRank;
			}
			else {
				s.classRank = crank;
				crank++;
				
				prevBan = s.ban;
				prevTotal = s.getTotal();
				prevRank = s.schoolRank;
			}
		}
	}
	
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬한다.
		
		int prevRank = -1; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();
		
		int rank=1;
		Iterator it = list.iterator();

		while(it.hasNext()) {
			Student s = (Student)it.next();
			if(s.getTotal() == prevTotal) {
				rank++;
				s.schoolRank =prevRank;
			}
			else {
				s.schoolRank = rank;
				rank++;
				
				prevTotal = s.getTotal();
				prevRank = s.schoolRank;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("이자바",2,1,70,90,70));
		list.add(new Student("안자바",2,2,60,100,80));
		list.add(new Student("홍길동",1,3,100,100,100));
		list.add(new Student("남궁성",1,1,90,70,80));
		list.add(new Student("김자바",1,2,80,80,90));
		
		calculateSchoolRank(list);
		calculateClassRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		System.out.println(it.next());
	}
}

//check