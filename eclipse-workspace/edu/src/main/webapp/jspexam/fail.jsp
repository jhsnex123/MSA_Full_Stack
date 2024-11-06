<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h3{
color:red;
}
</style>
</head>
<body>
<% 
String number = request.getParameter("num"); 
java.time.LocalTime lt = java.time.LocalTime.now();
%>
<h3><%= lt.getHour()+ "시 " +lt.getMinute() +"분 " %>에 당첨 실패!! 아쉽아쉽...</h3>
<img src="/edu/images/rain.png"><br>
<a href ="/edu/clientexam/lottoForm.html">로또응모링크</a>
</body>
</html>