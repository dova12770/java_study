package quiz.dbTest;

import java.io.IOException;
import java.util.List;

public class TestExplorer {

	public static void main(String[] args) {
		List<TestInfo> testInfo = null;
		try {
			testInfo= TestapiService.WeatherInfoList("20250106");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
