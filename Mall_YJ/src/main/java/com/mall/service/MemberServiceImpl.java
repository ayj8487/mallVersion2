package com.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.mapper.MemberDAO;
import com.mall.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{


	@Autowired
	MemberDAO memberDAO;
	
	@Override
	public void regist(MemberVO memberVO) throws Exception {
		
		memberDAO.regist(memberVO);
	}
}
