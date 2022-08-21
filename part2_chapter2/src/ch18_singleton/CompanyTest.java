package ch18_singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		
		
		System.out.println(com1);
		System.out.println(com2);
		
	}

}
