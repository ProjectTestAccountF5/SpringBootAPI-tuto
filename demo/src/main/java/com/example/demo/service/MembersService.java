package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Member;

public interface MembersService {
	List<Member> getAllMembers(); // 모든 데이터를 SELECTT  할 것이므로 리턴 타입을 List<Member>로 바꾼다
	
	Member getMember(Integer id);
	
	void insertMember(Member member);
	
	Member updateMember(Integer id, Member member);
	
	Integer deleteMember(Integer id);
}
