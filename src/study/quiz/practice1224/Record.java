package study.quiz.practice1224;

public class Record { // 출근기록

	boolean lateness; // 지각인지 아닌지
	int time; // 출근시간
	boolean vacation; // 휴가여부
	boolean earlyLeave; // 조퇴여부
	int earlyLeaveTime; // 조퇴시간

	public Record(boolean lateness, int time, boolean vacation, boolean earlyLeave, int earlyLeaveTime) {
		this.lateness = lateness;
		this.time = time;
		this.vacation = vacation;
		this.earlyLeave = earlyLeave;
		this.earlyLeaveTime = earlyLeaveTime;
	}

	public boolean lateness() {
		if (time > 8 && time < 18) {
			if (vacation == true) {
				System.out.println("휴가중입니다.");
			} else {
				System.out.println(time+"시에 출근하셨습니다.");
				System.out.println("지각입니다.");
			} 
			return true;
		} else {
			System.out.println("정상출근입니다.");
			return false;
		}
	}
	
	public boolean earlyLeave() {
		System.out.println(earlyLeaveTime+"시에 조퇴하셨습니다.");
		return true;
	}
}
