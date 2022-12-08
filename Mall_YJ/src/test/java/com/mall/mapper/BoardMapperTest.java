package com.mall.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mall.model.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTest {

	@Autowired
	private BoardMapper mapper;
	
	// 게시글 등록
	@Test
	public void boardTest() throws Exception{
		
		BoardVO boardvo = new BoardVO();

		boardvo.setBoard_title("제목333");
		boardvo.setUser_id("aa123");
		boardvo.setBoard_content("내용333");
		
		mapper.board(boardvo);
	}
}
