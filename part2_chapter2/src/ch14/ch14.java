package ch14;

public class ch14 {

	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 20000);
		
		Bus bus = new Bus(100);
		Bus bus2 = new Bus(400);
		Bus bus3 = new Bus(500);
		Bus bus4 = new Bus(200);
		
		Subway sub = new Subway(2);
		
		Taxi tax = new Taxi("잘 나간다 운");
		
		studentJ.takeABus(bus);
		studentT.takeSubway(sub);
		studentT.takeTaxi(tax);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus.showBusInfo();
		sub.showBusInfo();
		tax.showTaxiInfo();
//		bus2.showBusInfo();
	}

}
