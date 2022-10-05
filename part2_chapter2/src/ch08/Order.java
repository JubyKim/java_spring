package ch08;

public class Order {

	String orderNum;
	String orderPhoneNum;
	String orderAddr;
	String orderDate;
	String orderTime;
	int orderPrice;
	String menuNum;
	
	
	public Order(String orderNum, String orderPhoneNum,String orderAddr,String orderDate,String orderTime,int orderPrice,String menuNum) {
		this.orderNum = orderNum;
		this.orderPhoneNum = orderPhoneNum;
		this.orderAddr = orderAddr;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNum = menuNum;
		
	}
	public void showOrder() {
		System.out.println("음식점에 배달 주문이 들어왔습니다.");
		System.out.println("");
		System.out.println("주문 접수 번호 : " + orderNum);
		System.out.println("주문 핸드폰 번호 : " + orderPhoneNum);
		System.out.println("주문 집 주소 : " + orderAddr);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + orderPrice);
		System.out.println("메뉴 번호 : " + menuNum);
		
	}
}





//음식점에 배달 주문이 들어왔습니다.
//
//주문 접수 번호 : 202011020003
//주문 핸드폰 번호 : 01023450001
//주문 집 주소 : 서울시 강남구 역삼동 111-333
//주문 날짜 : 20201102
//주문 시간 : 130258
//주문 가격 : 35000
//메뉴 번호 : 0003