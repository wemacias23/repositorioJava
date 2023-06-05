/**
 * 
 */
package fin.coop1504.tallerjava;

import fin.coop1504.tallerjava.excepciones.ExcepcionValidacion;
import fin.coop1504.tallerjava.servicios.ServicioLogicaNegocio;

/**
 * @author wemacias
 *
 */
public class AplicacionServicioBaseDatos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer resultadoSuma = 0;
		try {
			//ServicioLogicaNegocio.registrarDatos(9, "WeFa");
			resultadoSuma = ServicioLogicaNegocio.sumarDatos(6, 6);
			System.out.println(resultadoSuma);
		} catch (ExcepcionValidacion e) {
			// TODO: handle exception
			e.getStackTrace();
			System.out.println("*************");
			System.out.println(e.getMensajeTecnico());
			System.out.println("*************");
		}
//
//		try {
//			ServicioLogicaNegocio.registrarDatos(7, "MACIAS");
//		} catch (ExcepcionValidacion e) {
//			// TODO: handle exception
//			e.getStackTrace();
//			System.out.println("*************");
//			System.out.println(e.getMensajeTecnico());
//			System.out.println("*************");
//		}
	}

}
