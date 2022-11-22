package com.mall.model;

import lombok.Data;

@Data
public class MemberVO {

// Lombok의 @Date 어노테이션을 사용할시 Getter,Setter 자동생성
// 사용하지 않을시 Alt + Shift + s + r 단축키 입력후 Getter,Setter 직접생성
	
	private String id;
	private String pw;
	private String name;
	private	String email;
	private String phone;
	private String date;
	
}
