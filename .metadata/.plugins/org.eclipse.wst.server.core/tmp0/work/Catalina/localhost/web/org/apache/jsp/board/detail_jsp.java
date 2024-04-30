/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.20
 * Generated at: 2024-04-30 03:02:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import vo.BoardVO;
import dao.BoardDAO;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("dao.BoardDAO");
    _jspx_imports_classes.add("vo.BoardVO");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- include libraries(jQuery, bootstrap) -->\r\n");
      out.write("<link href=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- include summernote css/js -->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	$(function(){\r\n");
      out.write("		$('.summernote').summernote({ \r\n");
      out.write("			  // 에디터 높이 \r\n");
      out.write("			  height: 150, \r\n");
      out.write("			  // 에디터 한글 설정 \r\n");
      out.write("			  lang: \"ko-KR\", \r\n");
      out.write("			  focus : true, \r\n");
      out.write("			  toolbar: [ \r\n");
      out.write("				    // 글꼴 설정 \r\n");
      out.write("				    ['fontname', ['fontname']], \r\n");
      out.write("				    // 글자 크기 설정 \r\n");
      out.write("				    ['fontsize', ['fontsize']], \r\n");
      out.write("				    // 굵기, 기울임꼴, 밑줄,취소 선, 서식지우기 \r\n");
      out.write("				    ['style', ['bold', 'italic', 'underline','strikethrough', 'clear']], \r\n");
      out.write("				    // 글자색 \r\n");
      out.write("				    ['color', ['forecolor','color']], \r\n");
      out.write("				    // 표만들기 \r\n");
      out.write("				    ['table', ['table']], \r\n");
      out.write("				    // 글머리 기호, 번호매기기, 문단정렬 \r\n");
      out.write("				    ['para', ['ul', 'ol', 'paragraph']], \r\n");
      out.write("				    // 줄간격 \r\n");
      out.write("				    ['height', ['height']], \r\n");
      out.write("				    // 그림첨부, 링크만들기, 동영상첨부 \r\n");
      out.write("				    ['insert',['picture','link','video']], \r\n");
      out.write("				    // 코드보기, 확대해서보기, 도움말 \r\n");
      out.write("				    ['view', ['codeview','fullscreen', 'help']] \r\n");
      out.write("				  ], \r\n");
      out.write("				  // 추가한 글꼴 \r\n");
      out.write("				fontNames: ['Arial', 'Arial Black', 'Comic Sans MS', 'Courier New','맑은 고딕','궁서','굴림체','굴림','돋음체','바탕체'], \r\n");
      out.write("				 // 추가한 폰트사이즈 \r\n");
      out.write("				fontSizes: ['8','9','10','11','12','14','16','18','20','22','24','28','30','36','50','72'] \r\n");
      out.write("			}); \r\n");
      out.write("		\r\n");
      out.write("	})\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");

	// 1. 전달 받은 파라미터의 값 가져오기
	String b = request.getParameter("bno");
	BoardVO vo= null;
	//2. bno null 이 아니면
	if(b!=null){
		//3. 숫자로 형변환
		int bno = Integer.parseInt(b);		
		//4. dao 객체
		BoardDAO dao = new BoardDAO();
		
		dao.raiseHits(bno); // hits 값을 1증가
		dao = new BoardDAO();
		
		
		//5. dao를 통해서 지정한 게시물을 가져오기		
		//dao.getOne(bno);
		vo = dao.getOne(bno);
	}
	
	
	
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h2>상세보기</h2>\r\n");
      out.write("		<!-- table>tr>(th+td)*2 -->\r\n");
      out.write("		<table class=\"table\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>작성자</th>\r\n");
      out.write("				<td>");
      out.print(vo.getWriter());
      out.write("</td>\r\n");
      out.write("				<th>조회수</th>\r\n");
      out.write("				<td>");
      out.print(vo.getHits());
      out.write("</td>\r\n");
      out.write("				<th>작성일시</th>\r\n");
      out.write("				<td>");
      out.print(vo.getRegdate());
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th colspan=\"2\">내용</th>\r\n");
      out.write("				<td colspan=\"4\">\r\n");
      out.write("				<textarea class=\"summernote\" id=\"\" cols=\"30\" rows=\"10\">");
      out.print(vo.getContents());
      out.write("</textarea></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"6\">\r\n");
      out.write("					<a href=\"list.jsp\" class=\"btn btn-primary\">목록</a>\r\n");
      out.write("					<a href=\"modify.jsp?bno=");
      out.print(vo.getBno() );
      out.write("\" class=\"btn btn-success\">수정</a>\r\n");
      out.write("					<a href=\"deleteOk.jsp?bno=");
      out.print(vo.getBno() );
      out.write("\" class=\"btn btn-danger\">삭제</a>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
