package Semi_Project;

import java.util.ArrayList;
import java.util.Arrays;

public class Subject {
	
	private int subjectId ; //국어는 1, 수학은 2
	private String subjectName;
	private int gradeType; //일반 과목이라면 A ~ F로, 필수 과목이라면 S ~ F 로 분류합니다.
	private ArrayList<Student> studentList;
	
	public Subject(String subjectName, int subjectId){
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = this.gradeType;
	}
	
	public void makeStudentList(ArrayList<Student> students) {
		this.studentList = students;
	}
	

}
