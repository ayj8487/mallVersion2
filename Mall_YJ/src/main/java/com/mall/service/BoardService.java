package com.mall.service;

import java.util.List;

import com.mall.model.BoardVO;

public interface BoardService {

	//게시글 등록
	public void boardRegi(BoardVO boardVO);

	// 게시글 목록
	public List<BoardVO> list() throws Exception; 

}
