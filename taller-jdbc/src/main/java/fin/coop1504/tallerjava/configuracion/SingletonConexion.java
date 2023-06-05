/**
 * 
 */
package fin.coop1504.tallerjava.configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author wemacias
 *
 */
public final class SingletonConexion {

	private static Connection conexion = null;

	public static Connection getConexion() throws SQLException {
		System.out.println("Solicitud de conexion");
		if (conexion == null || conexion.isClosed()) {
			crearConexion();
			System.out.println("Creacion de conexion nueva");
		}
		return conexion;
	}

	private static void crearConexion() throws SQLException {
		conexion = DriverManager.getConnection("jdbc:oracle:thin:@200.100.1.10:1989:desanodo", "as_prg", "asi_e");
	}

	private static void cerrarConexion() throws SQLException {
		System.out.println("Cerrando la conexion");
		conexion.close();
	}

	public static void commit() throws SQLException {
		System.out.println("Confirmando la transaccion");
		conexion.commit();
	}

	public static void rollback() throws SQLException {
		System.out.println("Cancelando transaccion");
		conexion.rollback();
	}
}
