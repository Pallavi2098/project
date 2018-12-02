<%-- 
    Document   : Session
    Created on : Dec 2, 2018, 9:40:36 PM
    Author     : Pallavi (Shona)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(session!=null)
            {
                session.invalidate();
            }
            response.sendRedirect("index.html");
            %>
    </body>
</html>
