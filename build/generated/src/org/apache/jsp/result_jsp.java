package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <CENTER>\n");
      out.write("        <h1>RESULTS</h1>\n");
      out.write("        ");

             String myurl="jdbc:mysql://localhost/project";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sign?useSSL=false","root","pallavi20");
                Statement st=conn.createStatement();
                String query1="select * from vote";
                ResultSet rs=st.executeQuery(query1);
                String a;
                String b;
                int c=0;
                int total=0;
                String p;
                int price=0;
                if(rs.next())
 

 
                {
                    b=rs.getString("voter_name");
                    if(b!=null)
                    {
                    
      out.write("\n");
      out.write("    <center>\n");
      out.write("        \n");
      out.write("  <table class=\"w3-table-all w3-card-4\">\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("        \n");
      out.write("      <th>S.no</th>\n");
      out.write("      <th>VOTER DETAILS</th>\n");
      out.write("      <th>VOTE DETAILS</th>\n");
      out.write("      </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("           \n");
      out.write("        \n");
      out.write("            <td>\n");
      out.write("                ");
 c++;
                    out.println(c); 
      out.write("\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("    ");

                out.println(rs.getString("voter_name"));
                
      out.write("\n");
      out.write("    </td>\n");
      out.write("            <td>\n");
      out.write("                ");

                out.println(rs.getString("voter_profile"));
                }
                
      out.write("\n");
      out.write("            </td>\n");
      out.write("</tr>\n");
      out.write("                ");

                while(rs.next())
            {   
                
                 a=rs.getString("voter_name");
                 
                 
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("                ");

                 
                if(a!=null)
                {
                    c++;
                    
      out.write("\n");
      out.write("               \n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("        \n");
      out.write("            <td>\n");
      out.write("                ");
 out.println(c); 
      out.write("\n");
      out.write("            </td>\n");
      out.write("      <td>\n");
      out.write("\n");
      out.write("                ");

                out.println(a);
                
      out.write("\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                ");

                out.println(rs.getString("voter_profile"));
                p=(rs.getString("voter_profile"));
               

      out.write("\n");
      out.write("            </td>\n");
      out.write("        \n");
      out.write("        </tr>\n");
      out.write("                ");

                }
                }

      out.write("\n");
      out.write("    \n");
      out.write("  </table>\n");
      out.write("     ");

}

            else 
            {
                 
                 
      out.write("\n");
      out.write("                NO VOTES\n");
      out.write("                 ");

                 st.close();
             
            
            }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
