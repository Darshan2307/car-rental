package com.car.rental.db.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.car.rental.db.util.DatabaseUtil;
import com.car.rental.model.User;
import com.car.rental.model.UserLogin;

public class RentalDAO {

	public boolean addUser(User user) {
		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement("INSERT INTO users(email, password, first_name, last_name, date_of_birth, gender, address, postal_code, city, province, phone, driver_licence, licence_class) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) 
		{
			ps.setString(1, user.getEmail());
			ps.setString(2, user.getPassword());
			ps.setString(3,  user.getFirstName());
			ps.setString(4, user.getLastName());
			ps.setDate(5, new java.sql.Date(user.getBirthDate().getTime()));
			ps.setString(6, user.getGender().name());
			ps.setString(7, user.getAddress());
			ps.setString(8, user.getPostalCode());
			ps.setString(9,  user.getCity());
			ps.setString(10, user.getProvince().name());
			ps.setString(11, user.getPhoneNumber());
			ps.setString(12, user.getDriverLicence());
			ps.setString(13, user.getLicenceClass().name());
			if(ps.executeUpdate() == 1) {
				return true;
			}
			else {
				return false;
			}
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return false;
		
	}

	public String userAuthentication(UserLogin userLogin) {
		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement("select * from users where email = ? and password = ?")) 
		{
			ps.setString(1, userLogin.getEmail());
			ps.setString(2, userLogin.getPassword());
			
			ResultSet rs = ps.executeQuery();
			if(rs == null) {
				return null;
			}
			else {
				return userLogin.getEmail();
			}
			
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return null;
	}

}
