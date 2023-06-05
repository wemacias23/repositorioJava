/**
 * 
 */
package fin.coop1504.tallerjava.servicios;

import java.sql.SQLException;

import fin.coop1504.tallerjava.configuracion.Enumerados;
import fin.coop1504.tallerjava.configuracion.SingletonConexion;
import fin.coop1504.tallerjava.excepciones.ExcepcionValidacion;
import fin.coop1504.tallerjava.repositorio.TestWeRepositorio;

/**
 * @author wemacias
 *
 */
public class ServicioLogicaNegocio {
	private static TestWeRepositorio repo = new TestWeRepositorio();

	public static String registrarDatos(Integer dato1, String dato2) throws ExcepcionValidacion {

		// -- validar datos
		if (dato1 == null || dato1 == 0) {
			// return "Debe registrar dato 1";
			throw new ExcepcionValidacion(Enumerados.COD_ERROR_DATOS, Enumerados.COD_ERROR_DATOS);
		}
		if (dato2 == null || dato2.isEmpty()) {
			throw new ExcepcionValidacion(Enumerados.COD_ERROR_DATOS, Enumerados.COD_ERROR_DATOS);
		}
		try {
			repo.registrar(dato1, dato2);
			SingletonConexion.commit();
		} catch (SQLException e) {
			// TODO: handle exception
			e.getStackTrace();
			// return "Imposible realizar la transaccion";
			throw new ExcepcionValidacion(Enumerados.COD_ERROR_TRX, Enumerados.MEN_ERROR_TRX);
		}
		return Enumerados.MEN_EXITO_TRX;

	}

	public static Integer sumarDatos(Integer dato1, Integer dato2) throws ExcepcionValidacion {
		Integer resultado = 0;
		if (dato1 == null) {
			// return "Debe registrar dato 1";
			throw new ExcepcionValidacion(Enumerados.COD_ERROR_DATOS, Enumerados.COD_ERROR_DATOS + " - dato1");
		}
		if (dato2 == null) {
			throw new ExcepcionValidacion(Enumerados.COD_ERROR_DATOS, Enumerados.COD_ERROR_DATOS + " - dato1");
		}
		try {
			resultado = repo.invocacionProcedure(dato1, dato2);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new ExcepcionValidacion(Enumerados.COD_ERROR_TRX, Enumerados.MEN_ERROR_TRX);
		}

		return resultado;
	}
}
