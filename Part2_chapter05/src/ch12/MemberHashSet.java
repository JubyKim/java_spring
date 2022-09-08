package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	public MemberHashSet(int size) {
		hashSet = new HashSet<>(size);
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
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
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println("해당 회원이 존재하지 않습니다.");
		return false ;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

		
}
