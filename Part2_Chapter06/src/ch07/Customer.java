package ch07;

public class Customer {

	private String name;
	private int age;
	private int cost;
	
	Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.cost = age >= 15 ? 1000000 : 500000;  
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return	"이름 : " + name + "나이 : " + age + "금액 : " + cost;
	}
	
	
	
}
