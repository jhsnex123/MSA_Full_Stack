<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h3{
color:blue;
}
</style>
</head>
<body>
<% 
String number = request.getParameter("num"); 
java.time.LocalTime lt = java.time.LocalTime.now();
%>
<h3><%= lt.getHour()+ "시 " +lt.getMinute() +"분 " %>에 당첨 성공!! 추카추카... </h3>
<img src="/edu/images/trans_duke.png">
</body>
</html>