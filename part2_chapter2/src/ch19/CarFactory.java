package ch19;

public class CarFactory {

	private static CarFactory Instance = new CarFactory(); //하나의 instance를 공유하도록
	private static int SerialNum = 1000;
	
	private CarFactory() { // 다른곳에서 선언할 수 없도록 
		
	}
	
	public static CarFactory getInstance() {
		return Instance;
	}
	
	public Car createCar() {
		SerialNum += 1;
		Car newCar = new Car(SerialNum);
		return newCar;
	}
	
}
