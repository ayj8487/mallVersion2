package com.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.mapper.BoardMapper;
import com.mall.model.BoardVO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public void boardRegi(BoardVO boardVO) {
		
		log.info("게시글 등록서비스");
		
		boardMapper.boardRegi(boardVO);
	}

}
