package ch08;

public class ch8 {

	public static void main(String[] args) {

		People tom = new People(180,78,"남성","Tomas", 37); //키가 180 이고 몸무게가 78 킬로인 남성이 있습니다. 이름은 Tomas 이고 나이는 37세입니다.
		
		Order ord1 = new Order("202011020003" , "01023450001", "서울시 강남구 역삼동 111-333", "20201102", "130258", 35000, "0003");
		/*
		 * 주문 접수 번호 : 202011020003
		주문 핸드폰 번호 : 01023450001
		주문 집 주소 : 서울시 강남구 역삼동 111-333
		주문 날짜 : 20201102
		주문 시간 : 130258
		주문 가격 : 35000
		메뉴 번호 : 0003

		 */
			
		System.out.println(tom.showPeopleInfo());
		ord1.showOrder();
	}

}
