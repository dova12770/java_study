package study.cls.cls02;

public class Phone {

	//필드
	String model;	//기본값, 무조건 필요O
	int price;		//기본값 : 100
	int battery;	//기본값 : 3000
	
	//기본생성자
//	Phone(){
//	}
	
	Phone(String model){
		this(model, 100, 3000);
	//	this.model =model;
	//	this.price = 100;
	//	this.battery = 3000;
	}
	
	Phone(String model, int price){
		this(model, 100, 3000);
		//this.model = model;
		//this.price = price;
		//this.battery = 3000;
	}
	
	Phone(String model, int price, int battery){
		this.model = model;
		this.price = price;
		this.battery = battery;
		
		//재부팅
		//사용자등록
		//필름부착
		//알콜 소독
		initSetting();
	}
	
	void initSetting() {
		//초기세팅1
		//세팅2
	}

}
