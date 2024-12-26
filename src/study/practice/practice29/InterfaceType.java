package study.practice.practice29;

import java.util.ArrayList;
import java.util.List;

//basecode
public class InterfaceType {
	public static void main(String[] args) {
		//객체 생성
		Food f= new Food("족발",19800);
		Electronics e = new Electronics("에어팟",199000);
		Clothing c = new Clothing("셔츠",49900);
		
		//총합 계산
		int total = f.discountedPrice()+e.discountedPrice()+c.discountedPrice();
		
		//결과 출력
		System.out.println("총합: "+ total +"원");
		
		
		
		List<Orderable> orderList = new ArrayList<Orderable>();
		orderList.add(new Food("족발",19800));
		orderList.add(new Electronics("에어팟",199000));
		orderList.add(new Clothing("셔츠",49900));
		
		int sum = 0;
		for(int i=0; i<orderList.size(); i++) {
			sum += orderList.get(i).discountedPrice();
		}
		
		sum = 0;
		for(Orderable oa : orderList) {
			sum+= oa.discountedPrice();
		}
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
		//원래금액의 10% 할인 된 금액 반환
		return price - (int)(price*0.1);
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
		return price - (int)(price*0.2);
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
		return price - (int)(price*0.3);
	}
}
