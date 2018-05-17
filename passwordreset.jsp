<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Reset Password</title>
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
  <header><h1>RESET PASSWORD</h1></header>
  <div id="passwordReset">
	<form action="register.jsp" method="post">
	  <input type="text" id="emp_id" class="midwidthFields" placeholder="Employee ID/Username" autofocus required/> <br />
	  <input type="password" id="emp_pwd" class="midwidthFields" placeholder="Password" required/><br />
	  <input type="password" id="confirmpwd" class="midwidthFields" placeholder="Confirm Password" required/> <br />
	  <input type="submit" class="btn-primary" value="Update"/> 
	</form>  
  </div>
</body>
</html>