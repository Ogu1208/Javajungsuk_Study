
public class ch09_03 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		//String fullPath2 = fullPath.replace ("\\","\");
		int NfileName = fullPath.lastIndexOf("\\");
		fileName = fullPath.substring(++NfileName);
		path = fullPath.substring(0, NfileName);
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
	}

}
