package com.mall.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor{

	// 세션이 완전히 제거되지 않아 새로운 세션을 저장 할 때 발생할수있는 에러를 방지하기위해
	// 로그인 메서드가 있는 MemberController 진입 하기 전 세션을 제거하는 작업

	// LoginInterceptor 활성시 프로젝트를 처음 run 했을때 controller에 진입하기전에 세션을 제거하기때문에 오류 발생
	
//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//		// controller에 진입 하기 전에 작업 메서드
//		
//		   System.out.println("LoginInterceptor preHandle 작동");
//	        
//	        HttpSession session = request.getSession();
//	        
//	        session.invalidate(); //세션 제거 메서드
//	        
//	        return true;
//	}
}
