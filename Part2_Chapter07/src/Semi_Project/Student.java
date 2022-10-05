package Semi_Project;

import java.util.ArrayList;
public class Student {
	private int studentId;    		//학번
	private String studentName;		//이름
	private Subject majorSubject;
	private ArrayList<Score> scoreList;
	
	public Student(int studentId, String studentName, Subject majorSubject, ArrayList scoreList) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
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

	public Subject getMajor() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}

	public ArrayList getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList scoreList) {
		this.scoreList = scoreList;
	}
	
	private Score Score(int studentId, Subject subject, int point) {
		return Score(studentId, subject, point);
	}

	public ArrayList<Score> addScoreList(Score score) {
		scoreList.add(score);
		return scoreList;
	}
	
}
