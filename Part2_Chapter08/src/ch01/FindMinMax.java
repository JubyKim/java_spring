package ch01;

public class FindMinMax {
	public static void main(String[] args) {

		int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		int min = 999;
		int max = 0;
		for(int i = 0; i < numbers.length; i ++) {
			min = numbers[i] < min ? numbers[i] : min;
			max = numbers[i] > max ? numbers[i] : max;
		}

		System.out.println("최솟값은 " + min + "입니다.");
		System.out.println("최댓값은 " + max + "입니다.");


	}

}