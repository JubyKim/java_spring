package ch13;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<>();
	}

	public void addMember(Member member) {
		treeSet.add(member);
	}
	public boolean removeMember(int memberId) {
		/*
		 
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			
			if (tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println("해당 회원이 존재하지 않습니다.");
		return false ;
		*/
		
		//iterator 사용
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println("해당 회원이 존재하지 않습니다.");
		return false ;
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}

		
}
