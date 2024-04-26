<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script>
	window.onload=function(){
		
		$("#btn").on("click",search);
		
		function search(){
			
			let empno=$("#empno").val().trim()
			
			$.ajax({
				url : "search2.jsp",
				type : "get",
				dataType: "html",
				data : {"empno":empno}, 
				success : function(response, status, request){
					console.log("비동기 통신");
					console.log(response);
					console.dir($("#info"));
					$("#info").html(response);
				},
				complete: function(){
					console.log("AJAX 통신 끝");					
				}
			})			
		}
		
	}
	
	
</script>
</head>
<body>
<input type="text" name="empno" id="empno" />
<input type="button" value="검색" id="btn"/>

	<div id="info">
		<h6>사원명</h6>
		
	</div>

</body>
</html>