<%@page import="dao.BoardDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>


<div class="container">
	<h2>게시판</h2>
		<a href="write.jsp" class="btn btn-primary">글쓰기</a>
		<table class="table table-hover">
			<tr>
				<th>게시물번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
			</tr>
			<%
				BoardDAO dao = new BoardDAO();
				int totalCount = dao.getTotalCount();
				dao = new BoardDAO();
				int recordPerPage = 20;
				int totalPage = (totalCount%recordPerPage==0)?totalCount/recordPerPage : totalCount/recordPerPage+1;
				// 현재 페이지 번호
				String cp = request.getParameter("cp");
				
				int currentPage = 0;
				if(cp!=null){
					currentPage = Integer.parseInt(cp);
				}else{
					currentPage=1;
				}
				// 시작 번호
				int startNo = (currentPage-1)*recordPerPage+1;
				// 끝 번호
				int endNo = currentPage*recordPerPage;
				//시작 페이지 번호
				int startPage = 1;
				//끝 페이지 번호
				int endPage = totalPage;
				
				if(currentPage<=5){
					startPage = 1;					
				}else if(currentPage>=6){
					startPage = currentPage-4;
				}
				
				if(totalPage - currentPage <= 5){
					endPage = totalPage;
				}else if( totalPage - currentPage > 5){
					if(currentPage <=5 ){
						if(totalPage > 10){
							endPage=10;
						}else{
							endPage=totalPage;
						}
					}else{
						endPage = currentPage-4;
					}
				}
				
				ArrayList<BoardVO> list =dao.selectAll(startNo, endNo);
				for(BoardVO vo : list){					
			%>
			<tr>
				<td><%=vo.getBno() %></td>
				<td><a href="detail.jsp?bno=<%= vo.getBno()%>"><%=vo.getTitle() %></a></td>
				<td><%=vo.getWriter() %></td>
				<td><%=vo.getHits() %></td>
			</tr>	
			<%
				}
			%>			
			
		</table>	
</div>

</body>
</html>