
<%@page import="vo.MemberVO"%>
<%@page import="dao.MemberDAO"%>
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
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String sex = request.getParameter("sex");
	String zipcode = request.getParameter("zipcode");
	
	MemberDAO dao = new MemberDAO();
 	/* MemberVO mvo = new MemberVO(id,pw,name,sex," "); 
 	System.out.println(mvo);
	
	dao.insertOne(mvo); */
	
%>

</body>
</html>