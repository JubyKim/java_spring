package ch06;

public class Student {

	public int studentID;
	public String studentName;
	public String studentAddress;
	
	
	public Student() {
		
	}
	
	public Student(int studentID, String studentName, String studentAddress) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	public String showStudentInfo() {
		return studentID + "의 이름은 " + studentName + "입니다.";
	}
}
