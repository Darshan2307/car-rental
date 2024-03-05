package com.car.rental.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.car.rental.enums.Gender;
import com.car.rental.enums.LicenceClass;
import com.car.rental.enums.Province;

import jakarta.servlet.http.HttpServletRequest;

public class User {

	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Gender gender;
	private String address;
	private String postalCode;
	private String city;
	private Province province;
	private String phoneNumber;
	private String driverLicence;
	private LicenceClass licenceClass;
	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public Province getProvince() {
		return province;
	}
	
	public void setProvince(Province province) {
		this.province = province;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getDriverLicence() {
		return driverLicence;
	}
	
	public void setDriverLicence(String driverLicence) {
		this.driverLicence = driverLicence;
	}
	
	public LicenceClass getLicenceClass() {
		return licenceClass;
	}
	
	public void setLicenceClass(LicenceClass licenceClass) {
		this.licenceClass = licenceClass;
	}

	public void populateParametersFromRequest(HttpServletRequest request) throws ParseException {
		email = request.getParameter("email");
		password = request.getParameter("password");
		firstName = request.getParameter("first_name");
		lastName = request.getParameter("last_name");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		birthDate = format.parse(request.getParameter("date_of_birth"));
		gender = Gender.valueOf(request.getParameter("gender"));
		address = request.getParameter("address");
		city = request.getParameter("city");
		province = Province.valueOf(request.getParameter("province"));
		postalCode = request.getParameter("postalcode");
		phoneNumber = request.getParameter("phone_number");
		driverLicence = request.getParameter("driverlicence");
		licenceClass = LicenceClass.valueOf(request.getParameter("licenceclass"));
		
	}
	
}
