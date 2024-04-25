<%@page import="java.io.File"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>

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
		//upload 디렉토리의 실제 경로 얻어오기
		
		String saveDir = application.getRealPath("/upload");
	
		out.println(saveDir);
		
		int maxFileSize = 1024*1024*30;
		// cos.jar : MultipartRequest
		
		MultipartRequest mr = new MultipartRequest(request, saveDir,
				maxFileSize,"UTF-8",new DefaultFileRenamePolicy());
		
		
		Enumeration params =mr.getParameterNames();
		
		while(params.hasMoreElements()){
			String name = (String) params.nextElement();
			System.out.println("name : "+name);
			
			String value = mr.getParameter(name);
			out.println("<h2>"+name + " : "+value+"</h2>");
		}
		out.println("<hr>");
		String filename = mr.getFilesystemName("filename");
		String original = mr.getOriginalFileName("filename");
		File file = mr.getFile("filename");
		String type = mr.getContentType("filename");
		
		out.println("<h2> 저장 파일명 : "+ filename +"</h2>");
		out.println("<h2> 실제 파일명 : "+ original +"</h2>");
		out.println("<h2> 컨텐츠 타입 : "+ type +"</h2>");
		
	%>

</body>
</html>