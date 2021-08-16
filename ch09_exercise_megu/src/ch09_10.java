
public class ch09_10 {

	public static String format(String str, int length, int alignment) {
		if(length < str.length())
			return str = str.substring(0, length);
		
		char[] arr = new char[length];
		for(int i=0 ;i<length; i++)
			arr[i] = ' ';
				

		char[] arr2 = str.toCharArray();
		if(alignment == 0) 
			System.arraycopy(arr2, 0, arr, 0, arr2.length);
		else if(alignment == 1)
			System.arraycopy(arr2, 0, arr, 0, arr2.length);
		else if(alignment == 2)
			System.arraycopy(arr2, 0, arr, 0, arr2.length);
			
		return String.valueOf(arr);
	}
	
	public static void main(String[] args) {
		String str = "가나다"; 
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬
	}

}
