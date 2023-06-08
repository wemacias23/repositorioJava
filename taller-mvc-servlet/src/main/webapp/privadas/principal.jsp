<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%

String nombreUsuario = (String) request.getAttribute("usuario");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina Principal</title>
</head>
<body>

	<font color="green">Hola Padre WeWe, Soy la Pagina Principal</font>


	<form id="form-1" action="/taller-mvc-servlet" method="get">
		<div align="center">
			<font style="font-family:Arial; font-size: 8vh">Bienvenido <%=nombreUsuario%></font>
		</div>
		<div align="center">
			<input type="submit" value="Regresar" id="button-1" />
		</div>
	</form>



</body>
</html>