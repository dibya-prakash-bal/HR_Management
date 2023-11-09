import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
		try {
		PrintWriter out=response.getWriter();
			String name = request.getParameter("uname");
			String email = request.getParameter("email");
			
			String password=request.getParameter("password");
			
			 Class.forName("com.mysql.cj.jdbc.Driver");

	            // Database connection details
	            String jdbcURL = "jdbc:mysql://localhost:3306/login";
	            String jdbcUsername = "root";
	            String jdbcPassword = "root";

	            // Establish the database connection
	            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
	            String insertSQL = "INSERT INTO user (name,email, password,role) VALUES (?, ?, ?,?)";
	            
	           
	            preparedStatement = connection.prepareStatement(insertSQL);
	            preparedStatement.setString(1, name);
	            preparedStatement.setString(2, email);
	           
	            preparedStatement.setString(3, password);
	           
	            preparedStatement.setString(4, "user");
	            // Execute the insert statement
	            int rowsAffected = preparedStatement.executeUpdate();
	            	
	            if (rowsAffected > 0) {
	            	RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
	            	rd.forward(request, response);
	            } else {
	                out.println("User registration failed.");
	            }

			}catch(Exception e) {
				System.out.println(e);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}