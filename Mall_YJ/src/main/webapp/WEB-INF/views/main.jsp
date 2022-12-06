<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/main.css">
</head>
<body>
<!-- 	
	<div >
		<a href="/member/login">로그인</a>
		<a href="/member/join">회원가입</a>
	</div>
 -->	
	<!-- 로그인 하지 않은 상태 -->
    <c:if test = "${member == null }">
        <div class="login_button"><a href="/member/login">로그인</a></div>
        <span><a href="/member/join">회원가입</a></span>                
    </c:if>    
 
     <!-- 로그인한 상태 -->
     <c:if test="${ member != null }">
         <div class="login_success_area">
             <span>${member.name} 님</span>
             <span>로그아웃</span>
         </div>
     </c:if>
</body>
</html>