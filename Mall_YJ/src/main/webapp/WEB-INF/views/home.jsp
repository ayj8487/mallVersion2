<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Home
	</h1>

<P>  The time on the server is ${serverTime}. </P>

<h2><a href="/member/login">로그인</a></h2>
		<a href="/member/join">회원가입</a>

</body>
</html>
