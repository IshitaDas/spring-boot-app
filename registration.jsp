<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Registration</title>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- 
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  -->  
  <link rel="stylesheet" type="text/css" href="/style/style.css"> 
</head>
<body>
  <div id="main">
    <div class="backimg"></div>
  </div>
  <header><h1>REGISTRATION</h1></header>
  <div id="loginRegister">
	<form action="register.jsp" method="post">
	  <input type="text" id="emp_fname" class="shortFields" placeholder="First Name" autofocus required/>
	  <input type="text" id="emp_mname" class="shortFields" placeholder="Middle Name" required/>
	  <input type="text" id="emp_lname" class="shortFields" placeholder="Last Name" required/> <br />
	  <input type="password" id="emp_pwd" class="midwidthFields" placeholder="Password" required/>
	  <input type="password" id="confirmpwd" class="midwidthFields" placeholder="Confirm Password" required/> <br />
	  <input type="number" id="mobile" class="midwidthFields" placeholder="Mobile Number" min="9000000000" max="9999999999" required/>
	  <input type="number" id="extension" class="midwidthFields" placeholder="Extension" min="4000" max="99999" required/> <br />
	  <input type="email" id="email" class="largeFields" placeholder="Fiserv Email Id" required/> <br />
	  <input type="date" id="joining_dt" class="largeFields" placeholder="Date Of Joining" required/><br />
	  <input type="submit" class="btn-primary" value="Register"/> 
	</form>  
  </div>
</body>
</html>