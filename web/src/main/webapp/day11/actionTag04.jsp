<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>actionTage04.jsp</h3>
	
	<jsp:forward page="actionTag05.jsp">
		<jsp:param value="500" name="n1"/>
	</jsp:forward>

</body>
</html>