<%@page import="vo.EmpVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.EmpDAO"%>
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
		/* 부서 전체 정보를 가져오기 */
		EmpDAO dao = new EmpDAO();
		ArrayList<EmpVO> empList = dao.selectAll();
		
	%>
	<table>
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>사원직급</th>
			<th>상사번호</th>
			<th>입사일</th>
			<th>급여</th>
			<th>보너스</th>
			<th>부서번호</th>
		</tr>
	<%
		for(EmpVO dvo : empList){
	%>
			<tr>
				<td ><%=dvo.getEmpno() %></td>
				<td ><%=dvo.getEname() %></td>
				<td ><%=dvo.getJob() %></td>
				<td ><%=dvo.getMgr() %></td>
				<td ><%=dvo.getHiredate() %></td>
				<td ><%=dvo.getSal() %></td>
				<td ><%=dvo.getComm() %></td>
				<td ><%=dvo.getDeptno() %></td>
			</tr>
	<%	
		}
	%>	

</body>
</html>