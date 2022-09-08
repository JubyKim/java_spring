package ch13;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		
System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		try {
			while( (i = System.in.read()) != '\n' ) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
