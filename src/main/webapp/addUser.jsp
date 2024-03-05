<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
</head>
<body>

	<form action="UserRegistrationServlet" method="post">

	    <label for="email">Email:</label>
	    <input type="email" name="email" required><br>
	
	    <label for="password">Password:</label>
	    <input type="password" name="password" required><br>
	
	    <label for="first_name">First Name:</label>
	    <input type="text" name="first_name"><br>
	
	    <label for="last_name">Last Name:</label>
	    <input type="text" name="last_name"><br>
	
	    <label for="date_of_birth">Date of Birth:</label>
	    <input type="date" name="date_of_birth"><br>
	
	    <label for="gender">Gender:</label>
	    <select name="gender">
	        <option value="Male">Male</option>
	        <option value="Female">Female</option>
	        <option value="Other">Other</option>
	    </select><br>
	
	    <label for="address">Address:</label>
	    <input type="text" name="address"><br>
	    
	    <label for="city">Address:</label>
	    <input type="text" name="city"><br>
	    
	    <label for="province">Province:</label>
	    <select name="province">
	        <option value="Alberta">Alberta</option>
	        <option value="BritishColumbia">British Columbia</option>
	        <option value="Manitoba">Manitoba</option>
	        <option value="NewBrunswick">New Brunswick</option>
	        <option value="NewfoundlandAndLabrador">Newfoundland and Labrador</option>
	        <option value="NovaScotia">Nova Scotia</option>
	        <option value="Ontario">Ontario</option>
	        <option value="PrinceEdwardIsland">Prince Edward Island</option>
	        <option value="Quebec">Quebec</option>
	        <option value="Saskatchewan">Saskatchewan</option>
	    </select><br>
	    
	    <label for="postalcode">Postal Code:</label>
	    <input type="text" name="postalcode"><br>
	
	    <label for="phone_number">Phone Number:</label>
	    <input type="tel" name="phone_number" maxlength="15"><br>
	    
	    <label for="driverlicence">Driver Licence</label>
	    <input type="text" name="driverlicence" maxlength="8"><br>
	    
	    <label for="licenceclass">Licence Class:</label>
	    <select name="licenceclass">
	        <option value="G1">G1</option>
	        <option value="G2">G2</option>
	        <option value="G">G</option>
	    </select><br>
	
	    <input type="submit" value="Register">
	</form>

</body>
</html>