/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2023-01-18 16:30:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class homeAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("/Homeheader.jsp", Long.valueOf(1654158816217L));
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar", Long.valueOf(1674058733156L));
    _jspx_dependants.put("jar:file:/home/jnt5398/eclipse-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pfe/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar!/META-INF/c.tld", Long.valueOf(1602870372000L));
    _jspx_dependants.put("/headerSection.jsp", Long.valueOf(1653755267615L));
    _jspx_dependants.put("/img.jsp", Long.valueOf(1653755319058L));
    _jspx_dependants.put("/taglibs.jsp", Long.valueOf(1653396216024L));
    _jspx_dependants.put("/headerAdmin.jsp", Long.valueOf(1653650243374L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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

      out.write('\r');
      out.write('\n');
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <title>Artisana marocaine</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"> \r\n");
      out.write("        <meta name='viewport' content='width=device-width, initial-scale=1'>\r\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\" />\r\n");
      out.write("  \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/css/normalize.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nbcd.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header>");
      out.write("<!-- <h1>Artisana</h1> -->\r\n");
      out.write("<div>\r\n");
      out.write("	<img id=\"maLogo\" src=\"img/logo-am.png\">\r\n");
      out.write("</div>\r\n");
      out.write("<div\">\r\n");
      out.write("	<ul>\r\n");
      out.write("		<li style=\"float: right:;\"><div class=\"rechC\">\r\n");
      out.write("				<form action=\"chercher.do\" method=\"get\">\r\n");
      out.write("					<input type=\"text\" style=\"width: 300px\" name=\"motCle\"\r\n");
      out.write("						placeholder=\"Search..\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.motCle}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("					<button type=\"submit\" style=\"width: 50px\">Chercher</button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div></li>\r\n");
      out.write("		<li style=\"float: left;\"><a href=\"Admin.do\">Admin</a></li>\r\n");
      out.write("		<li style=\"float: left;\"><a href=\"Client.do\" class=\"loginA\"><i\r\n");
      out.write("				class=\"fa fa-fw fa-user\"></i> Login</a></li>\r\n");
      out.write("		<li style=\"float: left;\"><a href=\"CreerCompte.do\" class=\"login\">S'inscrire</a></li>\r\n");
      out.write("		<li style=\"float: left;\"><a href=\"panier.do\" class=\"login\"><i\r\n");
      out.write("				class='fas fa-shopping-cart' style='font-size: 18px'></i> Panier</a></li>\r\n");
      out.write("		<li style=\"float: left;\"><a href=\"#contact\">Contact</a></li>\r\n");
      out.write("		<li style=\"float: left;\"><a href=\"#about\">About</a></li>\r\n");
      out.write("		<li style=\"float: left;\"><a href=\"*.do\"><i\r\n");
      out.write("				class=\"fa fa-fw fa-home\"></i>Acceuil</a></li>\r\n");
      out.write("	</ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("<header>");
      out.write("<div >\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write(" <table>\r\n");
      out.write("<tr>\r\n");
      out.write("   <th><a href=\"client.do\"> Client </a></th>\r\n");
      out.write("   \r\n");
      out.write("   <th><a href=\"produit.do\"> Produit </a></th>\r\n");
      out.write("   \r\n");
      out.write("   <th><a href=\"fornisseur.do\"> Fornisseur </a></th>\r\n");
      out.write("   \r\n");
      out.write("   <th><a href=\"Deconnection.do\"> Deconnection  </a></th>\r\n");
      out.write("</tr>  \r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("</header>\r\n");
      out.write("<section id=\"pageContent\">\r\n");
      out.write("<header>\r\n");
      out.write("\r\n");
      out.write("<main id=\"leftCol\">\r\n");
      out.write("\r\n");
      out.write("	<div class=\"gallery\">\r\n");
      out.write("		<a target=\"_blank\" href=\"img/tanjia.jpg\"> <img\r\n");
      out.write("			src=\"img/tanjia.jpg\" alt=\"Cinque Terre\" width=\"500\" height=\"400\">\r\n");
      out.write("		</a>\r\n");
      out.write("		<div class=\"desc\">Add a description of the image here</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"gallery\">\r\n");
      out.write("		<a target=\"_blank\" href=\"img/tajin.jpg\"> <img src=\"img/tajin.jpg\"\r\n");
      out.write("			alt=\"Forest\" width=\"500\" height=\"400\">\r\n");
      out.write("		</a>\r\n");
      out.write("		<div class=\"desc\">Add a description of the image here</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"gallery\">\r\n");
      out.write("		<a target=\"_blank\" href=\"img/siniya.jpg\"> <img\r\n");
      out.write("			src=\"img/siniya.jpg\" alt=\"Northern Lights\" width=\"500\" height=\"400\">\r\n");
      out.write("		</a>\r\n");
      out.write("		<div class=\"desc\">Add a description of the image here</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"gallery\">\r\n");
      out.write("		<a target=\"_blank\" href=\"img/plato.jpg\"> <img src=\"img/plato.jpg\"\r\n");
      out.write("			alt=\"Mountains\" width=\"500\" height=\"400\">\r\n");
      out.write("		</a>\r\n");
      out.write("		<div class=\"desc\">Add a description of the image here</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"gallery\">\r\n");
      out.write("		<a target=\"_blank\" href=\"img/plateauenthuya.jpg\"> <img\r\n");
      out.write("			src=\"img/plateauenthuya.jpg\" alt=\"Cinque Terre\" width=\"500\"\r\n");
      out.write("			height=\"400\">\r\n");
      out.write("		</a>\r\n");
      out.write("		<div class=\"desc\">Add a description of the image here</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"gallery\">\r\n");
      out.write("		<a target=\"_blank\" href=\"img/koranhas.jpg\"> <img\r\n");
      out.write("			src=\"img/koranhas.jpg\" alt=\"Forest\" width=\"500\" height=\"400\">\r\n");
      out.write("		</a>\r\n");
      out.write("		<div class=\"desc\">Add a description of the image here</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"gallery\">\r\n");
      out.write("		<a target=\"_blank\" href=\"img/erfoud.jpg\"> <img\r\n");
      out.write("			src=\"img/erfoud.jpg\" alt=\"Northern Lights\" width=\"500\" height=\"400\">\r\n");
      out.write("		</a>\r\n");
      out.write("		<div class=\"desc\">Add a description of the image here</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"gallery\">\r\n");
      out.write("		<a target=\"_blank\" href=\"img/cuivre.jpg\"> <img\r\n");
      out.write("			src=\"img/cuivre.jpg\" alt=\"Mountains\" width=\"500\" height=\"400\">\r\n");
      out.write("		</a>\r\n");
      out.write("		<div class=\"desc\">Add a description of the image here</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"gallery\">\r\n");
      out.write("		<a target=\"_blank\" href=\"img/boitemouchoirsenthuya.jpg\"> <img\r\n");
      out.write("			src=\"img/boitemouchoirsenthuya.jpg\" alt=\"Mountains\" width=\"500\"\r\n");
      out.write("			height=\"400\">\r\n");
      out.write("		</a>\r\n");
      out.write("		<div class=\"desc\">Add a description of the image here</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"gallery\">\r\n");
      out.write("		<a target=\"_blank\" href=\"img/boite.jpg\"> <img src=\"img/boite.jpg\"\r\n");
      out.write("			alt=\"Cinque Terre\" width=\"500\" height=\"400\">\r\n");
      out.write("		</a>\r\n");
      out.write("		<div class=\"desc\">Add a description of the image here</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"gallery\">\r\n");
      out.write("		<a target=\"_blank\" href=\"img/barad.jpg\"> <img src=\"img/barad.jpg\"\r\n");
      out.write("			alt=\"Forest\" width=\"500\" height=\"400\">\r\n");
      out.write("		</a>\r\n");
      out.write("		<div class=\"desc\">Add a description of the image here</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"gallery\">\r\n");
      out.write("		<a target=\"_blank\" href=\"img/atay1.jpg\"> <img src=\"img/atay1.jpg\"\r\n");
      out.write("			alt=\"Northern Lights\" width=\"500\" height=\"400\">\r\n");
      out.write("		</a>\r\n");
      out.write("		<div class=\"desc\">Add a description of the image here</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"gallery\">\r\n");
      out.write("		<a target=\"_blank\" href=\"img/atay.jpg\"> <img src=\"img/atay.jpg\"\r\n");
      out.write("			alt=\"Mountains\" width=\"500\" height=\"400\">\r\n");
      out.write("		</a>\r\n");
      out.write("		<div class=\"desc\">Add a description of the image here</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</main>");
      out.write('\r');
      out.write('\n');
      out.write("<main id=\"rightCol\" style=\"overflow: auto\">\r\n");
      out.write("\r\n");
      out.write("  <img style=\"overflow: auto\" id=\"img\" src=\"img/img.png\">\r\n");
      out.write("</main>");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("</section>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /headerAdmin.jsp(17,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ !empty sessionScope.Login}", boolean.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" <h6 style=\"margin: 5px\">Bienvenue: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.Login }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" </h6>\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
