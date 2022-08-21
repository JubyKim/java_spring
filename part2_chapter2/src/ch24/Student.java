package ch24;

import java.util.ArrayList;

import ch21.Book;

public class Student {

	private static int studentNum = 1000;
	int stuCode;
	String stuName;
//	ArrayList<Book> library = new ArrayList<>();
	ArrayList<Subject> subjects = new ArrayList<>();
	
	public Student(String stuName) {
		studentNum++;
		this.stuCode = studentNum;
		this.stuName = stuName;

	}
	public void takeClass(String subName, int score) {
		Subject newSub = new Subject(subName, score);
//		newSub.setScore(score);
//		newSub.setSubName(subName);
//		newSub.subName = subName;
//		newSub.score = score;
//		System.out.print(newSub.subName);
		this.subjects.add(newSub);
	}
	
	public void showScore() {
		System.out.print(stuName + " 학생은 ");
		for (Subject s : subjects) {
			System.out.print(s.subName + " " + s.score + ", ");
		}
		System.out.println(" 입니다.");
	}
	
	public void showTotalScore() {
		int total = 0;
		for (Subject s : subjects) {
			total += s.score;
		}
		System.out.println("총점은 " + total + "입니다.");
	}
	
}