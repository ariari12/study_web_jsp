<%@page import="dao.MovieDAO"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String saveDir = application.getRealPath("/images");
	
	int maxFileSize = 1024*1024*30;
	// cos.jar : MultipartRequest
	
	MultipartRequest mr = new MultipartRequest(request, saveDir,
			maxFileSize,"UTF-8",new DefaultFileRenamePolicy());
	
	String name =mr.getParameter("name");
	String filename = mr.getFilesystemName("filename");

	MovieDAO dao = new MovieDAO();
	dao.insertMovie(name, filename);	
%>
<h2>등록되었숩니다</h2>
<a href="movie.jsp">검색하러가기</a>