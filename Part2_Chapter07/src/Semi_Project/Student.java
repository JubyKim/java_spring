package Semi_Project;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	private String major;
	private ArrayList scoreList;
	
	public Student(int studentId, String studentName, String major, ArrayList scoreList) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.major = major;
		this.scoreList = scoreList;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public ArrayList getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList scoreList) {
		this.scoreList = scoreList;
	}
	
	
	
}
