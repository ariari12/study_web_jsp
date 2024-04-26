<%@page import="vo.DeptVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		width:80%;
		margin: 0 auto;
		border-collapse: collapse;
		text-align: center;
	}
	table, th,td{
		
		border: 1px solid red;
	}
	.deptno{
		width: 10%;
	}
	.dname{
		width: 45%;
	}
	.loc{
		width: 45%;
	}
</style>
</head>
<body>
	<%
		/* 부서 전체 정보를 가져오기 */
		DeptDAO dao = new DeptDAO();
		ArrayList<DeptVO> deptList = dao.selectAll();
		
	%>
	<table>
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>부서지역</th>
		</tr>
	<%
		for(DeptVO dvo : deptList){
	%>
			<tr>
				<td class="deptno"><%=dvo.getDeptno() %></td>
				<td class="dname"><%=dvo.getDname() %></td>
				<td class="loc"><%=dvo.getLoc() %></td>
			</tr>
	<%	
		}
	%>	
		
	</table>

</body>
</html>