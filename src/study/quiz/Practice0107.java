package study.quiz;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Practice0107 {
	
//	try {
//	String str = "{\r\n" + "\"id\": 1,\r\n" + "\"name\": \"John Doe\",\r\n" + "\"contacts\": [\r\n" + "{\r\n"
//			+ "\"type\": \"email\",\r\n" + "\"value\": \"john.doe@example.com\"\r\n" + "},\r\n" + "{\r\n"
//			+ "\"type\": \"phone\",\r\n" + "\"value\": \"01023456789\"\r\n" + "}\r\n" + "],\r\n" + "\"address\": {\r\n"
//			+ "\"street\": \"123 Main Street\",\r\n" + "\"city\": \"Seoul\",\r\n" + "\"zipcode\": \"12345\"\r\n"
//			+ "},\r\n" + "\"orders\": [\r\n" + "{\r\n" + "\"orderId\": \"ORD-001\",\r\n"
//			+ "\"date\": \"2024-07-09\",\r\n" + "\"items\": [\r\n" + "{\r\n" + "\"id\": 1,\r\n"
//			+ "\"name\": \"Smartphone\",\r\n" + "\"quantity\": 2\r\n" + "},\r\n" + "{\r\n" + "\"id\": 2,\r\n"
//			+ "\"name\": \"Laptop\",\r\n" + "\"quantity\": 1\r\n" + "}\r\n" + "]\r\n" + "},\r\n" + "{\r\n"
//			+ "\"orderId\": \"ORD-002\",\r\n" + "\"date\": \"2024-07-10\",\r\n" + "\"items\": [\r\n" + "{\r\n"
//			+ "\"id\": 3,\r\n" + "\"name\": \"Headphones\",\r\n" + "\"quantity\": 1\r\n" + "}\r\n" + "]\r\n" + "}\r\n"
//			+ "]\r\n" + "}";
//
//	JSONParser jsonParser = new JSONParser();
//	JSONObject jsonObj = (JSONObject) jsonParser.parse(str);
//	
//	JSONObject strArr = (JSONObject) jsonObj.get("strArr");
//		System.out.println("id : " + strArr.get("id"));
//		System.out.println("name : " + strArr.get("name"));
//	for(int i = 0;i<strArr.size();i++){
//		JSONObject strs = (JSONObject) strArr.get(i);
//		JSONArray contacts = (JSONArray) jsonObj.get("contacts");
//		for(int j = 0;j<contacts.size();j++) {
//			JSONObject contact = (JSONObject) contact.get(j);
//
//			System.out.println("type : " + contact.get("type"));
//			System.out.println("type : " + contact.get("value"));
//		}
//		
//		JSONObject address = (JSONObject) jsonObj.get("address");
//		System.out.println("street : "+ address.get("street"));
//		System.out.println("city : "+ address.get("city"));
//		System.out.println("zipcode : "+ address.get("zipcode"));
//		
//		JSONArray orders = (JSONArray) jsonObj.get("orders");
//		for(int k = 0; k<orders.size(); k++) {
//			JSONObject order = (JSONObject) order.get(k);
//			
//			System.out.println("order : "+order.get("orderId"));
//			System.out.println("order : "+order.get("date"));
//			
//			JSONArray items =(JSONArray)jsonObj.get("items");
//			for(int n = 0; n<items.size(); n++) {
//				JSONObject item = (JSONObject) item.get(n);
//				
//				System.out.println("id : "+item.get("id"));
//				System.out.println("name : "+item.get("name"));
//				System.out.println("quantity : "+item.get("quantity"));
//			}
//		}
//		
//	}
//	
//	
//	} catch(Exception e){
//		e.printStackTrace();
//	}
//	return str;
//}
}
