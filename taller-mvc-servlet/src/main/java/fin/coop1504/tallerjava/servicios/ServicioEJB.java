/**
 * 
 */
package fin.coop1504.tallerjava.servicios;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless // no manejan estados y es para metodo
//@Stateful Guardan informacion y manejan estados
//Ejecutan tarea especifica, calendarizadas por fechas

@LocalBean
public class ServicioEJB {

	public String medodoPrueba(String dato) {
		return "EJB" + dato;
	}
}
