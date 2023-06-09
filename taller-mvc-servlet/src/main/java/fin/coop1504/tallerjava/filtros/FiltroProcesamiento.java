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

/**
 * Servlet Filter implementation class FiltroProcesamiento
 */
@WebFilter(dispatcherTypes = { DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE,
		DispatcherType.ERROR }, urlPatterns = { "/login.do" })
public class FiltroProcesamiento implements Filter {

	public FiltroProcesamiento() {
		System.out.println("Construir Filtro");
	}

	public void destroy() {
		System.out.println("Destruir Filtro");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Pre proceso de la solicitud");
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Inicializando Filtro");
	}

}
