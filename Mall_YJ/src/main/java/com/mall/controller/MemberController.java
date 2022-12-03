package com.mall.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mall.model.MemberVO;
import com.mall.service.MemberService;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private MemberService memberservice;
	// @Autowired를 통해서 MemberService.java가 MemberController.java에 자동 주입

	// 회원가입 페이지 이동
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public void joinGET() {

		logger.info("회원가입 페이지 진입");

	}

	// 회원가입
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String joinPOST(MemberVO member) throws Exception {

		logger.info("join 진입");

		// 회원가입 서비스 실행
		memberservice.memberJoin(member);

		logger.info("join Service 성공");

		return "redirect:/main";

	}

	// 로그인 페이지 이동
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void loginGET() {

		logger.info("로그인 페이지 진입");

	}
	
	// 아이디 중복 검사
		@RequestMapping(value = "/memberIdChk", method = RequestMethod.POST)
		@ResponseBody	// 해당코드를 추가하지 않으면 join.jsp메서드의 결과가 반환되지 않음
		public String memberIdChkPOST(String memberId) throws Exception{
			
			logger.info("memberIdChk() 진입");
			
			int result = memberservice.idCheck(memberId);
			
			logger.info("결과값 = " + result);
			
			if(result != 0) {
				
				return "fail";	// 중복 아이디가 존재
				
			} else {
				
				return "success";	// 중복 아이디 x
				
			}	
			/*
			  memberservice.idCheck(memberId)의 결과를 int형 변수 result에 저장 후 (존재한다면 '1', 존재하지 않는다면 '0'을 반환)
			  result의 결과가 0이 아니면 "fail"을 반환하고, result의 결과가 1이 아니면 "success"을 반환한다.
			 */
			
		} // memberIdChkPOST() 종료	

		//로그인
		@RequestMapping(value = "login", method = RequestMethod.POST)
		public String loginPOST(HttpServletRequest request, MemberVO member, RedirectAttributes rttr) throws Exception{
			
			System.out.println("login 메서드 진입");
			System.out.println("전달된 데이터 : " + member);
			return null;
		}
	
}
