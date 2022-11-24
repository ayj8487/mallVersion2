package com.mall.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.model.MemberVO;
import com.mall.service.MemberService;

@Controller
@RequestMapping(value = "/member")
// MemberController 사용을 명확히 구분하기 위해 회원과 관련된 호출은 url 경로에 member를 타도록 설계
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private MemberService memberService;
	// 오토와이드를 통해 MemberService가 MemberController에 자동주입되도록 추가
	
	//회원가입 페이지 이동
		@RequestMapping(value = "/join", method = RequestMethod.GET)
		public void loginGET() {
			
			logger.info("회원가입 페이지 진입");
			
		}
		
		//회원가입
		@RequestMapping(value = "/join", method = RequestMethod.POST)
		public String joinPOST(MemberVO memberVO) throws Exception{
			
			logger.info("join 진입");
				
			//회원가입 서비스 실행
			memberService.regist(memberVO);
			
			logger.info("회원가입 성공");
			
			return "redirect:/main";
		}
		
		//로그인 페이지 이동
		@RequestMapping(value = "login", method = RequestMethod.GET)
		public void joinGET() {
			
			logger.info("로그인 페이지 진입");
			
		}
}

