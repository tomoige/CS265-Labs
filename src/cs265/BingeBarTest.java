package cs265;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;

public class BingeBarTest {

	// test data
	private static Object[][] testData = new Object[][] {
			// id, variable1, variable2, ... variableN, expected
			{"1.1", true, true, true, true, 9},
			{"1.2", false, true, true, true, 5},
			{"1.3", true, false, true, true, 4},
			{"1.4", false, false, true, true, 0},
			{"1.5", true, true, false, true, 18},
			{"1.6", false, true, false, true, 10},
			{"1.7", true, false, false, true, 8},
			{"1.8", false, false, false, true, 0},
			{"1.9", true, true, true, false, 18},
			{"1.10", false, true, true, false, 10},
			{"1.11", true, false, true, false, 8},
			{"1.12", false, false, true, false, 0},
			{"1.13", true, true, false, false, 18},
			{"1.14", false, true, false, false, 10},
			{"1.15", true, false, false, false, 8},
			{"1.16", false, false, false, false, 0},		 
	};

	@DataProvider(name = "data")
	public Object[][] getTestData() {
		return testData;
	}

	@Test(dataProvider = "data")
	public void test(String id, boolean cocktail, boolean nonAlc, boolean student, boolean happyHour, int expected) {
		 assertEquals(BingeBar.getPrice(cocktail, nonAlc, student, happyHour), expected);
	}
}