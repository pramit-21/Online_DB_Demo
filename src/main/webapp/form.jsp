<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Event Registration</title>
</head>

<body style="background-color: antiquewhite;">

<center>

<div style="background-color: darkblue;
            padding: 30px;
            border-radius: 10px;
            width: 400px;
            box-shadow: 0px 0px 10px gray;
            font-family: Arial;
            color: darkturquoise;">

<h1><u>Event Registration Form</u></h1>

<br>

<h2>

<form method="POST" action="EventServlet" style="text-align: left;">

<label>Full Name:</label>
<input type="text"
       name="name"
       placeholder="Enter Full Name"
       style="height: 30px; width: 400px;">
<br><br>

<label>Email Address:</label>
<input type="email"
       name="email"
       placeholder="Enter your E-mail"
       style="height: 30px; width: 400px;">
<br><br>

<label>Phone Number:</label>
<input type="number"
       name="phone"
       placeholder="Enter your Phone Number"
       style="height: 30px; width: 400px;">
<br><br>

<label>Event:</label>
<input type="text"
       name="event_select"
       placeholder="Enter your Event"
       style="height: 30px; width: 400px;">
<br><br>

<center>
<input type="submit"
       name="submit"
       value="SUBMIT"
       style="height: 30px;
              width: 150px;
              text-align: center;">
</center>

</form>

</h2>

</div>

</center>

</body>
</html>



