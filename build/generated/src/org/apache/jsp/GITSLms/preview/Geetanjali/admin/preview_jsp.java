package org.apache.jsp.GITSLms.preview.Geetanjali.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public final class preview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

 String category=(String)session.getAttribute("cat");
  
   session= request.getSession(false);
if(session == null)
{
response.sendRedirect("../Login.jsp");
    
}
else if ((session.getAttribute("email") == null) || (session.getAttribute("email") == "")) {
   response.sendRedirect("../Login.jsp");
}
else if (!(category).equals("admin")) {
   response.sendRedirect("../Login.jsp");} 


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <!--<![endif]-->\n");
      out.write("    <!-- BEGIN HEAD -->\n");
      out.write("\n");
      out.write("    \n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\" /><!-- /Added by HTTrack -->\n");
      out.write("<head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>LMS | Remove</title>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\" />\n");
      out.write("        <meta content=\"Preview page of Metronic Admin Theme #1 for editable datatable samples\" name=\"description\" />\n");
      out.write("        <meta content=\"\" name=\"author\" />\n");
      out.write("        <!-- BEGIN GLOBAL MANDATORY STYLES -->\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&amp;subset=all\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"../assets/global/plugins/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"../assets/global/plugins/simple-line-icons/simple-line-icons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"../assets/global/plugins/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"../assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- END GLOBAL MANDATORY STYLES -->\n");
      out.write("        <!-- BEGIN PAGE LEVEL PLUGINS -->\n");
      out.write("        <link href=\"../assets/global/plugins/datatables/datatables.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"../assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- END PAGE LEVEL PLUGINS -->\n");
      out.write("        <!-- BEGIN THEME GLOBAL STYLES -->\n");
      out.write("        <link href=\"../assets/global/css/components.min.css\" rel=\"stylesheet\" id=\"style_components\" type=\"text/css\" />\n");
      out.write("        <link href=\"../assets/global/css/plugins.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- END THEME GLOBAL STYLES -->\n");
      out.write("        <!-- BEGIN THEME LAYOUT STYLES -->\n");
      out.write("        <link href=\"../assets/layouts/layout/css/layout.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"../assets/layouts/layout/css/themes/darkblue.min.css\" rel=\"stylesheet\" type=\"text/css\" id=\"style_color\" />\n");
      out.write("        <link href=\"../assets/layouts/layout/css/custom.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- END THEME LAYOUT STYLES -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\" />\n");
      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("function deleteRecord(id){\n");
      out.write("   // var f=document.form;\n");
      out.write("     alert(\"javascript\"+id);  \n");
      out.write("       window.location.replace(\"facultyremovebutton.jsp?id=\"+id);\n");
      out.write("}\n");
      out.write("function editRecord(id){\n");
      out.write("   // var f=document.form;\n");
      out.write("     alert(\"javascript edit\"+id);  \n");
      out.write("       window.location.replace(\"facultyeditbutton.jsp?id=\"+id);\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("    <!-- END HEAD -->\n");
      out.write("\n");
      out.write("    <body class=\"page-header-fixed page-sidebar-closed-hide-logo page-content-white\">\n");
      out.write("        <div class=\"page-wrapper\">\n");
      out.write("            <!-- include HEADER-->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, false);
      out.write("\n");
      out.write("             <!-- end HEADER -->\n");
      out.write("            <!-- BEGIN HEADER & CONTENT DIVIDER -->\n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("            <!-- END HEADER & CONTENT DIVIDER -->\n");
      out.write("            <!-- BEGIN CONTAINER -->\n");
      out.write("            <div class=\"page-container\">\n");
      out.write("                <!-- BEGIN SIDEBAR -->\n");
      out.write("                <div class=\"page-sidebar-wrapper\">\n");
      out.write("                   <!-- include SIDEBAR -->\n");
      out.write("                \n");
      out.write("                 ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("                <!-- END SIDEBAR -->\n");
      out.write("                </div>\n");
      out.write("                <!-- END SIDEBAR -->\n");
      out.write("                <!-- BEGIN CONTENT -->\n");
      out.write("                <div class=\"page-content-wrapper\">\n");
      out.write("                    <!-- BEGIN CONTENT BODY -->\n");
      out.write("                    <div class=\"page-content\">\n");
      out.write("                        <!-- BEGIN PAGE HEADER-->\n");
      out.write("                        <!-- BEGIN THEME PANEL -->\n");
      out.write("                       \n");
      out.write("                        <!-- END THEME PANEL -->\n");
      out.write("                        <!-- BEGIN PAGE BAR -->\n");
      out.write("                        <div class=\"page-bar\">\n");
      out.write("                            <ul class=\"page-breadcrumb\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"index.jsp\">Home</a>\n");
      out.write("                                    <i class=\"fa fa-circle\"></i>\n");
      out.write("                                </li>\n");
      out.write("                                \n");
      out.write("                                <li>\n");
      out.write("                                    <span>Remove / Edit faculty</span>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <!-- END PAGE BAR -->\n");
      out.write("                        <!-- BEGIN PAGE TITLE-->\n");
      out.write("                        <h1 class=\"page-title\"> Remove Faculty\n");
      out.write("                            <small></small>\n");
      out.write("                        </h1>\n");
      out.write("                        <!-- END PAGE TITLE-->\n");
      out.write("                        <!-- END PAGE HEADER-->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <!-- BEGIN EXAMPLE TABLE PORTLET-->\n");
      out.write("                                <div class=\"portlet light portlet-fit bordered\">\n");
      out.write("                                    <div class=\"portlet-title\">\n");
      out.write("                                        <div class=\"caption\">\n");
      out.write("                                            <i class=\"icon-settings font-red\"></i>\n");
      out.write("                                            <span class=\"caption-subject font-red sbold uppercase\">Remove/Edit Faculty</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"portlet-body\">\n");
      out.write("                                        <div class=\"table-toolbar\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"btn-group\">\n");
      out.write("                                                      \n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                        \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <table class=\"table table-striped table-hover table-bordered\" id=\"sample_editable_1\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th> Name </th>\n");
      out.write("                                                    <th> Email Address </th>\n");
      out.write("                                                    <th> Designation </th>\n");
      out.write("                                                    <th> Department </th>\n");
      out.write("                                                    \n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            \n");
      out.write("                                             ");

                                                                try {
                                                                    Connection c=com.dbconnection.Loadconnection.getConnection();
                                                                     PreparedStatement ps = c.prepareStatement("select * from staff");
                                                                     
                                                                      int i=0;
                                                                     ResultSet rs=ps.executeQuery();
                                                                     while(rs.next())
                                                                                            
                                             { i++; 
      out.write(" \n");
      out.write("                                            <tbody>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td> ");
      out.print(rs.getString("name") );
      out.write("</td>\n");
      out.write("                                                    <td> ");
      out.print(rs.getString("email") );
      out.write(" </td>\n");
      out.write("                                                    <td> ");
      out.print(rs.getString("designation") );
      out.write("</td>\n");
      out.write("                                                    <td class=\"center\"> ");
      out.print(rs.getString("department") );
      out.write(" </td>\n");
      out.write("                                                   \n");
      out.write("                                                    \n");
      out.write("                                                    \n");
      out.write("                                                    \n");
      out.write("                                             <!--       <td>\n");
      out.write("                                                        <a class=\"edit\" href=\"javascript:;\"> Edit </a>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <a class=\"delete\" onclick=\"deleteRecord(");
      out.print(rs.getString(1));
      out.write(");\"> Remove </a>\n");
      out.write("                                                    </td>  -->\n");
      out.write("                                                </tr>\n");
      out.write("                                               \n");
      out.write("                                                 ");
}
                                                                }
                                                                catch(Exception e)
                                                                {
                                                                    out.println(e);
                                                                }
                                                                
      out.write("\n");
      out.write("                                              \n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- END EXAMPLE TABLE PORTLET-->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- END CONTENT BODY -->\n");
      out.write("                </div>\n");
      out.write("                <!-- END CONTENT -->\n");
      out.write("                <!-- BEGIN QUICK SIDEBAR -->\n");
      out.write("               \n");
      out.write("                <!-- END QUICK SIDEBAR -->\n");
      out.write("            </div>\n");
      out.write("            <!-- END CONTAINER -->\n");
      out.write("            <!-- BEGIN FOOTER -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer.jsp", out, false);
      out.write("\n");
      out.write("           <!-- END FOOTER -->\n");
      out.write("        </div>\n");
      out.write("             <!-- BEGIN QUICK NAV -->\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <!-- END QUICK NAV -->\n");
      out.write("        \n");
      out.write("        <!-- BEGIN CORE PLUGINS -->\n");
      out.write("        <script src=\"../assets/global/plugins/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../assets/global/plugins/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../assets/global/plugins/js.cookie.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../assets/global/plugins/jquery.blockui.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- END CORE PLUGINS -->\n");
      out.write("        <!-- BEGIN PAGE LEVEL PLUGINS -->\n");
      out.write("        <script src=\"../assets/global/scripts/datatable.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../assets/global/plugins/datatables/datatables.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- END PAGE LEVEL PLUGINS -->\n");
      out.write("        <!-- BEGIN THEME GLOBAL SCRIPTS -->\n");
      out.write("        <script src=\"../assets/global/scripts/app.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- END THEME GLOBAL SCRIPTS -->\n");
      out.write("        <!-- BEGIN PAGE LEVEL SCRIPTS -->\n");
      out.write("        <script src=\"../assets/pages/scripts/table-datatables-editable.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- END PAGE LEVEL SCRIPTS -->\n");
      out.write("        <!-- BEGIN THEME LAYOUT SCRIPTS -->\n");
      out.write("        <script src=\"../assets/layouts/layout/scripts/layout.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../assets/layouts/layout/scripts/demo.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../assets/layouts/global/scripts/quick-sidebar.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../assets/layouts/global/scripts/quick-nav.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- END THEME LAYOUT SCRIPTS -->\n");
      out.write("    <!-- Google Code for Universal Analytics -->\n");
      out.write("<script>\n");
      out.write("  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n");
      out.write("  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n");
      out.write("  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n");
      out.write("  })(window,document,'script','../../../../../www.google-analytics.com/analytics.js','ga');\n");
      out.write("  ga('create', 'UA-37564768-1', 'auto');\n");
      out.write("  ga('send', 'pageview');\n");
      out.write("</script>\n");
      out.write("<!-- End -->\n");
      out.write("\n");
      out.write("<!-- Google Tag Manager -->\n");
      out.write("<noscript><iframe src=\"http://www.googletagmanager.com/ns.html?id=GTM-W276BJ\"\n");
      out.write("height=\"0\" width=\"0\" style=\"display:none;visibility:hidden\"></iframe></noscript>\n");
      out.write("<script>(function(w,d,s,l,i){w[l]=w[l]||[];w[l].push({'gtm.start':\n");
      out.write("new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],\n");
      out.write("j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src=\n");
      out.write("'../../../../../www.googletagmanager.com/gtm5445.html?id='+i+dl;f.parentNode.insertBefore(j,f);\n");
      out.write("})(window,document,'script','dataLayer','GTM-W276BJ');</script>\n");
      out.write("<!-- End -->\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
