/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.10
 * Generated at: 2018-08-16 03:23:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.myPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/myPage/../main/header.jsp", Long.valueOf(1534062449000L));
    _jspx_dependants.put("/myPage/../main/./signup.jsp", Long.valueOf(1534228725000L));
    _jspx_dependants.put("/myPage/../main/footer.jsp", Long.valueOf(1534057177000L));
  }

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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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

      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/SideMenu.css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- Bootstrap NavBar -->\n");
      out.write("<nav class=\"navbar navbar-expand-md bg-warning d-md-none\">\n");
      out.write("  <button class=\"navbar-toggler navbar-toggler-right bg-white\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon fa fa-star text-warning pt-1\"></span> \n");
      out.write("  </button>\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("    <img src=\"../img/logo1.png\" width=\"90\" height=\"40\" alt=\"logo\" class=\"d-inline-block align-top\">\n");
      out.write("  </a>\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("    <ul class=\"navbar-nav navbar-hover \">\n");
      out.write("      <!-- This menu is hidden in bigger devices with d-sm-none. \n");
      out.write("           The sidebar isn't proper for smaller screens imo, so this dropdown menu can keep all the useful sidebar itens exclusively for smaller screens  -->\n");
      out.write("      <li class=\"nav-item dropdown d-sm-block d-md-none\">\n");
      out.write("\t\t\t<a class=\"dropdown-item\" href=\"#\">홈</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">공지사항</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Q & A </a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">구인구직</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">자유게시판</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">기술동향</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">프로젝트</a>\n");
      out.write("            <hr>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">교육자료</a>\n");
      out.write("            <hr>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">코드</a>\n");
      out.write("            <hr>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">마이페이지</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">관리자게시판</a>\n");
      out.write("      </li><!-- Smaller devices menu END -->\n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav><!-- NavBar END -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Bootstrap row -->\n");
      out.write("<div class=\"row\" id=\"body-row\">\n");
      out.write("    <!-- Sidebar -->\n");
      out.write("    <div id=\"sidebar-container\" class=\"sidebar-expanded d-none d-md-block bg-warning\"><!-- d-* hiddens the Sidebar in smaller devices. Its itens can be kept on the Navbar 'Menu' -->\n");
      out.write("        <!-- Bootstrap List Group -->\n");
      out.write("        <ul class=\"list-group\">\n");
      out.write("        \t<!-- Logo -->\n");
      out.write("            <li class=\"bg-warning list-group-item logo-separator d-flex justify-content-center pb-5\">\n");
      out.write("                <img src='../img/logo1.png' width=\"70\" height=\"40\" alt=\"logo\" />    \n");
      out.write("            </li>   \n");
      out.write("            <!-- Separator with title -->\n");
      out.write("            <li class=\"list-group-item sidebar-separator-title text-muted d-flex align-items-center menu-collapsed\">\n");
      out.write("                <small></small>\n");
      out.write("            </li>\n");
      out.write("            <!-- /END Separator -->\n");
      out.write("            \n");
      out.write("            <li class=\"list-group-item list-group-item-action menu-collapsed bg-warning\">\n");
      out.write("                <div class=\"d-flex flex-row w-100 justify-content-center \">\n");
      out.write("\t                <div class=\"input-group input-group-sm mb-3\">\n");
      out.write("\t\t\t\t\t  <div class=\"input-group-prepend\">\n");
      out.write("\t\t\t\t\t    <span class=\"input-group-text fa fa-search\" id=\"basic-addon1\"></span>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t  <input type=\"text\" class=\"form-control\" placeholder=\"검색\" aria-label=\"search\" aria-describedby=\"search\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                </div>\n");
      out.write("                ");
      out.write('\n');

	// TODO: login 체크
	boolean isLoggedIn = false;

      out.write("\n");
      out.write("<div class=\"d-flex flex-row w-100 justify-content-center \">\n");

	if(isLoggedIn) {

      out.write("\n");
      out.write("\t<button type=\"button\" class=\"btn btn-sm bg-secondary text-light mr-1\"><span class=\"fa fa-user fa-fw mr-1\"></span><span class=\"menu-collapsed\">정보수정</span></button>\n");
      out.write("\t<button type=\"button\" class=\"btn btn-sm bg-secondary text-light\" ><span class=\"fa fa-sign-out-alt fa-fw mr-1\"></span><span class=\"menu-collapsed\">로그아웃</span></button>\n");
 } else {
      out.write("\n");
      out.write("<!-- Button trigger modal -->\n");
      out.write("\n");
      out.write("\t<button type=\"button\" class=\"btn btn-sm bg-success text-light mr-1\" ><span class=\"fa fa-sign-in-alt fa-fw mr-1\"></span><span class=\"menu-collapsed\">로그인</span></button>\n");
      out.write("\t<button type=\"button\" class=\"btn btn-sm bg-secondary text-light\" data-toggle=\"modal\" data-target=\"#signIn\"><span class=\"fa fa-user-plus fa-fw mr-1\"></span><span class=\"menu-collapsed\">회원가입</span></button>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"signIn\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"signInTitle\" aria-hidden=\"true\">\n");
      out.write("\t<div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t<h5 class=\"modal-title\" id=\"signInTitle\">회원가입</h5>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("\t\t\t\t  <span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"nickname\">닉네임</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"nickname\" aria-describedby=\"nicknameHelp\" placeholder=\"닉네임을 입력해주세요.\">\n");
      out.write("\t\t\t\t\t\t\t<small id=\"nicknameHelp\" class=\"form-text text-muted\">닉네임은 2~10자 이내로 입력해주세요.</small>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"email\">이메일</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"이메일을 입력해주세요.\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"password\">패스워드</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"password\" placeholder=\"패스워드를 입력해주세요.\">\n");
      out.write("\t\t\t\t\t\t\t<small id=\"passwordHelp\" class=\"form-text text-muted\">패스워드는 6자 이상에 영어대소문자, 숫자를 포함해서 입력해주세요.</small>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-check\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"form-check-input\" id=\"passwordChecker\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"form-check-label\" for=\"passwordChecker\">패스워드 보기</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">취소</button>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-primary\">회원가입</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");

}

      out.write("\n");
      out.write("</div>");
      out.write("\n");
      out.write("<!--                 <div class=\"d-flex flex-row w-100 justify-content-center \"> -->\n");
      out.write("<!-- \t                <button class=\"btn btn-sm bg-success text-light mr-1\"><span class=\"fa fa-sign-in-alt fa-fw mr-1\"></span><span class=\"menu-collapsed\">로그인</span></button> -->\n");
      out.write("<!-- \t                <button class=\"btn btn-sm bg-secondary text-light\"><span class=\"fa fa-user-plus fa-fw mr-1\"></span><span class=\"menu-collapsed\">회원가입</span></button> -->\n");
      out.write("<!--                 </div> -->\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("            <!-- Separator with title -->\n");
      out.write("            <li class=\"list-group-item sidebar-separator-title text-muted d-flex align-items-center menu-collapsed\">\n");
      out.write("<!--                 <small>OPTIONS</small> -->\n");
      out.write("            </li>\n");
      out.write("            <!-- /END Separator -->\n");
      out.write("            \n");
      out.write("            <!-- Menu with submenu -->        \n");
      out.write("            <a href=\"#\" class=\"list-group-item list-group-item-action bg-warning\">\n");
      out.write("                <div class=\"d-flex w-100 justify-content-start align-items-center\">\n");
      out.write("                    <span class=\"fa fa-bullhorn fa-fw mr-3\"></span>\n");
      out.write("                    <span class=\"menu-collapsed\">공지사항</span>    \n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"list-group-item list-group-item-action bg-warning\">\n");
      out.write("                <div class=\"d-flex w-100 justify-content-start align-items-center\">\n");
      out.write("                    <span class=\"fa fa-question-circle fa-fw mr-3\"></span>\n");
      out.write("                    <span class=\"menu-collapsed\">Q&A</span>    \n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"list-group-item list-group-item-action bg-warning\">\n");
      out.write("                <div class=\"d-flex w-100 justify-content-start align-items-center\">\n");
      out.write("                    <span class=\"fa fa-users fa-fw mr-3\"></span>\n");
      out.write("                    <span class=\"menu-collapsed\">구인구직</span>    \n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"list-group-item list-group-item-action bg-warning\">\n");
      out.write("                <div class=\"d-flex w-100 justify-content-start align-items-center\">\n");
      out.write("                    <span class=\"fa fa-comments fa-fw mr-3\"></span>\n");
      out.write("                    <span class=\"menu-collapsed\">자유게시판</span>    \n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"list-group-item list-group-item-action bg-warning\">\n");
      out.write("                <div class=\"d-flex w-100 justify-content-start align-items-center\">\n");
      out.write("                    <span class=\"fa fa-laptop fa-fw mr-3\"></span>\n");
      out.write("                    <span class=\"menu-collapsed\">기술동향</span>    \n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"list-group-item list-group-item-action bg-warning\">\n");
      out.write("                <div class=\"d-flex w-100 justify-content-start align-items-center\">\n");
      out.write("                    <span class=\"fa fa-project-diagram fa-fw mr-3\"></span>\n");
      out.write("                    <span class=\"menu-collapsed\">프로젝트</span>    \n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <!-- Separator with title -->\n");
      out.write("            <li class=\"list-group-item sidebar-separator-title text-muted d-flex align-items-center menu-collapsed\">\n");
      out.write("<!--                 <small>OPTIONS</small> -->\n");
      out.write("            </li>\n");
      out.write("            <!-- /END Separator -->\n");
      out.write("            <a href=\"#\" class=\"list-group-item list-group-item-action bg-warning\">\n");
      out.write("                <div class=\"d-flex w-100 justify-content-start align-items-center\">\n");
      out.write("                    <span class=\"fa fa-graduation-cap fa-fw mr-3\"></span>\n");
      out.write("                    <span class=\"menu-collapsed\">교육자료</span>    \n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"list-group-item list-group-item-action bg-warning\">\n");
      out.write("                <div class=\"d-flex w-100 justify-content-start align-items-center\">\n");
      out.write("                    <span class=\"fa fa-code fa-fw mr-3\"></span>\n");
      out.write("                    <span class=\"menu-collapsed\">코드</span>    \n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <!-- Separator without title -->\n");
      out.write("            <li class=\"list-group-item sidebar-separator menu-collapsed\"></li>            \n");
      out.write("            <!-- /END Separator -->\n");
      out.write("             <a href=\"#\" class=\"list-group-item list-group-item-action bg-warning\">\n");
      out.write("                <div class=\"d-flex w-100 justify-content-start align-items-center\">\n");
      out.write("                    <span class=\"fa fa-wrench fa-fw mr-3\"></span>\n");
      out.write("                    <span class=\"menu-collapsed\">관리자페이지</span>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            \n");
      out.write("            <a href=\"#\" data-toggle=\"sidebar-colapse\" class=\"bg-warning list-group-item list-group-item-action d-flex align-items-center\">\n");
      out.write("                <div class=\"d-flex w-100 justify-content-start align-items-center\">\n");
      out.write("                    <span id=\"collapse-icon\" class=\"fa fa-2x mr-3\"></span>\n");
      out.write("                    <span id=\"collapse-text\" class=\"menu-collapsed\">Collapse</span>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("        </ul><!-- List Group END-->\n");
      out.write("    </div><!-- sidebar-container END -->\n");
      out.write("\n");
      out.write("    <!-- MAIN -->\n");
      out.write("    <div class=\"col\">\n");
      out.write("\n");
      out.write("<div class=\"container m-2\">\n");
      out.write("<h1> 마이페이지 -- 추가할것</h1>\n");
      out.write("<p> 로그인 성공시 이 페이지로 포워딩 됨</p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    </div><!-- Main Col END -->\n");
      out.write("    \n");
      out.write("</div><!-- body-row END -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" ></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../js/sidemenu.js\"></script>\n");
      out.write("</body>\n");
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