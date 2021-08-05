package ch7_exercise_Ogu;

abstract class Unit {  // 추상클래스
	int x, y;
	void move(int x, int y) {};  // 추상메서드로 하면 밑에 구현 귀찮아서  패스
	void stop() {}
}

class Marine extends Unit{ // 보병
	void stimPack() { } 
}

class Tank extends Unit{ // 탱크
	void changeMode() {} 
}

class Dropship extends Unit{ // 수송선
	void load() {  } 
	void unload() {  } 
}


public class Ex7_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
