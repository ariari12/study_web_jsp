<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	
</style>
</head>
<body>
<%
	String id=request.getParameter("id");
	String name=request.getParameter("name");
	String birthNum1=request.getParameter("birthNum1");
	String birthNum2=request.getParameter("birthNum2");
	String pw=request.getParameter("pw");
	String tel1=request.getParameter("tel1");
	String tel2=request.getParameter("tel2");
	String tel3=request.getParameter("tel3");
	String addr=request.getParameter("addr");
	String email1=request.getParameter("email1");
	String email2=request.getParameter("email2");	
	String sex=request.getParameter("sex");
	String[] hob=request.getParameterValues("hob");
	if(email2.equals("")){
		email2=request.getParameter("email3");
	}

%>
<h2>ID : <%=id %></h2>
<h2>NAME : <%=name %></h2>
<h2>주민등록번호 : <%=birthNum1+" - "+ birthNum1%></h2>
<h2>비밀번호 : <%=pw %></h2>
<h2>전화번호 : <%=tel1+" - "+tel2+" - "+tel3 %></h2>
<h2>주소 : <%=addr %></h2>
<h2>EMAIL : <%=email1+"@"+email2 %></h2>
<h2>성별 : <%=sex %></h2>
<h2>취미 :
<%
	for(String s : hob){		
		out.println(s);
	}
%>
</h2>




</body>
</html>