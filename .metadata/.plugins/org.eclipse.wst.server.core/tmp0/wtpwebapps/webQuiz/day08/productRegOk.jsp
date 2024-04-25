

<%@page import="dao.FileDAO"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String saveDir = application.getRealPath("/upload");
	int maxFileSize = 1024*1024*100;
	
	//라이브러리에 cos2 jar 추가
	// enctype="multipart/form-data" form 태그에 추가해야함
	MultipartRequest mr = new MultipartRequest(request, saveDir,
			maxFileSize,"UTF-8",new DefaultFileRenamePolicy());
	
	FileDAO dao = new FileDAO();
	String pname = mr.getParameter("pname");
	int qty = Integer.parseInt(mr.getParameter("qty"));
	int price = Integer.parseInt(mr.getParameter("price"));	
	int dcratio = Integer.parseInt(mr.getParameter("dcratio"));
	String prodesc = mr.getParameter("prodesc");
	int fileNumber = dao.getNumber();
	dao.addOne(fileNumber, pname,qty,price,dcratio,prodesc);
	
	response.sendRedirect("productList.jsp");
%>
	
