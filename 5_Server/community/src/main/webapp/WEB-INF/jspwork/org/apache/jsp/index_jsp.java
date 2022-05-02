/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-05-02 08:31:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>KH 커뮤니티</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/main-style.css\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/a2e8ca0ae3.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <main>\r\n");
      out.write("        <header>\r\n");
      out.write("\r\n");
      out.write("            <!-- 클릭 시 메인페이지로 이동하는 로고 -->\r\n");
      out.write("            <section>\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <img src=\"resources/images/logo.jpg\" id=\"home-logo\">\r\n");
      out.write("                </a>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("            <section>\r\n");
      out.write("                <article class=\"search-area\">\r\n");
      out.write("                    <!-- form 내부 input 태그 값을 서버 또는 페이지로 전달 -->\r\n");
      out.write("                    <form action=\"#\" name=\"search-form\">\r\n");
      out.write("        \r\n");
      out.write("                        <!-- fieldset: form 내부에서 input을 종류별로 묶는 용도로 많이 사용 -->\r\n");
      out.write("                        <fieldset>\r\n");
      out.write("\r\n");
      out.write("                            <!-- autocomplete=\"off\" : HTML 기본 자동완성 사용 X -->\r\n");
      out.write("                            <input type=\"search\" id=\"query\" name=\"query\" \r\n");
      out.write("                                autocomplete=\"off\" placeholder=\"검색어를 입력해주세요.\">\r\n");
      out.write("        \r\n");
      out.write("                            <!-- 검색 버튼 -->\r\n");
      out.write("                            <button type=\"submit\" id=\"search-btn\" class=\"fa-solid fa-magnifying-glass\"></button>  \r\n");
      out.write("                        </fieldset>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </article>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <section></section>\r\n");
      out.write("\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"#\">공지사항</a></li>\r\n");
      out.write("                <li><a href=\"#\">자유 게시판</a></li>\r\n");
      out.write("                <li><a href=\"#\">질문 게시판</a></li>\r\n");
      out.write("                <li><a href=\"#\">FAQ</a></li>\r\n");
      out.write("                <li><a href=\"#\">1:1문의</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"content\">\r\n");
      out.write("            <section class=\"content-1\">\r\n");
      out.write("            	loginMember :  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginMember}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("            	\r\n");
      out.write("            	<hr>\r\n");
      out.write("            	\r\n");
      out.write("            	message :  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            </section>\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            <section class=\"content-2\">\r\n");
      out.write("           	 	<!-- 절대경로 : /community/member/login -->\r\n");
      out.write("           	 	\r\n");
      out.write("           	 	<!-- 상대 경로 (index.jsp) 기준-->\r\n");
      out.write("                <form action=\"member/login\" method=\"POST\" name=\"login-form\">\r\n");
      out.write("                   \r\n");
      out.write("                    <!-- 아이디(이메일)/비밀번호/로그인버튼 영역 -->\r\n");
      out.write("                    <fieldset id=\"id-pw-area\">\r\n");
      out.write("        \r\n");
      out.write("                        <section>\r\n");
      out.write("                            <input type=\"text\" name=\"inputEmail\" placeholder=\"아이디(이메일)\">\r\n");
      out.write("                            <input type=\"password\" name=\"inputPw\" placeholder=\"비밀번호\">\r\n");
      out.write("                        </section>\r\n");
      out.write("        \r\n");
      out.write("                        <section>\r\n");
      out.write("                            <!-- button의 type 기본값은 submit -->\r\n");
      out.write("                            <button>로그인</button>\r\n");
      out.write("                        </section>\r\n");
      out.write("        \r\n");
      out.write("                    </fieldset>\r\n");
      out.write("\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <input type=\"checkbox\" name=\"saveId\"> 아이디 저장\r\n");
      out.write("                    </label>\r\n");
      out.write("        \r\n");
      out.write("                    <!-- 회원가입 / ID/PW 찾기 영역 -->\r\n");
      out.write("                    <article id=\"signup-find-area\">\r\n");
      out.write("                        <a href=\"#\">회원가입</a> \r\n");
      out.write("                        <span>|</span>\r\n");
      out.write("                        <a href=\"#\">ID/PW 찾기</a>\r\n");
      out.write("                    </article>\r\n");
      out.write("                </form>\r\n");
      out.write("            </section>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("    </main>\r\n");
      out.write("\r\n");
      out.write("    <footer>\r\n");
      out.write("        <p>Copyright &copy; KH Information Educational Institute A-Class</p>\r\n");
      out.write("\r\n");
      out.write("        <article>\r\n");
      out.write("            <a href=\"#\">프로젝트 소개</a>\r\n");
      out.write("            <span>|</span>\r\n");
      out.write("            <a href=\"#\">이용약관</a>\r\n");
      out.write("            <span>|</span>\r\n");
      out.write("            <a href=\"#\">개인정보처리방침</a>\r\n");
      out.write("            <span>|</span>\r\n");
      out.write("            <a href=\"#\">고객센터</a>\r\n");
      out.write("        </article>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
