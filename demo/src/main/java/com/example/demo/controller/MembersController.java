package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Member;
import com.example.demo.service.MembersService;

@RestController
public class MembersController {

	@Autowired
	private MembersService service; //Autowired 어노테이션을 붙이고 Service를 선언한다.
	
	@GetMapping(path = "/members")
	public List<Member> getAllMembers() { //모든 데이터를 SELECT 할 것이므로 리턴 타입을 List<Member>로 바꾼다
		
		return service.getAllMembers(); //Service 에 작성한 메소드를 호출하여 반환한다.
	}
	
	@GetMapping(path = "/members/{id}")
	public Member getMember(@PathVariable Integer id) {
		return service.getMember(id);
	}
	
	@PostMapping(path = "/members")
	public Member insertMember(@RequestBody Member member) {
		service.insertMember(member);
		return member;
	}
	
	@PutMapping(path = "/members/{id}")
	private Member updateMember(@PathVariable Integer id, @RequestBody Member member) {
		return service.updateMember(id, member);
	}
	
	@DeleteMapping(path = "/members/{id}")
	public Integer deleteMember(@PathVariable Integer id) {
		return service.deleteMember(id);
	}
}
