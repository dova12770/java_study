package study.quiz.practiceQuiz0107;

public class Concept {
	
	//main 메소드 대형마트
	//DB 제품창고
	//DAO Data Access Object 창고 접근담당 직원		ex)튀김류 전담 직원, 해산물 전담 직원
	//apiService 본사 물류센터 or 연계된 동해 수산 외부접촉담당직원 프로그램들끼리 서로 상호작용
	//apiService 이름의 객체 API 서비스 소통담당
	//DTO Data Transfer Object 전달을 편하게 하려고 만든 도구 ex)카트,박스
	
	public static void main(String[] args) {
		
		// 외부 공공데이터 포탈 API 서버 <-> ApiService <-> Main <-> DAO <-> DB
		
		//										(DTO)		(DTO)
		goGetDonMan();
	}
	
	
	//돈까스, 만두
	public static CartDTO goGetDonMan() {
		
		CartDTO cart = new CartDTO();
		cart.item1= "돈까스";
		cart.item2= "만두";
		
		return cart;
		//return "만두";
	}

}

class CartDTO{	//포장박스
	//필드
	String item1;
	String item2;
	
	//생성자	생성 편하게
	//메소드 getter,setter
}

class FoodDAO { //음식 DB 접근 담당 객체
	//findFoodLIst
	//saveFood
	//modifyFood
	//removeFood
	//findFoodByFoodId
	//		(DTO)
}
class FoodDTO{ }

class ClothDAO { //의류 담당
	//findClothList
}

class ClothDTO{ }

class HeadApiService {	//본사 API 서비스 접근 담당
	// API 서버 경로 ,요청 변수 준비 , 인증키 삽입, 요청, json 포맷 텍스트 확보
	// json 포맷-> 정리된 객체 형태 반환
	//				(DTO)
}







