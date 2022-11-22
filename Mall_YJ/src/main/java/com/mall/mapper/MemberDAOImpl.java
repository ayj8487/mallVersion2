package com.mall.mapper;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mall.model.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	private static final String namespace = "";
	
	private final SqlSession sqlSession;
	
	@Inject
	public MemberDAOImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	// 회원가입
	@Override
	public void regist(MemberVO memberVO) throws Exception {
		sqlSession.insert(namespace + ".regist", memberVO);
		
	}

	
}
