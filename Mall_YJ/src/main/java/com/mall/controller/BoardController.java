package com.mall.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mall.model.BoardVO;
import com.mall.service.BoardService;

import lombok.val;
import lombok.extern.java.Log;

@Controller
@RequestMapping("/board")
public class BoardController {

	  private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	  
	  @Autowired
	  private BoardService boardService;
	  
	  @RequestMapping(value = "write", method = RequestMethod.GET)
	  public void writeGET() throws Exception{
		  
		  logger.info("게시글작성 페이지 이동");
	  }
	  //게시글 작성
	  @RequestMapping(value="/boardRegi", method = RequestMethod.POST)
	  public String boardRegiPOST (BoardVO boardVO) throws Exception{
		  
		  boardService.boardRegi(boardVO);
		  
		  logger.info("게시글 작성");
		  
		  return "redirect:/main";
}
}
