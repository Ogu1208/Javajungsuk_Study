
public class ch05_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []numArr=new int[10];
		int []counter=new int[10];
		
		for(int i=0;i<numArr.length;i++) {
			numArr[i]=(int)(Math.random()*10);
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0;i<numArr.length;i++) {
			counter[numArr[i]]++;
		}
		for(int i=0;i<numArr.length;i++) {
			System.out.println(i+"ÀÇ °³¼ö : "+counter[i]);
		}
	}

}
