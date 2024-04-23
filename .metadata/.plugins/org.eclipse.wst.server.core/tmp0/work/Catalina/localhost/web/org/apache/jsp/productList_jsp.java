/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.20
 * Generated at: 2024-04-23 06:50:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import vo.ProductVO;
import java.util.ArrayList;
import dao.ProductDAO;

public final class productList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("dao.ProductDAO");
    _jspx_imports_classes.add("vo.ProductVO");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	*{\r\n");
      out.write("		margin: 0; padding: 0;\r\n");
      out.write("	}\r\n");
      out.write("	#container{\r\n");
      out.write("		width: 1000px;\r\n");
      out.write("		margin: auto;\r\n");
      out.write("	}\r\n");
      out.write("	img{\r\n");
      out.write("		width: 200px; height: 200px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	p{\r\n");
      out.write("		text-align:center;\r\n");
      out.write("	}\r\n");
      out.write("	.wrap{\r\n");
      out.write("		width: 200px;\r\n");
      out.write("		border: 1px solid red;\r\n");
      out.write("		float: left;\r\n");
      out.write("		padding: 20px;\r\n");
      out.write("		margin : 2px;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"container\">\r\n");
      out.write("		");

			ProductDAO dao = new ProductDAO();
			ArrayList<ProductVO> list = dao.selectAll();
			
			for(ProductVO vo : list){
				// 1. 상품명 구하기
				System.out.println("상품명 : "+vo.getPname());
				// 2. 상품명의 길이 구하기
				System.out.println("상품명 : "+vo.getPname().length());
				// 3. 이 길이가 15자 이상이면 15자까지만 출력하게
				System.out.println((vo.getPname().length() >=12) ? vo.getPname().substring(0,12)+"..." : vo.getPname());
				// 상품명의 길이가 15자까지
				vo.setPname((vo.getPname().length() >=12) ? vo.getPname().substring(0,12)+"..." : vo.getPname());
				/* if(vo.getPname().length() >=12){
					
				}else{
					
				} */
		
      out.write("\r\n");
      out.write("			<div class=\"wrap\">\r\n");
      out.write("				<img src=\"");
      out.print( vo.getImgfile() );
      out.write("\" alt=\"\" />\r\n");
      out.write("				<p>");
      out.print( vo.getPname() );
      out.write("</p>\r\n");
      out.write("				<p class=\"del\">");
      out.print( vo.getPrice() );
      out.write("</p>\r\n");
      out.write("				<p>대학할인</p>\r\n");
      out.write("				<p>");
      out.print( vo.getDcratio() );
      out.write("</p>\r\n");
      out.write("				<p>\r\n");
      out.write("					<input type=\"button\" value=\"즉시구매\" />\r\n");
      out.write("					<input type=\"button\" value=\"장바구니\" />\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		");
		
			}
		
      out.write("\r\n");
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
