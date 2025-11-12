package cs265;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InterestCalculatorTest {
	private static Object[][] testData = new Object[][] {
		// id, variable1, variable2, ... variableN, expected
	 { "T1", 50, 0.003},
	 { "T2", 500, 0.005},
	 { "T3", 2000,0.007},
	 { "T4", -100, 0}
	};
	
	@DataProvider(name = "data")
	public Object[][] getTestData() {
		return testData;
	}

  @Test(dataProvider = "data")
  public void interestRateTest(String id, int deposit, double expected) {
	  assertEquals(InterestCalculator.interestRate(deposit), expected, "Failed test case: " + id);
  }
}
