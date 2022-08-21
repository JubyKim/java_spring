package ch24;

public class ch24Test {

	public static void main(String[] args) {
		Student stdLee = new Student("Lee");
		Student stdKim = new Student("Kim");
		
		stdLee.takeClass("국어", 100);
		stdLee.takeClass("수학", 50);
		

		stdKim.takeClass("국어", 70);
		stdKim.takeClass("수학", 85);
		stdKim.takeClass("영어", 100);
		
		System.out.print(stdLee.subjects.size());
		System.out.print(stdKim.subjects.size());
		

//		System.out.print(stdLee.subjects.size());
		stdLee.showScore();
	}

}

//1001학번 Lee와 1002학번 Kim, 두 학생이 있습니다. 
//Lee 학생은 국어와 수학 2과목을 수강했고, Kim 학생은 국어, 수학, 영어 3 과목을 수강하였습니다.
//Lee 학생은 국어 100점, 수학 50점입니다. 
//Kim 학생은 국어 70점, 수학 85점, 영어 100점입니다. 
//Student와 Subject 클래스를 만들고 ArrayList를 활용하여 두 학생의 과목 성적과 총점을 출력하세요