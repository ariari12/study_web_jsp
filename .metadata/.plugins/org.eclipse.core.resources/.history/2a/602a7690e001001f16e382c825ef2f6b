<%@page import="vo.ProductVO"%>
<%@page import="dao.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>productDetail.jsp</title>

<style type="text/css">

   .container {
      width: 1000px;
      margin: auto;
   }
   
   #pic {
      width: 480px;
      float: left;
   }
   
   table {
      width: 100%;
      border-top: 3px solid gray;
      border-bottom: 3px solid gray;
   }
   
   .info {
      width: 500px;
      float: right;
   }
   
   div#pic>img {
      width: 100%;
      height: 50%;
   }
   
   #desc {
      clear: both;
   }
   
   .icon {
      width: 50px;
      height: 50px
   }
</style>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

<script type="text/javascript">
   
   $(function() {
      $("img[src='../images/cart.png']").on('click', function() {
         //alert("dd");
         $("#showImg").show();
      })
   })
   
   function closeDiv(){
	   $("#showImg").hide();
   }



</script>


</head>
<body>
   <%
      
      // http://localhost:8080/web/day06/productDetail.jsp&pno=25
   
   
      // pno라는 파라미터 값 가져오기
      String p = request.getParameter("pno");
   
      // out.println("pno: " + p);
      // 파라미터 값이 null이 아니라면
      if (p != null) {
         // productDAO 객체 생성하기
         ProductDAO dao = new ProductDAO();
         // p라는 문자열 변수의 값을 숫자로 형변환
         int pno = Integer.parseInt(p);
         // db에서 해당 상품정보 가져오기
         ProductVO vo = dao.getOne(pno);
   %>
   
   <div class="container">
      <div id="pic">
         <img src="<%=vo.getBigfile() %>" alt="<%=vo.getPname() %>" />
      </div>
      
      <div class="info">
         <table>
            <tr>
               <td colspan="2">
                  <%=vo.getPname() %>
               </td>
            </tr>
            
            <tr>
               <td>판매가격</td>
               <td><%=vo.getPrice() %></td>
            </tr>
            
            <tr>
               <td>할인가격</td>
               <td><%=Math.round(vo.getPrice() * (1-vo.getDcratio() * 0.01)) %></td>
            </tr>
            
            <tr>
               <td colspan="2">
                  <img class="icon" src="../images/buy.png" alt="" />
                  <img class="icon" src="../images/cart.png" alt="" />
                  <a href="viewCart.jsp">장바구니 보러가기</a>
               </td>
            </tr>
         </table>
         
         <div class="desc">
            <!-- 제품 상세 설명 -->
            <p><%=vo.getProdesc() %></p>
         </div>
         
         <div id="showImg" style="display: none;">
            <h1>장바구니에 넣었습니다.</h1>
            <a href="javascript:closeDiv()">닫기</a>
         </div>
      
      </div>
      
   </div>
   
   
   <%
      }
   %>
   
   
   
</body>
</html>