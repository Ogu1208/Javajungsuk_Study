package ch9_exercise_SKY;

public class Ex9_04 {
	static void printGraph(int[] dataArr, char ch) {
		for(int i=0;i<dataArr.length;i++) {
			for(int j=0;j<dataArr[i];j++)
				System.out.print(ch);
			System.out.print(dataArr[i]);
			System.out.println();
			}
		}
		
	public static void main(String[] args) {
		printGraph(new int[]{3,7,1,4},'*');
		}
}
