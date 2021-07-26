
public class ch05_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"kim","park","yi"};
		
		for(int i=0;i<names.length;i++) {
			System.out.println("names["+i+"]:"+names[i]);
		}
		String tmp=names[2];
		System.out.println("tmp:"+tmp);
		names[0]="Yu";
		
		for(String str:names)
			System.out.println(str);
	}

}
