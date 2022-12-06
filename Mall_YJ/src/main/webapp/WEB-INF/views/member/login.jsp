<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="stylesheet" href="/resources/css/member/login.css">
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>
<body>
	<form id ="login_form" method="post">
	<div>ID
		<input class="id_input" name="id"> 
	</div>
	
	<div>PW
		<input class="pw_input" name="pw" type="password"> 
	</div>

        <c:if test = "${result == 0 }">
            <div class = "login_warn">사용자 ID 또는 비밀번호를 잘못 입력하셨습니다.</div>
        </c:if>

	<div>
		<input type="button" class="login_button" value="로그인"> 
	</div>
	</form>

</body>

 
<script>
 
    /* 로그인 버튼 클릭 메서드 */
    $(".login_button").click(function(){
        
//        alert("로그인 버튼 작동");
        
        /* 로그인 메서드 서버 요청 */
        $("#login_form").attr("action", "/member/login.do");
        $("#login_form").submit();
    });
 
</script>
</html>