package cs265;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AirlineSeatReservationsTest {
	private static Object[][] testData = new Object[][] {
		// id, variable1, variable2, ... variableN, expected
	 { "T1", 50, 75, false},
	 { "T2", 50, 25, true },
	 { "T3", -100, 25, false },
	 { "T4", 200, 25, false },
	 { "T5", 50, -100, false },
	 { "T6", 50, 200, false}
	};
	
	@DataProvider(name = "data")
	public Object[][] getTestData() {
		return testData;
	}

	@Test(dataProvider = "data")
	public void seatsAvailableTest(String id, int freeSeats, int seatsRequired, boolean expected) {
	    boolean result = AirlineSeatReservations.seatsAvailable(freeSeats, seatsRequired);
	    assertEquals(result, expected, "Failed test case: " + id);
	}
}
