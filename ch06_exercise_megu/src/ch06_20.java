
public class ch06_20 {

	static int[] shuffle(int[] arr) {
		int tmp;
		for(int i=0; i<arr.length*2;i++) {
			int x = (int)(Math.random()*arr.length);
			int y = (int)(Math.random()*arr.length);
			
			tmp=arr[x];
			arr[x]=arr[y];
			arr[y]=tmp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
