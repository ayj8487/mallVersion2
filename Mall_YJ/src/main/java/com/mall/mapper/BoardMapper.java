package com.mall.mapper;

import java.util.List;

import com.mall.model.BoardVO;

public interface BoardMapper {

	// 게시글 등록
		public void boardRegi(BoardVO boardVO);

	// 게시글 목록
		public List<BoardVO> list() throws Exception; 

}



