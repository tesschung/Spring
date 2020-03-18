package com.bs.lec18.member.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.bs.lec18.member.MemPhone;
import com.bs.lec18.member.Member;

//@Component
@Repository
public class MemberDao implements IMemberDao {

	private HashMap<String, Member> dbMap;
	
	public MemberDao() {
		dbMap = new HashMap<String, Member>();
	}
	
	@Override
	public void memberInsert(String memId, String memPw, String memMail, String memPhone1, String memPhone2, String memPhone3) {
		System.out.println("memberInsert()");
		System.out.println("memId : " + memId);
		System.out.println("memPw : " + memPw);
		System.out.println("memMail : " + memMail);
		System.out.println("memPhone : " + memPhone1 + " - " + memPhone2 + " - " + memPhone3);
		
		Member member = new Member();
		member.setMemId(memId);
		member.setMemPw(memPw);
		member.setMemMail(memMail);
		/*
		member.setMemPhone1(memPhone1);
		member.setMemPhone2(memPhone2);
		member.setMemPhone3(memPhone3);
		*/
		MemPhone memPhone = new MemPhone();
		memPhone.setMemPhone1(memPhone1);
		memPhone.setMemPhone2(memPhone2);
		memPhone.setMemPhone3(memPhone3);
		member.setMemPhone(memPhone);
		
		dbMap.put(memId, member);
		
		Set<String> keys = dbMap.keySet();
		Iterator<String> iterator = keys.iterator();
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			Member mem = dbMap.get(key);
			System.out.print("memberId:" + mem.getMemId() + "\t");
			System.out.print("|memberPw:" + mem.getMemPw() + "\t");
			System.out.print("|memberMail:" + mem.getMemMail() + "\t");
			/*
			System.out.print("|memberPhone:" + mem.getMemPhone1() + " - " + 
											   mem.getMemPhone2() + " - " + 
											   mem.getMemPhone3() + "\n");
			*/
			System.out.print("|memberPhone:" + mem.getMemPhone().getMemPhone1() + " - " + 
					   mem.getMemPhone().getMemPhone2() + " - " + 
					   mem.getMemPhone().getMemPhone3() + "\n");
		}
		
	}
	
	@Override
	public void memberInsert(Member member) {
		System.out.println("memberInsert()");
		System.out.println("memId : " + member.getMemId());
		System.out.println("memPw : " + member.getMemPw());
		System.out.println("memMail : " + member.getMemMail());
//		System.out.println("memPhone : " + member.getMemPhone1() + " - " + member.getMemPhone2() + " - " + member.getMemPhone3());
		System.out.println("memPhone : " + member.getMemPhone().getMemPhone1() + " - " + member.getMemPhone().getMemPhone2() + " - " + member.getMemPhone().getMemPhone3());
		
		dbMap.put(member.getMemId(), member);
		
		Set<String> keys = dbMap.keySet();
		Iterator<String> iterator = keys.iterator();
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			Member mem = dbMap.get(key);
			System.out.print("memberId:" + mem.getMemId() + "\t");
			System.out.print("|memberPw:" + mem.getMemPw() + "\t");
			System.out.print("|memberMail:" + mem.getMemMail() + "\t");
			/*
			System.out.print("|memberPhone:" + mem.getMemPhone1() + " - " + 
											   mem.getMemPhone2() + " - " + 
											   mem.getMemPhone3() + "\n");
			*/
			System.out.print("|memberPhone:" + mem.getMemPhone().getMemPhone1() + " - " + 
					   mem.getMemPhone().getMemPhone2() + " - " + 
					   mem.getMemPhone().getMemPhone3() + "\n");
		}
		
	}

	@Override
	public Member memberSelect(String memId, String memPw) {
		Member member = dbMap.get(memId);
		
		return member;
	}

	@Override
	public void memberUpdate() {

	}

	@Override
	public void memberDelete() {

	}

}