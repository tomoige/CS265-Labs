package cs265;

public class InterestCalculator {

	static public double interestRate(int deposit){
		double rv;
		if (deposit <= 0){
			rv = 0.000;
		} else if (deposit <= 100){
			rv = 0.003;
		} else if (deposit <= 1000){
			rv = 0.005;
		} else {
				rv = 0.007;
		}
		return rv;
	}
}