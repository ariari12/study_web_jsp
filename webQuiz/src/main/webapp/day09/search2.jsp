<%@page import="vo.EmpVO"%>
<%@page import="dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String empno=request.getParameter("empno");
	
	EmpDAO dao = new EmpDAO();
	EmpVO vo=dao.findByEmpno(Integer.parseInt(empno));
	
	if(vo==null){
		out.println("사원번호를 다시입력해주세요");
	}else{
		out.println("<h6> 사원번호 : "+vo.getEmpno()+"</h6>");
		out.println("<h6> 사원명 : "+vo.getEname()+"</h6>");
	}
	
%>