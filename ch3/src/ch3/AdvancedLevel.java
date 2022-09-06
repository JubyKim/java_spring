package ch3;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("높이 jump합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn할 수 없습니다.");
		
	}

	@Override
	public void showMessage() {
		System.out.println("******AdvancedLevel 입니다.******");
		
	}


}
