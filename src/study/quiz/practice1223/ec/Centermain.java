package study.quiz.practice1223.ec;

import java.util.ArrayList;

public class Centermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Center center =new Center();
		center.staffList = new ArrayList<Staff>();
		center.roomList = new ArrayList<Room>();
		
		center.staffList.add(new Staff());
		center.staffList.add(new Staff());
		center.staffList.add(new Staff());
		
		center.roomList.add(new LectureRoom());
		center.roomList.add(new LectureRoom());
		center.roomList.add(new LectureRoom());
		
		center.roomList.add(new LoungeRoom());
		center.roomList.add(new LoungeRoom());
		
		center.roomList.add(new OfficeRoom());
	}

}
