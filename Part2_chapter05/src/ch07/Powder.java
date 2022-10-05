package ch07;

public class Powder extends Material{
	public String toString() {
		return "재료는 powder입니다";
	}

	@Override
	public void doPrint() {
		System.out.print("파우더를 이용하여 프린트합니다.");
		
	}
}
