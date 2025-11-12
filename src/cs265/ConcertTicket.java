package cs265;

public class ConcertTicket {
	public static int concertTicket(int age, boolean isMember) {
		if(age >= 18 && age <= 35 && isMember) {
			return 35;
		}
		if(age >= 18 && age <= 35 && !isMember) {
			return 40;
		}
		if(age >= 36 && age <= 50 && isMember) {
			return 55;
		}
		if(age >= 36 && age <= 50 && !isMember) {
			return 65;
		}
		return -1;
	}
}
