public class ch09_04 {
	static void printGraph(int[] dataArr, char ch) {
		for(int i = 0; i<dataArr.length; i++) {
			//System.out.println();
			for(int j=0; j<dataArr[i]; j++) {
				System.out.print("*");
			}
			System.out.println(dataArr[i]);
		}
	}
	
	public static void main(String[] args) {
		printGraph(new int[]{3,7,1,4},'*');
	}

}
