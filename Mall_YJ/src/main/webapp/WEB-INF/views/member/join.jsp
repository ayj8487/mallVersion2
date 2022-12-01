<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signup</title>

<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>

</head>
<body>

<!-- 
 속성 name의 값은 해당 input태그에 들어가야할 정보에 해당하는 
 MemberVO에서 정의한 변수 이름을 삽입
 -->

<form id="join_form" method="post">

	<div class="id">id
		<input class="id" name= "id">
	</div>
	
	<div class="pw">pw
		<input class="pw" type= "password" name="pw">
	</div>

	<div class="name">name
		<input class="name" name="name">
	</div>

	<div class="email">email
		<input class="email" name="email">
	</div>
	
	<div class="phone">phone
		<input class="phone" name="phone">
	</div>
	
	<div class="">
		<input type="button"  class="join_button" value="가입">
	</div>
	

</form>

<script>

$(document).ready(function(){
	//회원가입 버튼(회원가입 기능 작동)
	$(".join_button").click(function(){
		$("#join_form").attr("action", "/member/join");
		$("#join_form").submit();
	});
});

</script>

</body>
</html>