package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.db.DBConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/EventServlet")
public class EventServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
	        HttpServletResponse response)
	        throws ServletException, IOException {

	    String name = request.getParameter("name");
	    String email = request.getParameter("email");
	    String phone = request.getParameter("phone");
	    String event = request.getParameter("event_select");

	    // PHONE VALIDATION
	    if(phone == null || !phone.matches("[0-9]{10}")) {

	        response.getWriter().println(
	            "<h2 style='color:red; text-align:center;'>Invalid Phone Number</h2>"
	        );

	        return;
	    }

	    try {

	        Connection con = DBConnection.getConnection();

	        String query = "INSERT INTO registration(name,email,phone,event_select) VALUES(?,?,?,?)";

	        PreparedStatement ps = con.prepareStatement(query);

	        ps.setString(1, name);
	        ps.setString(2, email);
	        ps.setString(3, phone);
	        ps.setString(4, event);

	        int i = ps.executeUpdate();

	        if(i > 0) {

	            response.sendRedirect("success.jsp");

	        } else {

	            response.sendRedirect("error.jsp");

	        }

	    } catch (Exception e) {

	        e.printStackTrace();
	        response.sendRedirect("error.jsp");

	    }
	}
}
