package study.practice.practice24;

public class TrashCan {

	int liter;
	String color;
	
	int percent;
	
	boolean isCoverOpened; //쓰레기통 개폐여부
	
	public void openCover() {
		isCoverOpened =true;
	}
	public void closeCover() {
		isCoverOpened =false;
	}
	public void cleanTrashCan() {
		percent =0;
	}
	
	public void insertTrash(int percent) {
		this.percent += percent;
	}
	
	public void insertTrashLiter(int liter) {
		percent =percent + (liter/this.liter*100);
	}
	
}
