/**
 * 
 */
package fin.coop1504.tallerjava.servicios;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author wemacias
 *
 */
@WebService(portName = "serviciosaludo")
public class ServicioWebSaludo {

	@WebMethod(operationName = "Saludar")
	public String saludo(@WebParam(name = "nombre")String  nombre) {
		return "Hola " + nombre;
	}
	@WebMethod(operationName = "Despedir")
	public String despedida(String nombre) {
		return "Adios " + nombre;
	}
}
