package ch14;

public class Taxi {
	String companyName;
	int income;
	
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	
	public void showTaxiInfo() {
		System.out.println(companyName);
		System.out.println(income);
	}
	
	public void take(int income) {
		this.income += income;
	}

}
