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
	// .jsp ==> _jsp.java (_jspService(HttpeServletRequest request, HttpServletResponse response)) ==> _.jsp
	
	//한글 처리
	request.setCharacterEncoding("UTF-8");
	//GET, POST 방식?
	String method = request.getMethod();
	String queryString = request.getQueryString();
	String ip = request.getRemoteAddr();
	out.println("<h2> method : "+ method +"</h2>");
	out.println("<h2> queryString : "+ queryString +"</h2>");
	out.println("<h2> ip : "+ ip +"</h2>");
%>

</body>
</html>