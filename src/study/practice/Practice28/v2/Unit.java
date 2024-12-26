package study.practice.Practice28.v2;

public abstract class Unit {
	int x, y;
	abstract void move(int x, int y); 
	void stop() {/* 현재 위치에 정지 */ }
}
//public interface Unit {
//	//상수형 변수취금
//	//추상 메소드
//	//변수를 자식들이 다 가지고 있고 재정의도 다 같이 해야함
//	int x, y;
//	abstract void move(int x, int y); 
//	void stop() {/* 현재 위치에 정지 */ }
//}
