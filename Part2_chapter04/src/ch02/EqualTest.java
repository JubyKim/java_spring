package ch02;

public class EqualTest {

	public static void main(String[] args) {
		
		Student std1 = new Student(100, "Kim");
		Student std2 = new Student(100, "Lee");
		Student std3 = std1;
		
		System.out.println(std1.equals(std2)); //두개의 주소값이 같은지?
		System.out.println(std1 == std2);
	}
}
