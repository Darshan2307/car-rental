package com.car.rental.db.service;

import java.sql.ResultSet;

import com.car.rental.db.dao.RentalDAO;
import com.car.rental.model.User;
import com.car.rental.model.UserLogin;

public class RentalService {
	
	private RentalDAO rentalDAO;
	
	public RentalService() {
		rentalDAO = new RentalDAO();
	}

	public void addUser(User user) {
		rentalDAO.addUser(user);
	}

	public String userAuthentication(UserLogin userLogin) {
		return rentalDAO.userAuthentication(userLogin);
		
	}
	

}
