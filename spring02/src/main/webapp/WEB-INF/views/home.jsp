<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!-- 한글 인코딩 추가 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>


<body>
	<!-- 버튼 추가 -->
	<form action = "listAll" method="get">
		<button type ="submit">CRUD게시판 가기</button>
	</form>
	
	<h1>
		Hello world!  
	</h1>
	
	<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
