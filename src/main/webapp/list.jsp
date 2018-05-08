<%@ page language="java" import = "java.util.List,com.university.bean.Student" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Of Students</title>
<style type="text/css">
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
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
    box-shadow: 0 0 10px rgba(0, 0, 0, .3);
}
th, td {
   padding: 5px;
}
th {
    text-align: left;
}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<form >
		<h1>List Of Students</h1>
		<hr>
		<br>
		<table style="width: 100%">
			<tr>
				<th>UniversityNumber</th>
				<th>Gender</th>
				<th>Name</th>
			</tr>
			<%
			List<Student> student=(List)application.getAttribute("studentData");
			for(Student s:student){
			%>
			<tr>
				<td>
				<%=s.getUnumber() %>
				</td>
				<td>
				<%=s.getSex() %>
				</td>
				<td>
				<%=s.getName() %>
				</td>
			</tr>
			<%
			}
			%>
		</table>
		
	
	<a href="controllerServlet?action=home">
	<input type="button" value="Back">
	</a>
	</form>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>