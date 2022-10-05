package ch07;

public class Plastic extends Material{
	public String toString() {
		return "재료는 Plastic입니다";
	}

	@Override
	public void doPrint() {
		System.out.print("플라스틱을 이용하여 프린트합니다.");
		
	}
}
