package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class alogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("* {box-sizing:border-box}\n");
      out.write("body {font-family: Verdana,sans-serif;}\n");
      out.write(".mySlides {display:none}\n");
      out.write("\n");
      out.write("/* Slideshow container */\n");
      out.write(".slideshow-container {\n");
      out.write("  max-width: 1350px;\n");
      out.write("  position: relative;\n");
      out.write("  margin: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Caption text */\n");
      out.write(".text {\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  font-size: 15px;\n");
      out.write("  padding: 8px 12px;\n");
      out.write("  position: absolute;\n");
      out.write("  bottom: 8px;\n");
      out.write("  width: 100%;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Number text (1/3 etc) */\n");
      out.write(".numbertext {\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  font-size: 12px;\n");
      out.write("  padding: 8px 12px;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The dots/bullets/indicators */\n");
      out.write(".dot {\n");
      out.write("  height: 13px;\n");
      out.write("  width: 13px;\n");
      out.write("  margin: 0 2px;\n");
      out.write("  background-color: #bbb;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  display: inline-block;\n");
      out.write("  transition: background-color 0.6s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".active {\n");
      out.write("  background-color: #717171;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Fading animation */\n");
      out.write(".fade {\n");
      out.write("  -webkit-animation-name: fade;\n");
      out.write("  -webkit-animation-duration: 1.5s;\n");
      out.write("  animation-name: fade;\n");
      out.write("  animation-duration: 1.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes fade {\n");
      out.write("  from {opacity: .4} \n");
      out.write("  to {opacity: 1}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes fade {\n");
      out.write("  from {opacity: .4} \n");
      out.write("  to {opacity: 1}\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* On smaller screens, decrease text size */\n");
      out.write("@media only screen and (max-width: 300px) {\n");
      out.write("  .text {font-size: 11px}\n");
      out.write("}\n");
      out.write("body\n");
      out.write("{\n");
      out.write("background-image:url(\"ps.jpg\");\n");
      out.write("background-size:1800px 500px;\n");
      out.write("background-attachment:fixed;\n");
      out.write("background-position:center;\n");
      out.write("background-repeat:no-repeat;\n");
      out.write("}\n");
      out.write("ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("    display: block;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover {\n");
      out.write("    background-color: #111;\n");
      out.write("}\n");
      out.write(".s\n");
      out.write("{\n");
      out.write("margin-left:1150px;\n");
      out.write("margin-right:0px;\n");
      out.write("}\n");
      out.write(".xxx\n");
      out.write("{\n");
      out.write("background-color:#21618C;\n");
      out.write("}\n");
      out.write("table {\n");
      out.write("    width:100%;\n");
      out.write("}\n");
      out.write("table, th, td {\n");
      out.write("    border: 1px #21618C;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("}\n");
      out.write("th, td {\n");
      out.write("    padding: 15px;\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write(".abc\n");
      out.write("{\n");
      out.write("margin-left:400px;\n");
      out.write("margin-right:200px;\n");
      out.write("margin-top:50px;\n");
      out.write("margin-bottom:50px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");

            
            try{
            String user = request.getParameter("Vid");
            String pass = request.getParameter("pass");
            
            String myurl="jdbc:mysql://localhost/project";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sign?useSSL=false","root","pallavi20");
                Statement st=conn.createStatement();
                String query1="select * from admin where vid='"+user+"' and p='"+pass+"'";
                ResultSet rs=st.executeQuery(query1);
                
            if(rs.next())
            {    
            //session.setAttribute("user", user);
            //response.sendRedirect("adminpage.html");
            //String name=rs.getString("name");
            
      out.write("\n");
      out.write("       \n");
      out.write("            <h1>Welcome ");
out.println("Admin");
      out.write("</h1>\n");
      out.write("            <center><b><font size=\"25%\" face=\"microsoft jhenghei\" color=\"#212F3C\">Online Voting System</font></b></center>\n");
      out.write("<br>\n");
      out.write("<ul>\n");
      out.write("  <li><a class=\"active\" href=\"home.html\">Home</a></li>\n");
      out.write("  <li><a href=\"contact.html\">Candidates Profile</a></li>\n");
      out.write("<li><a href=\"result.jsp\">Results</a></li>\n");
      out.write("<div class=\"s\">\n");
      out.write("    <li><a href=\"Session.jsp\">Logout</a></li></div>\n");
      out.write("</ul>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div class=\"slideshow-container\">\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">1 / 5</div>\n");
      out.write("  <img src=\"images\\images.jpg\" WIDTH=1330 HEIGHT=500>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">2 / 5</div>\n");
      out.write("  <img src=\"images\\image1.jpg\" WIDTH=1330 HEIGHT=500>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">3 / 5</div>\n");
      out.write("  <img src=\"images\\image2.jpg\" WIDTH=1330 HEIGHT=500>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">4 / 5</div>\n");
      out.write("  <img src=\"images\\image3.jpg\" WIDTH=1330 HEIGHT=500>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style=\"text-align:center\">\n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var slideIndex = 0;\n");
      out.write("showSlides();\n");
      out.write("\n");
      out.write("function showSlides() {\n");
      out.write("    var i;\n");
      out.write("    var slides = document.getElementsByClassName(\"mySlides\");\n");
      out.write("    var dots = document.getElementsByClassName(\"dot\");\n");
      out.write("for (i = 0; i < slides.length; i++) {\n");
      out.write("       slides[i].style.display = \"none\";  \n");
      out.write("    }\n");
      out.write("     slideIndex++;\n");
      out.write("if (slideIndex> slides.length) {slideIndex = 1}    \n");
      out.write("       for (i = 0; i < dots.length; i++) {\n");
      out.write("        dots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("    \n");
      out.write("    }\n");
      out.write("    slides[slideIndex-1].style.display = \"block\";  \n");
      out.write("    dots[slideIndex-1].className += \" active\";\n");
      out.write("    setTimeout(showSlides, 2000); // Change image every 2 seconds\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        \n");

            }
            else 
            {
                 
                 out.println("<script>alert('not found , login Again')</script>");
               response.sendRedirect("alogin.html");
                
                 st.close();
             
            
            }
}
            catch(Exception e)
            {
                System.err.println("got an exception");
                System.err.println(e.getMessage());
            }
   
        
      out.write("            \n");
      out.write("            \n");
      out.write("                </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
