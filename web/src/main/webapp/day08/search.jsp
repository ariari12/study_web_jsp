<%@page import="java.util.ArrayList"%>
<%@page import="vo.ProductVO"%>
<%@page import="dao.ProductDAO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String pname = request.getParameter("txt");
	if(pname != null){
		ProductDAO dao=new ProductDAO();
		/* ProductVO vo=dao.getImg(pname); */
		ArrayList<ProductVO> list=dao.findByName(pname);
		if(list !=null){
			out.println(list.get(0).getImgfile());	
		}
		
	}
	
%>
