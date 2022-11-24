package com.mall.service;

import org.springframework.stereotype.Service;

import com.mall.model.MemberVO;


public interface MemberService {

	//회원가입
	public void regist(MemberVO memberVO) throws Exception;
	
}
