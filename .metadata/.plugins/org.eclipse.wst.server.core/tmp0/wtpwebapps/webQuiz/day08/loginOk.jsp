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
	MemberDAO dao = new MemberDAO();
	MemberVO mvo = new MemberVO();
	mvo=dao.searchUser(id, pw);
	
	
	if(mvo!=null){
		out.println("<h1> "+mvo.getName()+" 님 환영합니다. </h1>");
		session.setAttribute("id", id);
		session.setAttribute("pw", pw);
		out.println("로그인 성공");
		if(mvo.getId().equals("admin")){
			response.sendRedirect("layout.jsp");
		}
	}else{
		System.out.println("로그인 실패");
		response.sendRedirect("login.jsp");
	}
	
%>
</body>
</html>