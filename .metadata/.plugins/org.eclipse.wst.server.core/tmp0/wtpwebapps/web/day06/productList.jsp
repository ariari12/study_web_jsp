<%@page import="vo.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	*{
		margin: 0; padding: 0;
	}
	#container{
		width: 1000px;
		margin: auto;
	}
	img{
		width: 200px; height: 200px;
	}
	
	p{
		text-align:center;
	}
	.wrap{
		width: 200px;
		border: 1px solid red;
		float: left;
		padding: 20px;
		margin : 2px;
	}
	.del{
		text-decoration: line-through;
	}
</style>
</head>
<body>
	<div id="container">
		<%
			ProductDAO dao = new ProductDAO();
			ArrayList<ProductVO> list = dao.selectAll();
			
			for(ProductVO vo : list){
				// 1. 상품명 구하기
				System.out.println("상품명 : "+vo.getPname());
				// 2. 상품명의 길이 구하기
				System.out.println("상품명 : "+vo.getPname().length());
				// 3. 이 길이가 15자 이상이면 15자까지만 출력하게
				System.out.println((vo.getPname().length() >=12) ? vo.getPname().substring(0,12)+"..." : vo.getPname());
				// 상품명의 길이가 15자까지
				vo.setPname((vo.getPname().length() >=12) ? vo.getPname().substring(0,12)+"..." : vo.getPname());
				/* if(vo.getPname().length() >=12){
					
				}else{
					
				} */
		%>
			<div class="wrap">
				<img src="<%= vo.getImgfile() %>" alt="" />
				<p><%= vo.getPname() %></p>
				<p class="del"><%= vo.getPrice() %></p>
				<p>대학할인</p>				
				<p> 50000 10% 할인 ==> 45000원</p>
				<p><%= vo.getDcratio() %></p>
				<p><%= Math.round(vo.getPrice()* (1-vo.getDcratio()*0.01)) %> 원</p>
				
				<p>
					<input type="button" value="즉시구매" />
					<input type="button" value="장바구니" />
				</p>
			</div>
		<%		
			}
		%>
	</div>

</body>
</html>