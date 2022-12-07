package com.mall.model;

public class BoardVO {

	// 게시글 번호
	private int board_num;
	// 게시글 제목
	private String board_title;
	// 게시글 작성자
	private String user_id;
	// 게시글 내용
	private String board_content;

	
	public int getBoard_num() {
		return board_num;
	}
	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	
}
