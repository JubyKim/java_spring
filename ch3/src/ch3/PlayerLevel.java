package ch3;

public abstract class PlayerLevel {

	public abstract void run();
	
	public abstract void jump();
	
	public abstract void turn();
	
	public abstract void showMessage();
	
	public void go(int cnt) {
		run();
		for(int i = 0; i<cnt; i++) {
			jump();
		}
		turn();
	}
}
