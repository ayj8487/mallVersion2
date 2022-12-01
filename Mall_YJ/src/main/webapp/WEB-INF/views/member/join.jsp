<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signup</title>
<link rel="stylesheet" href="/resources/css/member/join.css">
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

<div class="wrapper">
<form id="join_form" method="post">
	<div>
		<span>회원가입</span>
	</div>
	
	<div class="id_wrap">id
		<input class="id_input" name= "id">
	
	<!-- 아이디 중복검사 -->	
	<span class="id_input_re_1">사용 가능한 아이디입니다.</span>
	<span class="id_input_re_2">아이디가 이미 존재합니다.</span>
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
</div>
<script>

$(document).ready(function(){
	//회원가입 버튼(회원가입 기능 작동)
	$(".join_button").click(function(){
		$("#join_form").attr("action", "/member/join");
		$("#join_form").submit();
	});
});

//아이디 중복검사
$('.id_input').on("propertychange change keyup paste input", function(){

//	console.log("keyup 테스트");	

	var memberId = $('.id_input').val();			// .id_input에 입력되는 값
	var data = {memberId : memberId}				// '컨트롤에 넘길 데이터 이름' : '데이터(.id_input에 입력되는 값)'
	
	$.ajax({
		type : "post",
		url : "/member/memberIdChk",
		data : data,
		success : function(result){
//			 console.log("성공 여부" + result);
			if(result != 'fail'){
				$('.id_input_re_1').css("display","inline-block");
				$('.id_input_re_2').css("display", "none");				
			} else {
				$('.id_input_re_2').css("display","inline-block");
				$('.id_input_re_1').css("display", "none");				
			}
		}// success 종료
	}); // ajax 종료

});// function 종료


</script>

</body>
</html>