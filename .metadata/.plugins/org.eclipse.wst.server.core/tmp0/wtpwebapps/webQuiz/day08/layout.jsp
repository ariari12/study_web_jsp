<%@page import="vo.MemberVO"%>
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
	Object obj =session.getAttribute("vo");
	if(obj != null){
		MemberVO vo = (MemberVO) obj;
			if(vo.getId().equals("admin")){
				
	
%>
<a href="./productList.jsp">상품 목록</a>
<a href="./productReg.jsp">상품 등록</a>
<%
			}
			
		}
%>
</body>
</html>