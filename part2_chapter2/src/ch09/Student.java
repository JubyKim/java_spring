package ch09;

public class Student {
	int studentID;
	String studentName;
	
	Subject korean;
	Subject math;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKoreanSubject(String name, int score) {
		korean.subjectName = name;
		korean.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScoreInfo() {
		int total = korean.score + math.score ;
		System.out.println(total);
	}
	
}
