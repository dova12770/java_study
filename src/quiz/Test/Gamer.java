package quiz.Test;

public class Gamer {

	String id;		//기기아이디
	String place;	//지점명
	int totalPoint; //총합포인트
	int s_count;	//성공횟수
	int f_count;	//실패횟수
	int v_count;	//잔여시도회수
	int totalSales;	//매출액
	
	
	public Gamer(String id, String place) {
		this.id = id;
		this.place = place;
		this.totalPoint=0;
		this.s_count=0;
		this.f_count=0;
		this.v_count=0;
		this.totalSales=0;
	}
}
