package cs265;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;

public class CS265_Lab_W08Test{

	// test data
	private static Object[][] testData = new Object[][] {
			// id, variable1, variable2, ... variableN, expected
		{"1", "Anna", true},
		{"2", "Hello", true},
		{"3", "", true},
		{"4", "$", true},
	};

	@DataProvider(name = "data")
	public Object[][] getTestData() {
		return testData;
	}

	@Test(dataProvider = "data")
	public void isPalindromeTest(String id, String variable1, boolean expected) {
		 assertEquals(CS265_Lab_W08.isPalindrome(variable1), expected);
	}
}