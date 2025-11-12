package cs265;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;

public class CS265_Lab_W07Test {

	// test data
	private static Object[][] testData = new Object[][] {
			// id, variable1, variable2, ... variableN, expected
			{"X3.1", false, false, CS265_Lab_W07.TicketType.Economy, 5},
			{"X3.2", true, false, CS265_Lab_W07.TicketType.Economy, 10},
			{"X3.3", false, true, CS265_Lab_W07.TicketType.Economy, 10},
			{"X3.4", true, true, CS265_Lab_W07.TicketType.Economy, 20},
			{"X3.5", false, false, CS265_Lab_W07.TicketType.Business, 0},
			{"X3.6", true, false, CS265_Lab_W07.TicketType.Business, 5},
			{"X3.7", false, true, CS265_Lab_W07.TicketType.Business, 5},
			{"X3.8", true, true, CS265_Lab_W07.TicketType.Business, 10},
			{"X3.9", false, false, CS265_Lab_W07.TicketType.First, 0},
			{"X3.10", true, false, CS265_Lab_W07.TicketType.First, 0},
			{"X3.11", false, true, CS265_Lab_W07.TicketType.First, 0},
			{"X3.12", true, true, CS265_Lab_W07.TicketType.First, 0}
	};

	@DataProvider(name = "data")
	public Object[][] getTestData() {
		return testData;
	}

	@Test(dataProvider = "data")
	public void test(String id, Boolean music, boolean sports, CS265_Lab_W07.TicketType ticket,  int expected) {
		 assertEquals(CS265_Lab_W07.equipmentInsurance(music, sports, ticket), expected);
	}
}