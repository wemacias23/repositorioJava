package fin.coop1504.tallerjava.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fin.coop1504.tallerjava.servicios.ServicioLogin;

@WebServlet("/login.do")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletLogin() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		usuario = usuario == null ? "" : usuario;
		clave = clave == null ? "" : clave;

		String resultado = ServicioLogin.login(usuario, clave);

		if (resultado.equals("ok")) {
			request.setAttribute("usuario", usuario);
			request.getRequestDispatcher("/privadas/principal.jsp").forward(request, response);
			//response.sendRedirect("/talle-mvc-servlet/privadas/principal.jsp");
		} else {
			response.sendRedirect("/taller-mvc-servlet/publicas/error.jsp");
			
		}
	}

}
