

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class leaveservlet
 */
@WebServlet("/leaveservlet")
public class leaveservlet extends HttpServlet {
	 private static final long serialVersionUID = 1L;



	    public leaveservlet() {

	        super();

	    }



	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    

	            throws ServletException, IOException {
	    	

	        String name = request.getParameter("name");

	        String phone = request.getParameter("phone");

	        String startdate = request.getParameter("startdate");

	        String enddate = request.getParameter("enddate");
	        
	        String reason = request.getParameter("reason");



	        Connection connection = null;

	        PreparedStatement preparedStatement = null;



	        try {

	            Class.forName("com.mysql.cj.jdbc.Driver");

	            String jdbcURL = "jdbc:mysql://localhost:3306/hr";

	            String jdbcUsername = "root";

	            String jdbcPassword = "root";



	            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

	            String insertSQL = "INSERT INTO leaver (name, phone, startdate, enddate, reason) VALUES (?, ?, ?, ?,?)";



	            preparedStatement = connection.prepareStatement(insertSQL);

	            preparedStatement.setString(1, name);

	            preparedStatement.setString(2, phone);

	            preparedStatement.setString(3, startdate);

	            preparedStatement.setString(4, enddate);
	            
	            preparedStatement.setString(5, reason);



	            int rowsAffected = preparedStatement.executeUpdate();



	            if (rowsAffected > 0) {

	                // Employee data was successfully inserted

	                response.sendRedirect("employee_dashboard.jsp");

	            } else {

	                // Insertion failed, you can handle this case as needed

	                response.getWriter().println("Employee registration failed.");

	            }

	        } catch (Exception e) {

	            e.printStackTrace();

	        } finally {

	            try {

	                if (preparedStatement != null) {

	                    preparedStatement.close();

	                }

	                if (connection != null) {

	                    connection.close();

	                }

	            } catch (SQLException e) {

	                e.printStackTrace();

	            }

	        }

	    }

	}

