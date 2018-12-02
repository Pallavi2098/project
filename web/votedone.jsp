<%-- 
    Document   : votedone
    Created on : Nov 27, 2018, 12:29:40 PM
    Author     : Pallavi (Shona)
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <font face="microsoft jhenghei">
    <br><br><br><br><br><br><br><br><center>
        you voted for
        <%
        
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
    
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
            String a=(String)session.getAttribute("Vid");
            String m1 = request.getParameter("PARTY");
            out.println(m1);
            out.println(a);
            
            
     
        //response.sendRedirect("main.jsp");
         {
            //String voterid = request.getParameter("a");
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            conn=DriverManager.getConnection("jdbc:mysql://localhost/sign?useSSL=false","root","pallavi20");
            //PreparedStatement stat=conn.prepareStatement("insert into vote values(?,?,?)");
            PreparedStatement stat=null;
         stat=conn.prepareStatement("insert into vote values(?,?)");
//            String sql=;
            stat.setString(1,a);
            stat.setString(2,m1);
            int count=stat.executeUpdate();
        }
        
            
        


        
        
        
        %>
        <h1>Thanks for voting !!!!!!!!!!!</h1>
    </center>
    </body>
</html>
