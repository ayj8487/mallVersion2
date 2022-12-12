package com.mall.service;

import java.util.List;

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
	
	// 게시물 작성
	@Override
	public void boardRegi(BoardVO boardVO) {
		
		log.info("게시글 등록서비스");
		
		boardMapper.boardRegi(boardVO);
	}
	
	// 게시물 리스트
	@Override
	public List<BoardVO> list() throws Exception {
		
		return boardMapper.list();
	}

}
