package quiz.dbTest;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import study.api.ArplInfo;

import java.io.BufferedReader;
import java.io.IOException;

public class TestapiService {

	public class ApiExplorer {
	    public static String Weather(String string) throws IOException {
	        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst"); /*URL*/
	        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=MJt43nqJOTEwJw4Mw5%2FflaLyXZ7wTk9Cy8m7Do9g%2BXbsSA3IKXdPQ41NYf%2FXDhWFTD73H0guTV5%2BkIkghY5ImA%3D%3D"); /*Service Key*/
	        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
	        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8")); /*한 페이지 결과 수*/
	        urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("XML", "UTF-8")); /*요청자료형식(XML/JSON) Default: XML*/
	        urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode("20210628", "UTF-8")); /*‘21년 6월 28일 발표*/
	        urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode("0600", "UTF-8")); /*06시 발표(정시단위) */
	        urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode("55", "UTF-8")); /*예보지점의 X 좌표값*/
	        urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode("127", "UTF-8")); /*예보지점의 Y 좌표값*/
	        URL url = new URL(urlBuilder.toString());
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Content-type", "application/json");
	        System.out.println("Response code: " + conn.getResponseCode());
	        BufferedReader rd;
	        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        } else {
	            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
	        }
	        StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = rd.readLine()) != null) {
	            sb.append(line);
	        }
	        rd.close();
	        conn.disconnect();
	       
	        String result = sb.toString();
	        return result;
	    }
	}
	public static List<TestInfo> WeatherInfoList(String String) throws IOException{
		List<TestInfo> testList = new ArrayList<TestInfo>();
		try {
			
			String jsonText =String;
			System.out.println(jsonText);
			
			JSONParser jsonParser = new JSONParser();
//			JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonText); 
//			JSONObject response = (JSONObject) jsonObj.get("response");
//
//			JSONObject header = (JSONObject) response.get("header");
//			System.out.println(header.get("resultCode"));
//			System.out.println(header.get("resultMsg"));
//
//			JSONObject body = (JSONObject) response.get("body");
//			System.out.println(body.get("DataType"));
//
//			JSONArray items = (JSONArray) body.get("items");
//			for(int i=0; i<items.size();i++) {
//				
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testList;
	}

	public static String convertValueToString(Object obj) {
		return obj ==null ? "": obj.toString();
	}

}
