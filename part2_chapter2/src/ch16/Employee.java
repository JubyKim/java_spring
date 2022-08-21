package ch16;

public class Employee {
	
	public static int serialNum = 1000;
	
	private int employeeID;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum ++;
		this.employeeID = serialNum;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public static int getSerialNum() {
		return serialNum;
	}
	
	
}
