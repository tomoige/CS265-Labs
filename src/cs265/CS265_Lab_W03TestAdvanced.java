package cs265;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;

public class CS265_Lab_W03TestAdvanced{

	// test data
	private static Object[][] testData = new Object[][] {
			// id, variable1, variable2, ... variableN, expected
		 { "T1", "Software", "Hardware", 4 },
		 { "T2", "Hi", "Hello", 4 },
		 { "T3", "Software", "Hardware", 4 },
	};

	@DataProvider(name = "data")
	public Object[][] getTestData() {
		return testData;
	}

	@Test(dataProvider = "data")
	public void test(String id, String variable1, String variable2, int expected) {
		 assertEquals(CS265_Lab_W03.editDistance(variable1, variable2), expected);
	}
}