
public class ch09_07 {
	public static boolean contains(String src, String target) {
		int idx;
		idx = src.indexOf(target);
		
		if(idx == -1)
			return false;
		else return true;
	}

	public static void main(String[] args) {
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
	}

}
