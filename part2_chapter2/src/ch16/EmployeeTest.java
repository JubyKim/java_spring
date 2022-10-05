package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeKim = new Employee();
		employeeKim.setDepartment("시스템1팀");
		employeeKim.setEmployeeName("김주은");
		
		Employee employeeMoon = new Employee();
		employeeMoon.setDepartment("AI");
		employeeMoon.setEmployeeName("문호준");
//		employeeMoon.serialNum ++ ;
		
		System.out.println(employeeKim.getEmployeeID()); // 두개의 인스턴스가 하나의 변수를 공유한다.
		System.out.println(employeeMoon.getEmployeeID());
		
	}

}
