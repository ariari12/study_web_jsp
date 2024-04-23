<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 다른 파일을 불러오기 -->
	<!-- 1. include 지시자를 사용 -->
	<!-- copy&paste 효과 -->
	<%-- <%@ include file="a.jsp" %> --%>
	
	<!-- 2. jsp action tag -->
	<!-- 컴파일된 결과를 삽입 -->
	<jsp:include page="a.jsp"></jsp:include>
		
	<%
		// a변수를 출력
		/* out.println("b.jsp 에서 a의 값 : "+ a); */
	%>
</body>
</html>