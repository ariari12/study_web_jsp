
<%@page import="vo.MovieVO"%>
<%@page import="dao.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//파묘
//댓글부대
//듄
//고질라
//스파이패밀리
//이승윤콘서트
//악은존재하지않는다
//1980
//가여운것들
//웡카
	String name=request.getParameter("name");
	MovieDAO dao = new MovieDAO();
	MovieVO vo = dao.selectMovie(name);	
	out.println("<img src='../images/"+vo.getImg()+" '/>");
%>
