
<%@page import="org.json.simple.JSONObject"%>
<%@page import="vo.EmpVO"%>
<%@page import="dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String empno=request.getParameter("empno");	
	EmpDAO dao= new EmpDAO();
	
	EmpVO vo=dao.findByEmpno(Integer.parseInt(empno));	
	JSONObject json = new JSONObject();
	json.put("empno",vo.getEmpno());
	json.put("ename",vo.getEname());
	json.put("job",vo.getJob());	
	out.println(json);
	
	
%>