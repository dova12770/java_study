package study.practice.Practice23.Kitchen;

public class Kitchen {
	
	int place; //평수
	String wallcolor; //벽색상
	int floorHeight;	//층고
	
	public Kitchen(int place, String wallcolor, int floorHeight) {
	this.place=place;
	this.wallcolor=wallcolor;
	this.floorHeight=floorHeight;
}
	public class refrigerator{
		
		String maker;		//브랜드
		int liter;			//리터
		boolean powerOn;	//전원
		int temperature;	//온도
		int tempdoor;		//문개수
		
		int iceBox;			//얼음트레이구멍수 
		int priceIB;		//가격
	}
	public class gasStove{
		
		int firePlace;		//화구
		int brand;			//브랜드
		int priceFP;		//가격
		boolean powerOnO;	//전원
		int firePower;		//화력
	}
	public class sink{
		int x;				//가로
		int y;				//세로
		int z;				//깊이
		String sinkColor;	//색상
		String material;	//재질
	}
	public class garbageCan{
		int garbageCans;		//개수
		int garbageCanLiter;	//리터
		String garbageCanColor;	//색상
		int garbageCantotal;	//용량
		boolean garbageCanOpen;	//열고닫음
		boolean garbageCanpull;	//채우고비움
	}
	public class cup{
		int cups;			//컵개수
		String cupMaterial;	//재질
		String cupColor;	//색상
		
	}
}
