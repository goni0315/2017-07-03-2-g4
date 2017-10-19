package com.food.webapp.dao;


import com.food.webapp.entity.Member;

public interface MemberDao {

	int insert(String id, String pwd, String name, String gender, String phone, String email);

	int insert(Member member);

	Member get(String id);	

}
