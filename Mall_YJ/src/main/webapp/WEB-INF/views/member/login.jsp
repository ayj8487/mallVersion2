<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
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
		<input class="pw_input" name="pw"> 
	</div>
	
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
        $("#login_form").attr("action", "/member/login");
        $("#login_form").submit();
    });
 
</script>
</html>