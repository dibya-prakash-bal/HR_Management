import java.io.IOException;

import java.io.PrintWriter;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;



import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;



@WebServlet("/LeaveRequestServlet")

public class LeaveRequestServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;



    public LeaveRequestServlet() {

        super();

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	request.getRequestDispatcher("leave_request.jsp").forward(request, response);
    }
    

           
}

