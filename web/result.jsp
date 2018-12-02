<%-- 
    Document   : result
    Created on : Dec 3, 2018, 12:52:38 AM
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
    <CENTER>
        <h1>RESULTS</h1>
        <%
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
                    %>
    <center>
        
  <table class="w3-table-all w3-card-4">
    
    <tr>
        
      <th>S.no</th>
      <th>VOTER DETAILS</th>
      <th>VOTE DETAILS</th>
      </tr>

                    <tr>
           
        
            <td>
                <% c++;
                    out.println(c); %>
            </td>
            <td>
    <%
                out.println(rs.getString("voter_name"));
                %>
    </td>
            <td>
                <%
                out.println(rs.getString("voter_profile"));
                }
                %>
            </td>
</tr>
                <%
                while(rs.next())
            {   
                
                 a=rs.getString("voter_name");
                 
                 %>
            

                <%
                 
                if(a!=null)
                {
                    c++;
                    %>
               

<tr>
            
           
        
            <td>
                <% out.println(c); %>
            </td>
      <td>

                <%
                out.println(a);
                %>
            </td>
            <td>
                <%
                out.println(rs.getString("voter_profile"));
                p=(rs.getString("voter_profile"));
               
%>
            </td>
        
        </tr>
                <%
                }
                }
%>
    
  </table>
     <%
}

            else 
            {
                 
                 %>
                NO VOTES
                 <%
                 st.close();
             
            
            }
%>


    </body>
</html>
