package com.mall.service;

import com.mall.model.MemberVO;

public interface MemberService {

	//회원 가입
	public void memberJoin(MemberVO member) throws Exception;
}
