<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String writer=request.getParameter("writer");
	String title=request.getParameter("title");
	String contents=request.getParameter("contents");
	String b=request.getParameter("bno");
	
	
	if(b !=null){
		int bno = Integer.parseInt(b);
		BoardDAO dao = new BoardDAO();
		BoardVO vo = dao.getOne(bno);
		dao = new BoardDAO();
		vo.setBno(bno);
		vo.setTitle(title);
		vo.setContents(contents);
		vo.setWriter(writer);		
		dao.updateOne(vo);
		
		
		
	}
	response.sendRedirect("list.jsp");
	

%>