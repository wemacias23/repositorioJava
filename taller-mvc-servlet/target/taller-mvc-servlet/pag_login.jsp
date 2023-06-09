<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<h1>Login Aplicacion Taller</h1>
		<hr style="size: 10px">
	</div>
	<div align="center">
		<form id="form-1" action="/taller-mvc-servlet/login.do" method="post">

			<table id="login">
				<tr>
					<td>Usuario:</td>
					<td><input id="usuario" name="usuario" placeholder="Usuario" type="text" /></td>
				</tr>
				<tr>
					<td>Clave:</td>
					<td><input id="clave" name="clave" placeholder="Clave" type="password" /></td>
				</tr>
				</tbody>
				<tfoot>
					<tr>
						<th><input type="submit" value="Login" /></th>
					</tr>
				</tfoot>
			</table>
		</form>
	</div>



</body>
</html>