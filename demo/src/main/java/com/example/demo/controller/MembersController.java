package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Member;
import com.example.demo.service.MembersService;

@RestController
public class MembersController {

	@Autowired
	private MembersService service; //Autowired 어노테이션을 붙이고 Service를 선언한다.
	
	@GetMapping(path = "/test")
	public List<Member> memberTest() { //모든 데이터를 SELECT 할 것이므로 리턴 타입을 List<Member>로 바꾼다
		
		return service.testMember(); //Service 에 작성한 메소드를 호출하여 반환한다.
	}
}
