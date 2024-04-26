<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script>
		
	$(function(){
		$("#btn").on("click",searchMovie);
		
		function searchMovie(){
			let name=$("#movie").val().trim();
			
			$.ajax({
				url : "searchMovie.jsp",
				type : "get",
				dataType: "html",
				data : {"name":name}, 
				success : function(response, status, request){
					console.log("비동기 통신");
					console.log(response);
					$("#info").html(response);

				},
				complete: function(){
					console.log("AJAX 통신 끝");					
				}
			})
		}
		
	})
</script>
</head>
<body>
	<h2>영화소개</h2>
	<input type="text" name="movie" id="movie" />
	<input type="button" id="btn" value="검색" />
	
	<div id="info"><img src="../images/movie_image_1.jpg" alt="" /></div>
</body>
</html>