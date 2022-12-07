package com.mall.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BoardController {

	  private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	  
	  @RequestMapping(value = "write", method = RequestMethod.GET)
	  public void writeGET() throws Exception{
		  
		  logger.info("게시글작성 페이지 이동");
	  }
}
