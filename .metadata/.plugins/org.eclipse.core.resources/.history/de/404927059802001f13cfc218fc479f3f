<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
		
		// 첨부파일의 최대크기
		// 30MB
		int maxFileSize = 1024*1024*30;
		
		MultipartRequest mr = 
				new MultipartRequest(request, saveDir,
						maxFileSize, "UTF-8",
						new DefaultFileRenamePolicy());
		
		//파라미터 값 가져오기
		String title = mr.getParameter("title");
		String writer = mr.getParameter("writer");
		String contents = mr.getParameter("contents");
		String f = mr.getOriginalFileName("filename");
		
		
		
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