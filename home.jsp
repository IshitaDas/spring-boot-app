<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"><meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" type="text/css" href="/style/style.css">  
  <title>Home</title>
</head>
<body>
  <div id="main">
    <div class="backimg"></div>
  </div>
  <div id="loginHeader">
     <div id="HeaderLeft">Hello, ${empHomeDetail.empName}, Last Logged on : ${empHomeDetail.lastLoggedDtTm}</div>
	 <div id="HeaderRight"><a href="/logout" target="_self">Logout</a></div>
  </div>
  
  <div id="section">
    <div id="Notification">
	  <h1>Notification</h1>
	  <div id="sectionBody">
		<table>
	      <tr> 
			<th>Leave Start</th>
			<th>Leave End</th>
			<th>Day(s)</th>
			<th>Status</th>
		  </tr>
		  <tr>		
			<td>${empHomeDetail.currentLeaveSt}</td>
			<td>${empHomeDetail.currentLEaveEnd}</td>
			<td>1</td>
			<td>Approved Pending</td>
		  </tr>
		</table>	  
	  </div>	
	</div>
	<div id="CurrentSection">
      <h1>Leaves</h1>
	  <div id="sectionBody">
	  <table>
	    <tr> 
		  <th>S.No.</th>
		  <th>Start Date</th>
		  <th>End Date</th>
		  <th>Day(s)</th>
		</tr>
        <tr>		
		  <td>1.</td>
		  <td>20th April 2018</td>
		  <td>20th April 2018</td>
		  <td>1</td>
	    </tr>
	  </table>
	  </div>
	</div>
	<div id="PastSection">
	  <h1>Previous Month's Leaves</h1>
	  <div id="sectionBody">
	  <table>
	    <tr> 
		  <th>S.No.</th>
		  <th>Start Date</th>
		  <th>End Date</th>
		  <th>Day(s)</th>
		</tr>
        <tr>		
		  <td>1.</td>
		  <td>20th March 2018</td>
		  <td>20th March 2018</td>
		  <td>1</td>
	    </tr>
	  </table>
	  </div>
	</div>
	<div id="FutureSection">
	  <h1>Upcoming Leaves</h1>
	  <div id="sectionBody">
	  <table>
	    <tr> 
		  <th>S.No.</th>
		  <th>Start Date</th>
		  <th>End Date</th>
		  <th>Day(s)</th>
		</tr>
        <tr>		
		  <td>1.</td>
		  <td>20th June 2018</td>
		  <td>20th June 2018</td>
		  <td>1</td>
	    </tr>
	  </table>
	  </div>
	</div>			
  </div>
  <div id="OptionsBar">
    <ul>
	  <li><a href=".\home.html" target="_blank"><div class="circle1"><p>Day-Off</p></div></a></li>
	  <li><a href=".\home.html" target="_blank"><div class="circle2"><p>Leave Tracker</p></div></a></li>
	  <li><a href=".\home.html" target="_blank"><div class="circle1"><p>BL Checklist</p></div></a></li>
	  <li><a href=".\home.html" target="_blank"><div class="circle2"><p>Approve Leaves</p></div></a></li>
	  <li><a href=".\home.html" target="_blank"><div class="circle1"><p>Unblock A/C</p></div></a></li>
	  <!--<li><a href="/TEST6" target="_blank"><div class="circle2"></div></a></li>-->
	</ul>	
  </div>

</body>
</html>