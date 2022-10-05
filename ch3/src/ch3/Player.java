package ch3;

public class Player {

	private PlayerLevel level;
	
	public Player(){
		level = new BeginnerLevel();
		level.showMessage();
	}
	
	
	PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel( PlayerLevel level ) {
		this.level = level;
		level.showMessage();
	}
	
	void play(int i) {
		level.go(i);
	}

}
