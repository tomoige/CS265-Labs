package cs265;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;

public class RailTicketTest {

	// test data
	private static Object[][] testData = new Object[][] {
			// id, variable1, variable2, ... variableN, expected
			{"T1.1", -10, -1},
			{"T1.2", 2, 100 },
			{"T1.3", 10, 50 },
			{"T1.4", 35, 0},
			{"T1.5", 78, 25},
			{"T1.6", 120, -1}
	};

	@DataProvider(name = "data")
	public Object[][] getTestData() {
		return testData;
	}

	@Test(dataProvider = "data")
	public void test(String id, int age, int expected) {
		 assertEquals(RailTicket.railTicket(age), expected);
	}
}