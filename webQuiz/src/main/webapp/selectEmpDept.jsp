<%@page import="vo.EmpDeptVO"%>
<%@page import="dao.EmpDAO"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>

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
	String empno = request.getParameter("empno");
	String ename = request.getParameter("ename");
	String sal = request.getParameter("sal");
	String deptno = request.getParameter("deptno");
	String dname = request.getParameter("dname");
	String loc = request.getParameter("loc");
	
	EmpDAO dao = new EmpDAO();
	ArrayList<EmpDeptVO> list=dao.selectAll();
	// 값만 꺼내면 됨
%>
	<form action="">				
		<input type="submit" value="전송" />
	</form>
	
	<%
	for(EmpDeptVO evo : list){
	%>
		<h2>사원번호 : <%=evo.getEmpno()%></h2>
		<h2>사원명 : <%=evo.getEname()%></h2>
		<h2>급여 : <%=evo.getSal()%></h2>
		<h2>부서번호 : <%=evo.getDeptno()%></h2>
		<h2>부서명 : <%=evo.getDname()%></h2>
		<h2>부서위치 : <%=evo.getLoc()%></h2>
	<%	
	}
	%>
	
	
	

</body>
</html>