package study.quiz.practiceQuiz0107;

import org.json.simple.parser.ParseException;

public class Quiz13 {

	public static void main(String[] args) {

		//String jsonStr = OrderApiService.orderInfo(); //json 포맷 텍스트
		
		//가공 parse 분석 (가공 전 분석?)(Integer.parseInt Double.parseDouble)
		
		try {
			CustomerDTO customerDTO = OrderApiService.orderInfo();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//db 저장?
		
		OrderDAO orderDAO = new OrderDAO();
		
		//orderDAO 이거 저장해라~

	}

}
