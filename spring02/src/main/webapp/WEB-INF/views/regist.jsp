<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>글쓰기</title>
</head>

<body>
	<form method = "post"> <!--action = "regist" 안 써줘도, 현 url 주소 따라 자동으로 되나봄-->
		<div>
			<label>제목</label>
			<input type="text" name ="title">
		</div>
		
		<div>
			<label>내용</label>
			<p>
			<textarea rows="15" cols="65" name = "content"></textarea>		
		</div>
		
		<div>
			<label>작성자</label>
			<input type="text" name="writer" size="15">		
		</div>

		<button type = "submit">등록</button>
	</form>
</body>
</html>