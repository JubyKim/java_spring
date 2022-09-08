package ch03;

public class StringTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));
		java = java.concat(android); // 이렇게 하는 경우 다른 address를 바라봄.
		//garbage값이 생길 가능성이 높기에 stringBuilder나 StringBuffer를 사용하길 추천.
		//단일쓰레드의 경우 stringBuilder, 멀티쓰레드인 경우 StringBuffer를 사용.
		System.out.println(System.identityHashCode(java));

	}

}
