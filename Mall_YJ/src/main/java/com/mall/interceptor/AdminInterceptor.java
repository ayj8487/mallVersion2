package com.mall.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import com.mall.model.MemberVO;

public class AdminInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// admin 관리자 페이지는 adck(회원구분) 값이 1인지 확인하는 작업
		// 따라서 member session 정보를 MemberVO 타입의 변수에 담은 후 해당 변수를 통해
		// adck 의 값을 호출 하여 비교하는 로직 작성
		
	    HttpSession session = request.getSession();
	        
        MemberVO lvo = (MemberVO)session.getAttribute("member");
		// Member session 을 호출하여 MemberVO 타입의 lvo 변수에 저장
        
        if(lvo == null || lvo.getAdck() == 0) {    //  lvo가 null이거나 AdCk() 메서드 반환 값이 0이면 (관리자 계정이 아니면)
            
            response.sendRedirect("/main");    // 메인페이지로 리다이렉트
            
            return false;
        }
        return true;    // 관리자 계정 로그인 경우(lvo != null && lvo.getAdCk() == 1)


	}
}