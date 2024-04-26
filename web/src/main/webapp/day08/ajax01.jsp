<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	//AJAX(Asynchronous JavaScript and XML)
	//비동기화 방식으로 통신
	// 통신을 담당하는 객체 : XMLHttpRequest 객체
	
	let xhr = null;
	//XMLHttpRequest 객체얻어오는 함수
	function getXMLHttpRequest(){
		//MS 브라우저의 경우
		if(window.ActiveObject){
			try{
				return new ActiveObject("MsXML2.XMLHttp")	;
			}catch(e){
				try{
					return new ActiveObject("Microsoft.XMLHttp");	
				}catch(e){
					null;
				}
				
			}
			
		}else if(window.XMLHttpRequest){
			//그 외 브라우저라면
			return new XMLHttpRequest();
		}else{
			//어떤 브라우저인지 모르겠음
			return null;
		}
		
	}
	
	function load(url){
		/* console.log(url); */
		// 1. 통신객체(XMLHttpRequest) 객체 얻어오기
		xhr = getXMLHttpRequest();
		console.log(xhr);
		
		// 2. callback 함수
		// 대기하고 있다가 응답이 오면 이 함수를 실행
		xhr.onreadystatechange=viewMessage;
		
		// 3. open(통신방식 , 주소, 비동기 통신여부)
		xhr.open("GET",url,true);
		// GET 방식으로 url에 접근하는 비동기 방식으로 통신해
		
		xhr.send(null);
		// POST 방식일때 value값을 준다.
		console.log(xhr);
	}
	//4 callback 함수 정의
	function viewMessage(){
		//console.log("view Message() 호출중");
		
		// 통신이 완료되었을 때 and 정상페이지일때
		if(xhr.readyState == 4){ //통신이 완료
			if(xhr.status == 200){ //통신이 완료
				/* alert(xhr.responseText); */
				let div1 = document.querySelector("#div1");
				
				//서버로 부터 수신한 내용을 출력
				div1.innerText=xhr.responseText;
			}
		}
	}
	
</script>
</head>
<body>
	<!--
		AJAX(Asynchronous JavaScript and XML)
		: 자바스크립트를 통해서 서버에 데이터를 요청하는것
		: 리로드를 하지 않고 데이터를 불러오는 방식 
	 -->
	 <input type="button" value="simple1.txt" onclick="load('simple1.txt')" />
	 <input type="button" value="simple2.jsp" onclick="load('simple1.jsp')" />
	 <input type="button" value="simple1.txt" onclick="load('simple2.txt')" />
	 <input type="button" value="simple2.jsp" onclick="load('simple2.jsp')" />
	 
	 <div id="div1">
	 	<!-- 서버에 가져온 글자를 출력 -->
	 </div>	
</body>
</html>