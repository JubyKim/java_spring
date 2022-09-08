package ch07;

import java.util.Arrays;

public class TravelCustomerTest {
	
	/*
	 *여행사에 패키지 여행 상품이 있습니다. 여행 비용은 15세 이상은 100만원, 그 미만은 50만원 입니다. 
	고객 세 명이 패키지 여행을 떠난다고 했을 때 비용 계산과 고객 명단 검색등에 대한 연산을 스트림을 활용하여 구현해 봅니다.
	고객에 대한 클래스를 만들고 ArrayList로 고객을 관리 합니다. 
	
	고객 정보는 다음과 같습니다.
	
	CustomerLee 
	이름 : 이순신
	나이 : 40
	비용 : 100
	
	CustomerKim
	이름 : 김유신
	나이 : 20 
	비용 : 100
	
	CustomerHong
	이름 : 홍길동
	나이 :13
	비용 : 50	

	 */
	
	/*
	 * 스트림을 활용한 연산 수행
	 
	1. 고객의 명단을 출력합니다.
	2. 여행의 총 비용을 계산합니다.
	3. 고객 중 20세 이상인 사람의 이름을 정렬하여 출력합니다.
	 */
	public static void main(String[] args) {
		Customer CustomerLee = new Customer("이순신", 40);
		Customer CustomerKim = new Customer("김유신", 20);
		Customer CustomerHong = new Customer("홍길동", 13);
		
		Customer[] Customers = {CustomerLee, CustomerKim, CustomerHong};
		
		//1. 고객의 명단을 출력합니다.
		Arrays.stream(Customers).forEach(c -> System.out.println(c.getName()));
		
		//2. 여행의 총 비용을 계산합니다.
		int total = Arrays.stream(Customers).mapToInt(c->c.getCost()).sum();
		System.out.println("여행의 총 비용은 " + total  + "원입니다.");
		
		//3. 고객 중 20세 이상인 사람의 이름을 정렬하여 출력합니다.
		System.out.println("20세 이상인 사람들의 이름을 정렬하여 출력해보자면 " );
		Arrays.stream(Customers).filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		System.out.println("입니다." );
	}

}
