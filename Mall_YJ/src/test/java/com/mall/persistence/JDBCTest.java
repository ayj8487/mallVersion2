package com.mall.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTest {

	// orcle 연동 테스트 
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		try {
			Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE",
				"mall",
				"1234");
			{
				System.out.println(con);
				System.out.println("con");
			}
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
}
