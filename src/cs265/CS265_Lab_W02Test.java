package cs265;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CS265_Lab_W02Test {

  @Test
  public void method1() {
	  int expectedValue = 70;
	  assertEquals(CS265_Lab_W02.method1(35, 10), expectedValue);
  }
}
