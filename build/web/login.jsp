<%-- 
    Document   : login
    Created on : Nov 26, 2018, 3:45:48 PM
    Author     : Pallavi (Shona)
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        <meta name="viewport" content="width=device-width, initial-scale=1">

* {box-sizing:border-box}
body {font-family: Verdana,sans-serif;}
.mySlides {display:none}

/* Slideshow container */
.slideshow-container {
  max-width: 1350px;
  position: relative;
  margin: auto;
}

/* Caption text */
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

/* The dots/bullets/indicators */
.dot {
  height: 13px;
  width: 13px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active {
  background-color: #717171;
}

/* Fading animation */
.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

/* On smaller screens, decrease text size */
@media only screen and (max-width: 300px) {
  .text {font-size: 11px}
}
body
{
background-image:url("ps.jpg");
background-size:1800px 500px;
background-attachment:fixed;
background-position:center;
background-repeat:no-repeat;
}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111;
}
.s
{
margin-left:1150px;
margin-right:0px;
}
.xxx
{
background-color:#21618C;
}
table {
    width:100%;
}
table, th, td {
    border: 1px #21618C;
    border-collapse: collapse;
}
th, td {
    padding: 15px;
    text-align: left;
}
.abc
{
margin-left:400px;
margin-right:200px;
margin-top:50px;
margin-bottom:50px;
}

    </style>
    <body>
        
<%
                    
    String a=(String)session.getAttribute("Vid");
            try{
            String user = request.getParameter("Vid");
            String pass = request.getParameter("pass");
    session.setAttribute("Vid",user);        
            String myurl="jdbc:mysql://localhost/project";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sign?useSSL=false","root","pallavi20");
                Statement st=conn.createStatement();
                String query1="select * from s where vid='"+user+"' and p='"+pass+"'";
                ResultSet rs=st.executeQuery(query1);
                
            if(rs.next())
            {    
            //session.setAttribute("user", user);
            //response.sendRedirect("student.html");
            //String name=rs.getString("name");
            %>
       
            <h1>Welcome <%out.println("Student");%></h1>
            
        
<%
            }
            else 
            {
                 
                 out.println("<script>alert('not found , go back to login page')</script>"
+ "<html>hello</html>");
                
                 st.close();
             
            
            }
}
            catch(Exception e)
            {
                System.err.println("got an exception");
                System.err.println(e.getMessage());
            }
   
        %>            
             <center><b><font size="25%" face="microsoft jhenghei" color="#212F3C">Online Voting System</font></b></center>
<br>
<ul>
  <li><a class="active" href="index.html">Home</a></li>
  <li><a href="contact.html">Candidate Profile</a></li>
  <li><a href="vote.jsp">Vote</a></li>
<li><a href="#">Propogandas of Candidates</a></li>
<div class="s">
    <li><a href="Session.jsp">Logout</a></div>
</ul>
<br>
<br>
<br>
<div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 5</div>
  <img src="images\images.jpg" WIDTH=1330 HEIGHT=500>
</div>

<div class="mySlides fade">
  <div class="numbertext">2 / 5</div>
  <img src="images\image1.jpg" WIDTH=1330 HEIGHT=500>
 
</div>

<div class="mySlides fade">
  <div class="numbertext">3 / 5</div>
  <img src="images\image2.jpg" WIDTH=1330 HEIGHT=500>
  
</div>

<div class="mySlides fade">
  <div class="numbertext">4 / 5</div>
  <img src="images\image3.jpg" WIDTH=1330 HEIGHT=500>
  
</div>
</div>
</div>

<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>

<script>
var slideIndex = 0;
showSlides();

function showSlides() {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    var dots = document.getElementsByClassName("dot");
for (i = 0; i < slides.length; i++) {
       slides[i].style.display = "none";  
    }
     slideIndex++;
if (slideIndex> slides.length) {slideIndex = 1}    
       for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", "");
    
    }
    slides[slideIndex-1].style.display = "block";  
    dots[slideIndex-1].className += " active";
    setTimeout(showSlides, 2000); // Change image every 2 seconds
}
</script>
<br>
<br>

                </body>
</html>


