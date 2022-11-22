package com.mall.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mall.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTest {

	@Autowired
	private MemberDAO memberDAO; //memberDAO.java 인터페이스 의존성 주입
	
	//회원가입 쿼리 테스트 메서드
	@Test
	public void memberJoin() throws Exception{
		MemberVO memberVO = new MemberVO();
		
		memberVO.setId("bbbb"); 
		memberVO.setPw("2222");
		memberVO.setName("tototo");
		memberVO.setEmail("toto@toto.com");
		memberVO.setPhone("222-2222-22222");
		
		memberDAO.regist(memberVO);
	}
}
