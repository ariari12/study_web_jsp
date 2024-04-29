<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
	<h2>글쓰기</h2>
	<form action="writeOk.jsp">
		<table class="table table=hover">
		<tr>
			<th>작성자</th>
			<td><input type="text" name="writer" id="" /></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input type="text" name="title" id="" /></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea name="contents" id="" cols="30" rows="10"></textarea></td>
		</tr>		
		<tr>
			<td colspan="2">
				<a class="btn btn-primary" href="list.jsp">목록</a>
				<input class="btn btn-success" type="submit" value="작성" />
				<input class="btn btn-danger" type="reset" value="다시쓰기" />
			</td>
		</tr>
	</table>
	</form>
	
</div>
	
</body>
</html>