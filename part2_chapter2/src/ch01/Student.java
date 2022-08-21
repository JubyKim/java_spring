package ch01;

public class Student {
	int studentNumber;
	String studentName ;
//	int majorCode;
//	String majorName;
//	int grade;
	
	public void showStudentInfo() {
		System.out.println("학생의 이름은 " + studentName );
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
}
