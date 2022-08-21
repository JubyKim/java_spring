package ch14;

public class Subway {
	int lineNumber;
	int passengerCount;
	int income;
	
	public Subway(int busNumber) {
		this.lineNumber = busNumber;
	}
	
	public void take(int money) {
		this.income += money;
		this.passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(lineNumber + "번의 승객 수는 " + passengerCount + "명이고, 수입은 " + income + "원 입니다.");
	}
}