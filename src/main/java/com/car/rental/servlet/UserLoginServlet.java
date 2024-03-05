package com.car.rental.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.car.rental.db.service.RentalService;
import com.car.rental.model.UserLogin;


public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RentalService rentalService;
       
   
    public UserLoginServlet() {
        super();
        rentalService = new RentalService();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserLogin userLogin = new UserLogin(request.getParameter("email"), request.getParameter("password"));
		
		String email= rentalService.userAuthentication(userLogin);
		
		if(email != null) {
			HttpSession session = request.getSession();
			session.setAttribute("username", email);
			response.sendRedirect("index.jsp");
		}
		
		
	}

}
