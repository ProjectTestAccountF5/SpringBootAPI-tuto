package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MembersDAO;
import com.example.demo.dto.Member;

@Service
public class MembersServiceImpl implements MembersService{

	@Autowired
	private MembersDAO dao; // @Autowired 어노테이션과 함께 dao를 여기에 선언해 준다.
	
	@Override
	public List<Member> testMember() {
		/*
		Member testMember = new Member();
		testMember.setId(1);
		testMember.setName("testName");
		testMember.setAge(15);
		testMember.setDept("서비스로 이동 함!");	//로직 이동 후 정상임이 확인 되도록 값을 조금 달리 한다.
		return testMember;
		*/ 	//Member를 손수 작성했던 부분은 삭제한다.
		return dao.testMember();
	}

}
