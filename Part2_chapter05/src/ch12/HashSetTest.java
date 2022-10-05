package ch12;
import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// 들어간 순서대로 나오는 것은 아님.
		// 중복된 값은 나오지 않음.
		MemberHashSet memberTreeSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		Member memberHong = new Member(1004, "홍길동");

		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.addMember(memberHong);
		
		memberTreeSet.showAllMember();
		
		memberTreeSet.removeMember(memberHong.getMemberId());
		memberTreeSet.showAllMember();
	}

}
