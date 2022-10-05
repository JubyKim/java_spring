package ch12;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		this("no name", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name);
	}

	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		
		person.showPerson();
		System.out.println(person.getPerson());
		
		Person person1 = new Person();
		System.out.println(person1.getPerson());
		
	}
}
