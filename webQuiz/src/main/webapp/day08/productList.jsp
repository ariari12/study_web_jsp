
<%@page import="vo.ProductVO"%>
<%@page import="dao.ProductDAO"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>productList.jsp</title>
<style type="text/css">
	* {
		margin: 0;
		padding: 0;
	}
	#container {
		width: 1000px;
		margin: auto;
	}
	img {
		width: 200px;
		height: 200px;
	}
	p {
		text-align: center;
	}
	
	.wrap {
		width: 200px;
		border: 1px solid red;
		float: left;
		padding: 20px;
		margin: 2px;
	}
	.del {
		text-decoration: line-through;
	}
</style>
</head>
<body>
	<div id="container">
		<%
			ProductDAO dao = new ProductDAO();
			ArrayList<ProductVO> list =dao.selectAll();
		%>
		<table>
			<tr>
				<th>번호</th>
				<th>상품 이름</th>
				<th>가격</th>
				<th>할인율</th>
				<th>내용</th>
				<th>수량</th>
				<th>이미지</th>				
			</tr>
			<%
				for(ProductVO vo : list){
			%>
			<tr>
				<td><%=vo.getPno() %></td>
				<td><%=vo.getPname() %></td>
				<td><%=vo.getPrice() %></td>
				<td><%=vo.getDcratio() %></td>
				<td><%=vo.getProdesc() %></td>
				<td><%=vo.getQty() %></td>
				<td><img src="<%=vo.getImgfile() %>" alt="" /></td>
			</tr>
			<%
				}
			%>
			
		</table>
 				

	</div>
</body>
</html>