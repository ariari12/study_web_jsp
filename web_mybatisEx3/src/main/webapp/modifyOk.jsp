<%@page import="kr.co.jhta.web.vo.DeptVO"%>
<%@page import="kr.co.jhta.web.dao.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String deptno = request.getParameter("deptno");
	String dname = request.getParameter("dname");
	String loc = request.getParameter("loc");
	
	if(dname!=null&& loc!=null && deptno != null){
		DeptDAO dao = new DeptDAO();
		DeptVO vo = new DeptVO();
		vo.setDeptno(Integer.parseInt(deptno));
		vo.setDname(dname);
		vo.setLoc(loc);
		dao.modifyOne(vo);		
	}
	response.sendRedirect("list.jsp");
%>