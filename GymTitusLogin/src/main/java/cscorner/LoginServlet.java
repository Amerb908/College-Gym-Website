package cscorner;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out=response .getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentlogin","root","10208734Aejp@");
			String n=request.getParameter("uname");
			String p=request.getParameter("psw");
			PreparedStatement ps=con.prepareStatement("select uname from login where uname=? and password=?");
			ps.setString(1, n);
			ps.setString(2, p);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				RequestDispatcher rd=request.getRequestDispatcher("homePage.html"); //Will replace with main page when it is ready
				rd.forward(request, response);
				
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("loginInvalid.html"); //Will replace with main page when it is ready
				rd.forward(request, response);
			    
			}
		} catch (ClassNotFoundException e) {
			
			
		} catch (SQLException e) {
			
	
		}
		
	}

}
