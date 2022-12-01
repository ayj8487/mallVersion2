package com.mall.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mall.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTests {

	@Autowired
	private MemberMapper membermapper;			//MemberMapper.java 인터페이스 의존성 주입
	
	//회원가입 쿼리 테스트 메서드
	@Test
	public void memberJoin() throws Exception{
		MemberVO member = new MemberVO();
		
		member.setId("bbb123");				//회원 id
		member.setPw("2222");				//회원 비밀번호
		member.setName("two");				//회원 이름
		member.setEmail("eee.email.com");	//회원 메일
		member.setPhone("010-2222-2222");	//회원 전화번호
		
		membermapper.memberJoin(member);			//쿼리 메서드 실행
		
	}
	
	
	
}