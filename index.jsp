<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"><meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 
 <!-- 
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  -->
 
 <link rel="stylesheet" type="text/css" href="/style/style.css">  
 <title>Login</title>
 
</head>
<body>
<div id="main">
    <div class="backimg"></div>
  </div>
  <header><h1>BEFORE LEAVE CHECKLIST</h1></header>
  <div id="loginBlock">
	<img src="/images/login.png" alt="Login" id="login" />
	
	<form action="/submitlogin" method="post" modelAttribute="user">
	  <input type="text" id="userName" name="userName" class="fields" placeholder="Employee ID/Username" autofocus required/> <br />
	  <input type="password" id="password" name="password" class="fields" placeholder="Password" required/> <br />
	  <input type="submit" class="btn-primary" value="Login"/> <br /><br />
	</form>  
	<p>${loginError}</p>  
	
	<a href="/registration" target="_blank">Register</a>&nbsp; || &nbsp;
	<a href="/passwordreset" target="_blank">Forgot Password</a>	    	
  </div>
</body>
</html>

<!-- Thyme Leaf --- 
<!Doctype html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
  <title>Login</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  
  
 
  <link rel="stylesheet" type="text/css" th:href="@{/style/style.css}" href="/style/style.css">  
  <script>
    function empRegister() {
       location.href = "registration.html";
    }
	/*function setBorder(uname){
	  uname.style.border='7px';
	}*/
  </script>
</head>
<body>
  <div id="main">
    <div class="backimg"></div>
  </div>
  <header><h1>BEFORE LEAVE CHECKLIST</h1></header>
  <div id="loginBlock">
	<img th:src="@{/images/login.png}" alt="Login" id="login" />
	<form action="login.jsp" method="post">
	  <input type="text" id="username" class="fields" placeholder="Employee ID/Username" autofocus required/> <br />
	  <input type="password" id="password" class="fields" placeholder="Password" required/> <br />
	  <input type="submit" class="btn-primary" value="Login"/> <br /><br />
	  <input type="button" id="register" class="buttons" value="Register" onClick="empRegister()"/>
	  <a th:href="@{/registration(action='registration')}" href="/registration?action=registration" target="_blank">Sign Up</a>
	  <a href="/registration" target="_blank">Register</a>&nbsp; || &nbsp;
	  <a href="/passwordreset" target="_blank">Forgot Password</a>	    
	</form>  
  </div>
<body>
</html> -->