package com.mall.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller // 현 클래스가 컨트롤러 역할을 한다고 스프링에 선언함
public class BookController {

	private static final Logger logger = 
			LoggerFactory.getLogger(BookController.class);
								// (해당 변수를 사용할 controller명.class) 

	// 메인페이지 이동
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public void mainPageGet() {
		
		logger.info("메인페이지 진입");
	}
}
