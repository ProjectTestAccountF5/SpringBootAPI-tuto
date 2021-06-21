package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Member;

public interface MembersService {
	List<Member> testMember(); // 모든 데이터를 SELECTT  할 것이므로 리턴 타입을 Lisvt<Member>로 바꾼다
}
