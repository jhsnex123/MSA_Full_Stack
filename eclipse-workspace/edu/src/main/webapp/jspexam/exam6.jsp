<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 학습</title> <!--html 주석에 jsp 태그를 넣으면 서버에선 응답해서 기능구현 가능 못하게 할려면 jsp 전용주석 써야함!  -->
</head>
<body>
<!--  HTML 주석 태그입니다. <%= java.time.LocalTime.now() %> -->  
<h2>JSP의 멤버 변수와 지역 변수</h2>
<hr>
<%! int member_v = 0; // 멤버변수 선언%> <%-- 선언문태그 --%>
<% int local_v = 0;  /* 지역변수 선언 */%> <%-- 수행문태그 --%>
<%
	member_v++;
    local_v++;
%>
<h3>member_v : <%= member_v %></h3> 
<h3>local_v : <%= local_v %></h3>
<%-- <h3>이부분은 출력되지 않아요 : <%= local_v+member_v %></h3> --%>
</body>
</html>








