<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String writer =request.getParameter("writer");
	String title =request.getParameter("title");
	String contents =request.getParameter("contents");
	String ip = request.getRemoteAddr();
	
	BoardDAO dao = new BoardDAO();
	BoardVO vo = new BoardVO(); 
	vo.setWriter(writer);
	vo.setTitle(title);
	vo.setContents(contents);
	vo.setIp(ip);
	dao.addOne(vo);
	
	out.print("<h2>" + writer + "</h2>");
	out.print("<h2>" + title + "</h2>");
	out.print("<h2>" + contents + "</h2>");
	out.print("<h2>" + ip + "</h2>");
	
	response.sendRedirect("list.jsp");
	
%>