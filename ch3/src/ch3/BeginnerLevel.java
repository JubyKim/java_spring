package ch3;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("jump할 수 없습니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn할 수 없습니다.");
		
	}

	@Override
	public void showMessage() {
		System.out.println("******BeginnerLevel 입니다.******");
	}

}
