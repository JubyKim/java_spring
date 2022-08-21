package ch10_protected;

public class BirthdayTest {

	public static void main(String[] args) {
		BirthDay date = new BirthDay();
		date.setDay(30);
		date.setMonth(12);
		date.setYear(2019);
		
		date.showDate();
	}

}
