package ch9_exercise_SKY;

public class Ex9_12 {
	
	static int getRand(int from, int to) {
		return (int)(Math.random()*(Math.abs(from-to)+1))+Math.min(from,to);
	}
	
	public static void main(String[] args)
	{
		for(int i=0; i< 20; i++)
			System.out.print(getRand(1,-3)+",");
	}
}
