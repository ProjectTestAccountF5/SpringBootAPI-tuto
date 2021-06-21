package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.Member;

@Repository
public interface MembersDAO {
	List<Member> testMember();
}
