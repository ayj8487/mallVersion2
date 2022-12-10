<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>

<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>

<body>

<form id="board_form" method="post">

	<label>제목</label> 	
	<input type="text" name="board_title"> 
	
	<input type="hidden" value="${member.id}" name="user_id"> <br/>
	
	<label>---내용--- </label> <br/>
	<textarea cols="30" rows="15" placeholder="내용을 입력하세요" name="board_content"></textarea> <br/>
	
	 
	 <input type ="button" value="작성" class="regi_button">
	 <input type ="reset" value="취소">

</form>


<script>

$(document).ready(function(){
	//작성 버튼
	$(".regi_button").click(function(){
		$("#board_form").attr("action", "/board/boardRegi");
		$("#board_form").submit();
	});
});

</script>

</body>
</html>