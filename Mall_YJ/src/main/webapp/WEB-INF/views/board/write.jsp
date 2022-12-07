<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
</head>
<body>
<form>

	<label>제목 </label> 	
	<input type="text">  <br/> 
	<label>작성자	</label> 
	<input type="text"> <br/>
	<label>내용 </label>
	<textarea cols="40" rows="10" placeholder="내용을 입력하세요"></textarea> <br/>
	<label>작성일</label>
	 <input type="text"> <br/>
	 
	 <input type ="button" value="작성">
	 <input type ="reset" value="취소">

</form>
</body>
</html>