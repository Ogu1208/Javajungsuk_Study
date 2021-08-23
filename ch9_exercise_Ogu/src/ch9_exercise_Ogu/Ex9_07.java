package ch9_exercise_Ogu;

public class Ex9_07 {

	public static boolean contains(String src, String target) {
		return src.indexOf(target)!=-1;
	//  return src.contains(target);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
	}

}
