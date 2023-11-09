import java.io.IOException;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.text.DecimalFormat;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;



@WebServlet("/salaryservlet")

public class salaryservlet extends HttpServlet {

    private static final long serialVersionUID = 1L;



    public salaryservlet() {

        super();

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        String name = request.getParameter("name");

        String salary = request.getParameter("salary");

        String month = request.getParameter("month");

        



        Connection connection = null;

        PreparedStatement preparedStatement = null;



        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String jdbcURL = "jdbc:mysql://localhost:3306/hr";

            String jdbcUsername = "root";

            String jdbcPassword = "root";



            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

            String insertSQL = "INSERT INTO salary (name, salary, month) VALUES (?, ?, ?)";



            preparedStatement = connection.prepareStatement(insertSQL);

            preparedStatement.setString(1, name);

            preparedStatement.setString(2, salary);

            preparedStatement.setString(3, month);

           


            int rowsAffected = preparedStatement.executeUpdate();



            if (rowsAffected > 0) {

                // Employee data was successfully inserted

                response.sendRedirect("admin_dashboard.jsp");

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

