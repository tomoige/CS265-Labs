package cs265;

public class RailTicket {
	public static int railTicket(int age) {
		if(age <= 0 || age > 110) {
			return -1;
		}
		if(age >= 1 && age <= 4) {
			return 100;
		}
		if(age >= 5 && age <= 16) {
			return 50;
		}
		if(age >= 65 && age <= 110) {
			return 25;
		}
		
		return 0;
	}
}
