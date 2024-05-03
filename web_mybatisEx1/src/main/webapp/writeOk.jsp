<%@page import="kr.co.jhta.vo.DeptVO"%>
<%@page import="kr.co.jhta.dao.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String deptno = request.getParameter("deptno");
	String dname = request.getParameter("dname");
	String loc = request.getParameter("loc");
	
	if( dname != null && loc != null){
		 DeptDAO dao = new DeptDAO();
		 
		 DeptVO vo = new DeptVO();
		 vo.setDname(dname);
		 vo.setLoc(loc);
		 dao.addOne(vo);
	}
		
	
	
	response.sendRedirect("list.jsp");
%>