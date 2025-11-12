package cs265;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CS265_Lab_W03Test {

  @Test
  public void editDistance_basicTest1() {
	  assertEquals(CS265_Lab_W03.editDistance("Software", "Hardware"),
			  4);
  }
}
