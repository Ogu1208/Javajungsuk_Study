class Unit {
	int x, y; // 현재 위치
	void move(int x, int y) {}
	void stop() {}
}

class Marine extends Unit { // 보병
	void stimPack() {}
}
class Tank extends Unit { // 탱크
	void changeMode() {}
}
class Dropship extends Unit { // 수송선
	void load() {}
	void unload() {}
}

public class ch07_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
