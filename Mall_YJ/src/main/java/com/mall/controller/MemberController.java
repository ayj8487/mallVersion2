package com.mall.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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

	@Autowired
    private BCryptPasswordEncoder pwEncoder;
	
	/*
	 * BCryptPasswordEncoder
	 * 회원정보가 담긴 member => 
	 * member에 저장된 비밀번호를 꺼냄 => 
	 * encode() 메서드를 통해 꺼낸 비밀번호 인코딩 => 
	 * 인코딩 된 비밀번호를 member 객체에 다시 저장 => 
	 * memberJoin()을 호출하여 회원가입 쿼리 실행
	 */
	
	// 회원가입 페이지 이동
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public void joinGET() {

		logger.info("회원가입 페이지 진입");

	}

	// 회원가입
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String joinPOST(MemberVO member) throws Exception {

	    String rawPw = "";            // 인코딩 전 비밀번호
        String encodePw = "";        // 인코딩 후 비밀번호
        
        rawPw = member.getPw();            // 비밀번호 데이터 얻음
        encodePw = pwEncoder.encode(rawPw);        // 비밀번호 인코딩
        member.setPw(encodePw);            // 인코딩된 비밀번호 member객체에 다시 저장
        
        /* 회원가입 쿼리 실행 */
        memberservice.memberJoin(member);
		
		// 회원가입 서비스 실행
//		memberservice.memberJoin(member);

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

			
		      HttpSession session = request.getSession();
		        String rawPw = "";
		        String encodePw = "";
		    
		        MemberVO lvo = memberservice.memberLogin(member);    // 제출한아이디와 일치하는 아이디 있는지 
		        
		        if(lvo != null) {            // 일치하는 아이디 존재시
		            
		            rawPw = member.getPw();        // 사용자가 제출한 비밀번호
		            encodePw = lvo.getPw();        // 데이터베이스에 저장한 인코딩된 비밀번호
		            
		            if(true == pwEncoder.matches(rawPw, encodePw)) {        // 비밀번호 일치여부 판단
		                
		                lvo.setPw("");                    // 인코딩된 비밀번호 정보 지움
		                session.setAttribute("member", lvo);     // session에 사용자의 정보 저장
		                return "redirect:/main";        // 메인페이지 이동
		                
		                
		            } else {
		 
		                rttr.addFlashAttribute("result", 0);            
		                return "redirect:/member/login";    // 로그인 페이지로 이동
		                
		            }
		            
		        } else {                    // 일치하는 아이디가 존재하지 않을 시 (로그인 실패)
		            
		            rttr.addFlashAttribute("result", 0);            
		            return "redirect:/member/login";    // 로그인 페이지로 이동
		        }
		}
		
		 /* 로그아웃 */
	    @RequestMapping(value="logout.do", method=RequestMethod.GET)
	    public String logoutMainGET(HttpServletRequest request) throws Exception{
	        
	        logger.info("logoutMainGET메서드 진입");
	        
	        HttpSession session = request.getSession();
	        
	        session.invalidate(); //세션 제거 메서드
	        
	        return "redirect:/main"; 
	        
	    }
		
}
