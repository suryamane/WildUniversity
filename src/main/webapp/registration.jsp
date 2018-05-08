<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<style type="text/css">
input[type="text"]{
margin-bottom:20px;
box-shadow: 0 0 10px rgba(0, 0, 0, .3);
 -moz-border-radius: 15px;
 border-radius: 5px;
    border:solid 0.5px grey; 
    padding:5px;
}
 form{
	text-align:center;
	display: block;
	width: 300px;
	margin:20px auto;
	box-shadow: 0 0 10px rgba(0, 0, 0, .3);
	padding: 20px;
	height: 400px;
	border:1px solid white;
	border-radius:5px;
	
}
hr{
margin-bottom:50px;
}

</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<form id="Create" action="controllerServlet" method="get">
	<h1> Register</h1>
	<hr>
		<br>
		<input type="text" placeholder="University Number" name="uid"><br>
		<input type="text" placeholder="Gender" name="gender"><br>
		<input type="text" placeholder="Name" name="name"><br>
		 <input type="hidden" name="action" value="addStudent"> 
		<!-- <a href="controllerServlet?action=addStudent"> -->
		<input type="submit" value="Submit">
	<!-- 	</a> -->
		<a href="controllerServlet?action=cancelRegistration"> 
		<input type="button" value="Cancel">
		</a>
		
	
	</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>