<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Home Page</title>

<style>
.container{
  width: 25%;
  border: 1px solid black;
  margin: auto;
  padding: 24px;
  font-size: 20px;
}

#myform table tr td input{
font-size: 20px;
}

</style>

</head>

<body>
	<h1>This is my first Dynamic Web Project</h1>
	<h3>
		<a href="serv"> Servlet (interface)</a>
	</h3>
	<h3>
		<a href="genserv"> GenericServlet (abstract class)</a>
	</h3>
	<h3>
		<a href="httpserv"> HttpServlet (class)</a>
	</h3>

	<div class="container">

		<h2>Registration Form</h2>

		<form id="myform" action="RegisterServlet" method="post">
			<table>
				<tr>
					<td>Full Name</td>
					<td><input type="text" name="full_name"
						placeholder="Enter Full Name"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email" placeholder="Enter Email"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"
						placeholder="Enter Password"></td>
				</tr>
				<tr>
					<td>Select Gender</td>
					<td><input type="radio" name="gender" value="male">Male
						&nbsp; &nbsp; <input type="radio" name="gender" value="female">Female</td>
				</tr>
				<tr>
					<td>Select Course</td>
					<td><select name="course">
							<option value="java">Java</option>
							<option value="python">Python</option>
							<option value="android">Android</option>
							<option value="flutter">Flutter</option>
					</select></td>
				</tr>
				<tr>
					<td style="text-align: right;"><input type="checkbox"
						value="checked" name="tnc"></td>
					<td>Agree Terms & Conditions</td>
				</tr>
				<tr>
					<td> </td>
					<td><button type="reset">Reset</button> <button type="submit">Register</button></td>
				</tr>
			</table>
		</form>
	</div>

<form action="Servlet1">
<h3> Request Dispatcher Example</h3>
<input type="number" name="n1" placeholder="First Number" >
<input type="number" name="n2" placeholder="Second Number" >
<button type="submit">Forward</button>
</form>

<form action="ServletA">
<h3> Session Tracking/Management Example</h3>
<input type="text" name="name" placeholder="Enter your name" >
<button type="submit">Go to Servlet A</button>

</form>


</body>

</html>