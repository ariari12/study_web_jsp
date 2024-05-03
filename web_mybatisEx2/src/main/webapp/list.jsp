<%@page import="java.util.List"%>
<%@page import="kr.co.jhta.web.vo.EmpVO"%>
<%@page import="kr.co.jhta.web.dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<table class="table table-striped">					
			<tr>
				<th>회원번호</th>
				<th>회원이름</th>
				<th>직급</th>
			</tr>
			<%
				EmpDAO dao = new EmpDAO();
				EmpVO vo2 = new EmpVO();
				
				dao.updateOne(vo2);
				List<EmpVO> list =dao.selectAll();
				
				for(EmpVO vo : list){
			%>			
			<tr>
				<td><%=vo.getEmpno() %></td>
				<td><%=vo.getEname() %></td>
				<td><%=vo.getJob() %></td>
			</tr>	
			<%
				}
			%>			
		</table>
	</div>

</body>
</html>