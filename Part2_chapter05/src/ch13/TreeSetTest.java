package ch13;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// 들어간 순서대로 나오는 것은 아님.
		// 중복된 값은 나오지 않음.
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
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
		
		/*
		TreeSet<String> set = new TreeSet<String>(); //String은 comprable이라서. 정렬이 가능.
		set.add("홍길동");
		set.add("강감찬");
		set.add("김유신");
		set.add("이순신");
		
		System.out.println(set);
		*/
	}

}
