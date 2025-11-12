package cs265;

import org.testng.annotations.Test;

import cs265.CS265_Lab_W06.Sky;
import cs265.CS265_Lab_W06.WeatherPrediction;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;

public class CS265_Lab_W06Test{
	// test data
	private static Object[][] testData = new Object[][] {
			// id, variable1, variable2, ... variableN, expected
			{"T3.1", Integer.MIN_VALUE, Sky.Cloudy, WeatherPrediction.Error},
			{"T3.2", -15, Sky.Mixed, WeatherPrediction.Error},
			{"T3.3", -14, Sky.Cloudy, WeatherPrediction.Rainy},
			{"T3.4", 14, Sky.Mixed, WeatherPrediction.Rainy},
			{"T3.5", 15, Sky.Clear, WeatherPrediction.Sunny},
			{"T3.6", Integer.MAX_VALUE, Sky.Mixed, WeatherPrediction.Rainy}
	};

	@DataProvider(name = "data")
	public Object[][] getTestData() {
		return testData;
	}

	@Test(dataProvider = "data")
	public void test(String id, int temperature, Sky sky, WeatherPrediction expected) {
		 assertEquals(CS265_Lab_W06.predictWeather(temperature, sky), expected);
	}
}