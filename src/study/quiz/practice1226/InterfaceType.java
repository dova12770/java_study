package study.quiz.practice1226;

public class InterfaceType {
	public static void main(String[] args) {
		// 객체 생성
		Food pig= new Food("족발",19800);
		Electronics airpot = new Electronics("에어팟",199000);
		Clothing shirt = new Clothing("셔츠",49900);
		// 총합 계산
		int sum = (pig.discountedPrice()+airpot.discountedPrice()+shirt.discountedPrice());
		// 결과 출력
		System.out.println("총합: "+sum+"원");
	}
}

interface Orderable {
	public int discountedPrice();
	
}

class Food implements Orderable {
	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */

	@Override
	public int discountedPrice() {
		// TODO Auto-generated method stub
		int disCount=(int)(this.price*0.10);
		return this.price-disCount;
	}
}

class Electronics implements Orderable {
	private String name;
	private int price;

	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */

	@Override
	public int discountedPrice() {
		// TODO Auto-generated method stub
		int disCount=(int)(this.price*0.20);
		return this.price-disCount;
	}
}

class Clothing implements Orderable {
	private String name;
	private int price;

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */

	@Override
	public int discountedPrice() {
		// TODO Auto-generated method stub
		int disCount=(int)(this.price*0.30);
		return this.price-disCount;
	}
}