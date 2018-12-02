import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
public class sign extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
    
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       response.sendRedirect("login.html");
        try (PrintWriter out = response.getWriter()) {
            String f = request.getParameter("fname");
            String l = request.getParameter("lname");
            String a = request.getParameter("Aid");
            String v = request.getParameter("vid");
            String p = request.getParameter("password");
            String pr = request.getParameter("confirm");
            
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            conn=DriverManager.getConnection("jdbc:mysql://localhost/sign?useSSL=false","root","pallavi20");
            //PreparedStatement stat=conn.prepareStatement("insert into location values(?)");
            PreparedStatement stat=null;
            stat=conn.prepareStatement("insert into s values(?,?,?,?,?,?)");
//            String sql=;
            //stat.setString(1,loc);
            stat.setString(1,f);
            stat.setString(2,l);
            stat.setString(3,a);
            stat.setString(4,v);
            stat.setString(5,p);
            stat.setString(6,pr);
            int count=stat.executeUpdate();
            out.println("welocome "+l);
            if(count==1)
            {
                out.println("welcome "+f+" "+l);
            }
            else
            {
                out.println("not successful");
            }
        }
 catch(Exception e)
                {
                    System.out.println(e);
                }
            
        }
    }