<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- JSP 사용해서 h1태그 구구단 3단 출력 -->
	<%
	for(int i=1; i<=9; i++){
		// 표현식 Expression
	%>
		<!-- HTML 주석 id : aaa -->
		<%-- JSP 주석 pw : bbb--%>		
		<h3>3 X <%=i %> = <%=i*3 %></h3>
	<%
	}
	%>
</body>
</html>