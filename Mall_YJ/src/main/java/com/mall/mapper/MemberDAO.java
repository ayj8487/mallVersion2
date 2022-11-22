package com.mall.mapper;

import com.mall.model.MemberVO;

public interface MemberDAO {

	// 회원가입 
	public void regist(MemberVO memberVO) throws Exception;

}
