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
	int status = response.getStatus();
	out.println("<h3> 상태 : " + status + "</h3>");
	
	// 200 : 정상
	// 404 : NOT FOUND
	// 405 : doGet,doPost
	// 500 : server side logic error
	
%>
	<h2>다른 페이지로 이동</h2>
	<!-- menu.jsp -->
	<ol>
		<li>forward</li>
		<%
			/* RequestDispatcher rd = request.getRequestDispatcher("menu.jsp");
			rd.forward(request, response); */
		%>
		<li>redirect</li>
		<%
			response.sendRedirect("menu.jsp");
		%>
	</ol>

</body>
</html>