<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// upload 디렉토리의 실제 경로 얻어오기
		
		String saveDir = application.getRealPath("/upload");
	
		out.println(saveDir);
		/* String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String contents = request.getParameter("contents");
		String filename = request.getParameter("filename"); */
		
	%>
	<%-- <h3><%=title%></h3>
	<h3><%=writer%></h3>
	<h3><%=contents%></h3>
	<h3><%=filename%></h3> --%>
		
		
		
		


</body>
</html>