<%@page import="java.awt.Font"%>
<%@page import="fin.coop1504.tallerjava.datos.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
//Usuario usuario = (Usuario) request.getAttribute("usuarioDB");
Usuario usuario = (Usuario) request.getSession().getAttribute("usuarioDB");
//String nombreUsuario = (String) request.getAttribute("usuario");

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
			<font style="font-family: Arial; font-size: 8vh">Bienvenido <%=usuario.getNombre()%></font>
			<hr>
			<%
			String [] datos = {"UNO","DOS","TRES"};
			for(String elementos : datos){%>
			<font>
				<%= elementos %>
			</font><br>
			<%}%>
		</div>
		<div align="center">
			<input type="submit" value="Regresar" id="button-1" />
		</div>
	</form>

</body>
</html>