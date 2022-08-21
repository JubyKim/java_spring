package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		Student std1 = new Student(100, "Kim");
		std1.setKoreanSubject("국어", 90);
		std1.setMathSubject("수학", 50);
		
		Student std2 = new Student(101, "Moon");
		std2.setKoreanSubject("국어", 80);
		std2.setMathSubject("수학", 100);
		
		std1.showScoreInfo();
		std2.showScoreInfo();
	}

}
