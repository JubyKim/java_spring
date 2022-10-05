package Semi_Project;

import java.util.ArrayList;
import java.util.Arrays;

public class Subject {
	
	private int subjectId ; //국어는 1, 수학은 2
	private String subjectName;
	private int gradeType; //일반 과목이라면 A ~ F로, 필수 과목이라면 S ~ F 로 분류합니다. 일반 :1 필수 : 2
	private ArrayList<Student> studentList;
	
	public Subject(String subjectName, int subjectId){
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = this.gradeType;
	}
	
	public void makeStudentList(ArrayList<Student> students) {
		this.studentList = students;
	}
	
	public void register(Student student){  //수강신청
		studentList.add(student);
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}


	

}
