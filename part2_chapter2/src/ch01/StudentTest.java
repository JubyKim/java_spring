package ch01;

public class StudentTest {

	public static void main(String[] args) {
		Student studentKim = new Student();

		studentKim.studentNumber = 12345;
		studentKim.setStudentName("Kim jueun");
		
		studentKim.showStudentInfo();
	}

}
