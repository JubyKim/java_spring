package ch20;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int total = 0;
		
		for (int i = 0; i < 10; i++) {
			arr[i] = i+1;
		}
		
		for (int num : arr) {
			total += num;
		}
		
		System.out.print(total);
	}
	

}
