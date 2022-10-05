package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
		
		
	}
	
	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);
		
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
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
		Iterator<Member> ir = arrayList.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println("해당 회원이 존재하지 않습니다.");
		return false ;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}

		
}
