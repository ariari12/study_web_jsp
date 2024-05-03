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
	String deptno = request.getParameter("deptno");
%>
<div class="container">
	<form action="modifyOk.jsp" method="get">
		<table class="table">
			<tr>
				<th>부서번호</th>
				<td>
					<%=deptno %>
					<input type="hidden" name="deptno" value="<%=deptno %>" />
				</td>
			</tr>
			<tr>
				<th>부서이름</th>
				<td><input type="text" name="dname" id="" /></td>
			</tr>
			<tr>
				<th>부서위치</th>
				<td><input type="text" name="loc" id="" /></td>
			</tr>
		</table>
		<input type="submit" value="완료" />	
	</form>
	</div>

</body>
</html>