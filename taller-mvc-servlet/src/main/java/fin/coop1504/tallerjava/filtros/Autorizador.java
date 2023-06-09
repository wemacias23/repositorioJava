package fin.coop1504.tallerjava.filtros;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import fin.coop1504.tallerjava.datos.Usuario;

/**
 * Servlet Filter implementation class Autorizador
 */
@WebFilter(dispatcherTypes = { DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE,
		DispatcherType.ERROR }, urlPatterns = { "/privadas/*" })
public class Autorizador implements Filter {

	public Autorizador() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest lRequest = (HttpServletRequest) request;

		Usuario usuario = (Usuario) lRequest.getSession().getAttribute("usuarioDB");
		if (usuario == null) {
			lRequest.setAttribute("codigo", "000");
			lRequest.setAttribute("mensaje", "No se encuentra en Sesion");
			lRequest.getRequestDispatcher("/publicas/error.jsp").forward(lRequest, response);
		} else {
			chain.doFilter(request, response);
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
