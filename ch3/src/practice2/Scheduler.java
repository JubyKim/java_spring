package practice2;


/*
 * 모든 상담원이 동일한 상담 건수를 처리하도록 상담원 순서대로 배분합니다.


쉬고 있거나 상담원에게 할당된 통화 수가 가장 적은 상담원에게 배분합니다.


고객의 등급에 따라 등급이 높은 고객은 업무능력이 우수한 상담원에게 배분합니다.


세 가지 정책은 필요에 따라 바뀌어 운영될 수 있습니다. 다음 클래스 다이어그램을 참고하여 각 배분
 */
public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
}
