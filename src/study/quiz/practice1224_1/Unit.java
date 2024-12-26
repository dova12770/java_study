package study.quiz.practice1224_1;

public abstract class Unit {
	int x, y;

	void stop() {
		System.out.println("정지");
	}

	abstract void move(int x, int y); // 지정된 위치로 이동
}

class Marine extends Unit { // 보병
	int x, y; // 현재 위치

	void move(int x, int y) {
		System.out.println("마린 이동");
	} // 지정된 위치로 이동

	void stimPack() {
		System.out.println("스팀팩");
	} // 스팀팩을 사용한다
}

class Tank extends Unit{ // 탱크
	int x, y; // 현재 위치

	void move(int x, int y) {
		System.out.println("시즈탱크 이동");
	} // 지정된 위치로 이동

	void changeMode() {
		System.out.println("시즈모드");
		/* . */} // 공격모드를 변환한다
}

class Dropship extends Unit{ // 수송선
	int x, y; // 현재 위치

	void move(int x, int y) {
		System.out.println("드랍쉽 이동");
	} // 지정된 위치로 이동

	void load() {
		System.out.println("탑승");
	} // 선택된 대상을 태운다

	void unload() {
		System.out.println("하차");
	} // 선택된 대상을 내린다
}