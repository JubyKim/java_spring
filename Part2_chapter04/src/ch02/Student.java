package ch02;

public class Student {

	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;
			
			if(this.studentNum == std.studentNum) {
				return true;
			}else return false;
		}
		return super.equals(obj);
	}
	
	
}
