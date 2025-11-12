package cs265;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;

public class ConcertTicketDTTest {

	// test data
	private static Object[][] testData = new Object[][] {
			// id, variable1, variable2, ... variableN, expected
			{"T2.1", 16, true, -1},
			{"T2.2", 40, true, 55},
			{"T2.3", 20, true, 35},
			{"T2.4", 100, false, -1},
			{"T2.5", 40, false, 65},
			{"T2.6", 20, false, 40}
	};

	@DataProvider(name = "data")
	public Object[][] getTestData() {
		return testData;
	}

	@Test(dataProvider = "data")
	public void test(String id, int age, boolean isMember, int expected) {
		 assertEquals(ConcertTicketDT.concertTicket(age, isMember), expected);
	}
}