package com.car.rental.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;

import com.car.rental.db.service.RentalService;
import com.car.rental.model.User;

public class UserRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private RentalService rentalService;
    
    public UserRegistrationServlet() {
        super();
        rentalService = new RentalService();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		try {
			user.populateParametersFromRequest(request);
			rentalService.addUser(user);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
