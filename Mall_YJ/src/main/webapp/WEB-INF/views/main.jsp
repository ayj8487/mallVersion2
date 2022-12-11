<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/main.css">
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script> <!-- 비동기식 페이지전환 Jquery 사용 -->
  
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
		<div> 
			<table>
				<tr>
				<td>ss</td><td>sad</td>
				</tr>


			</table>
		</div>
    </c:if>    
 
     <!-- 로그인한 상태 -->
     <c:if test="${ member != null }">
         <div class="login_success_area">
             <span>${member.name} 님</span>
             <span><a id="logout_button">로그아웃</a></span>
             <!-- 
               로그 아웃 버튼 클릭  (비동기식 : 화면이동없이)
              => javascript 버튼 메서드 작동 
              => ajax 통해 로그아웃 요청 
              => 서버 로그아웃 수행 
              => 화면 이동없이 새로고침 통해 화면 변환
              -->
			 <span>
   			   <c:if test="${member.adck == 1 }">
                  <a href="/admin/main">관리자 페이지</a>
  	           </c:if>
			 </span>
			 <span><a href="/board/write">게시글 작성</a></span>
         </div>         
     </c:if>
     
     <script>

     
/* gnb_area 로그아웃 버튼 작동 */
    $("#logout_button").click(function(){
        $.ajax({
            type:"POST",
            url:"/member/logout.do",
            success:function(data){
                alert("로그아웃 되었습니다.");
                document.location.reload();     
            } 
        }); // ajax 
    });
</script>
</body>
</html>