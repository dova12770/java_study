package study.quiz.practice1223;

public class EducationCenter {

	public static void main(String[] args) {

	}
	protected class center{
		
	}
	
	protected class workerList {
		String name;
		int age;
	}

	protected class worker extends workerList {
		int tall;
		int weight;
		int pay;
		String dept;
	}

	protected class roomList {
		int roomNumber;
	}

	protected class room extends roomList {
		int desk;
		int chair;
		
	}

	protected class classRoom extends room {
		int cumputer;
	}

	protected class restRoom extends room {
		int drink;
		int snack; 
	}

	protected class officRoom extends room {
		int cumputer;
	}
}
