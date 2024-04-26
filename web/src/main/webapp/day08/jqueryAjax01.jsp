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
		$("#img").on("click",function(){
			console.log("뽀로로 클릭함");
			//이미지를 클릭하면 after.png
			console.log($("#img").attr("src"));
			//$("#img").attr("src","../images/after.png");
			
			$.ajax({
				url: "getJSON.jsp",
				type: "get",
				dataType: "html", //전송받을 데이터 html, json, xml
				data : {"id":"aaa"}, //getJSON.jsp?id=aaa 이렇게 요청
				success : function(response, status, request){
					console.log("성공시 메세지 출력");
					console.log(response);
					$("img").attr("src", response);
				},
				error : function(response,status,request){
					console.log("에러 메시지 출력");
					$("img").attr("src", "https://m.members.kia.com/kr/common/images/txt/error_txt1.png");
				},
				complete: function(){
					console.log("AJAX 통신 끝");
					$("img").fadeIn(1000);
				},
				beforeSend: function(){
					console.log("요청 보내기전에 호출됨");
					$("img").fadeOut(1000);
				}
				
			});
			
		})
	})
</script>
</head>
<body>

	<!-- jquery를 사용해서 이미지를 클릭하면 콘솔에 메세지 출력 -->
	<img src="../images/before.png" alt="" id="img"/>
</body>
</html>