<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="vo.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	JSONArray memberArray = new JSONArray();
	MemberDAO dao = new MemberDAO();
	ArrayList<MemberVO> list =dao.selectAll();
	
	for(MemberVO vo : list){
		JSONObject json = new JSONObject();
		json.put("id", vo.getId());
		json.put("pw", vo.getPw());
		json.put("name", vo.getName());
		memberArray.add(json);
	}
	out.println(memberArray);
%>