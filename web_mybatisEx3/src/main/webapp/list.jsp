<%@page import="kr.co.jhta.web.vo.DeptVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.jhta.web.dao.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
<div class="container">
	<table class="table table-hover">
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>부서위치</th>
			<th><a class="btn btn-primary" href="form.jsp" >입력</a></th>
		</tr>
		<%
			DeptDAO dao = new DeptDAO();
			List<DeptVO> list=dao.selectAll();
			for(DeptVO vo : list){
		%>		
			<tr>
				<td><%=vo.getDeptno() %></td>
				<td><%=vo.getDname() %></td>
				<td><%=vo.getLoc() %></td>
				<td>
					<a class="btn btn-warning" href="modifyForm.jsp?deptno=<%=vo.getDeptno() %>" >수정</a>
					<a class="btn btn-danger" href="deleteOk.jsp?deptno=<%=vo.getDeptno() %>" >삭제</a>
				</td>
				
			</tr>
		<%				
			}
		%>
	</table>
</div>


</body>
</html>