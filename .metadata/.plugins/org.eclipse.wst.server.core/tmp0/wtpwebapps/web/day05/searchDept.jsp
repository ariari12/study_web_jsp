
<%@page import="vo.EmpDeptVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
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
	
	
	// 값만 꺼내면 됨
%>
<form action="">
	<input type="text" name="deptno" id="" />
	<input type="submit" value="검색" />
</form>
<div id="result" class="container">
	<table class="table">
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>회원번호</th>
			<th>회원이름</th>
			<th>회원급여</th>
			<th>부서위치</th>
		</tr>
	<%	
	
	if(deptno==null || deptno.length()==0){
		ArrayList<EmpDeptVO> list = dao.selectAllV2();	
		for(EmpDeptVO evo : list){
		%>
			<tr>
				<td><%=evo.getDeptno() %></td>
				<td><%=evo.getDname() %></td>
				<td><%=evo.getEmpno() %></td>
				<td><%=evo.getEname() %></td>
				<td><%=evo.getSal() %></td>
				<td><%=evo.getLoc() %></td>
			</tr>
		<%
		}
	}else{
		
		int no=Integer.parseInt(deptno);
		ArrayList<EmpDeptVO> list = dao.selectDeptNo(no);	
		//단일 부서번호 값 꺼내기 
		for(EmpDeptVO evo : list){
		%>
			<tr>
				<td><%=evo.getDeptno() %></td>
				<td><%=evo.getDname() %></td>
				<td><%=evo.getEmpno() %></td>
				<td><%=evo.getEname() %></td>
				<td><%=evo.getSal() %></td>
				<td><%=evo.getLoc() %></td>
			</tr>
	<%
		}
	}
	%>
	
</table>

</div>

</body>
</html>