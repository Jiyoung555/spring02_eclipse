<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<!DOCTYPE html> 
<html>
<head>
<title>글읽기</title>
</head>

<body>
	<form>
		<div>
			<label>글번호</label> 
			<input type="text" name ="bno" value ="${boardVO.bno}" readonly="readonly">		
		</div>

		<div>
			<label>제목</label> 
			<input type="text" name ="title" style="background-color:#B0E0E6;" 
				value ="${boardVO.title}" readonly="readonly">		
		</div>
		
		<div>
			<label>내용</label>
			<br>
			<textarea name=content rows ="10" cols="70" style="background-color:#B0E0E6;"
				readonly="readonly">${boardVO.content}</textarea>		
		</div>
		
		<div>
			<label>작성자</label> 
			<input type="text" name="writer" size="15" value = "${boardVO.writer}" 
				readonly="readonly">		
		</div>

		<button type="submit" formaction="modify" formmethod="get">수정</button>
		<button type="submit" formaction="remove" formmethod="post">삭제</button>
		<button type="submit" formaction="listAll" formmethod="get">목록</button>
		<!-- button formaction 뒤에 url 주소  -->
	</form>
</body>
</html>