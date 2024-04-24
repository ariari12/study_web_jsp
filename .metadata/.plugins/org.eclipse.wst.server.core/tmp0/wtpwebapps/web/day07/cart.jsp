<%@page import="vo.ProductVO"%>
<%@page import="dao.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String p = request.getParameter("pno");

	// 현재 세션에 cart 라는 이름의 속성 객체를 얻어오기
	Object obj = session.getAttribute("cart");
	// 만약 cart 라는 속성이 없다면 하나 만들어줌
	if(obj==null){
		//ArrayList
		ArrayList<Integer> cart = new ArrayList<>();
		
		//세션에 속성으로 지정
		session.setAttribute("cart",cart);
		
		// 세션세어 속성 가져오기
		obj = session.getAttribute("cart");
	}
	
	// ArrayList로 형변환
	ArrayList<Integer> cart = (ArrayList<Integer>)obj;
	
	if(p !=null){
		int pno = Integer.parseInt(p);
		
		//카트(ArrayList 추가)
		cart.add(pno);
		response.sendRedirect("productDetail.jsp?pno="+pno);
		
		ProductDAO dao = new ProductDAO();
		ProductVO vo = dao.getOne(pno);
		out.println("<h2> 상품명 : "+vo.getPname()+"</h2>");
		
	}else{
		// p 가 널이야 그림 처음으로 돌가아
		response.sendRedirect("productList.jsp");
	}
%>