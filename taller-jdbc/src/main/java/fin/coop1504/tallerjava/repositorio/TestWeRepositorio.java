/**
 * 
 */
package fin.coop1504.tallerjava.repositorio;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import fin.coop1504.tallerjava.configuracion.SingletonConexion;

/**
 * @author wemacias
 *
 */
public class TestWeRepositorio {

	public Integer registrar(Integer dato1, String dato2) throws SQLException {
		PreparedStatement sentencia = SingletonConexion.getConexion()
				.prepareStatement("INSERT INTO AS_PRG.TEST_WEMACIAS" + "(CLAVE, VALOR)" + "VALUES(?, ?)");
		sentencia.setInt(1, dato1);
		sentencia.setString(2, dato2);
		return sentencia.executeUpdate();
	}

	public ResultSet consultar() throws SQLException {
		PreparedStatement sentencia = SingletonConexion.getConexion().prepareStatement("SELECT * FROM TEST_WEMACIAS");
		return sentencia.executeQuery();
	}

	public HashMap<Integer, String> consultarPorClave(Integer dato) throws SQLException {
		PreparedStatement sentencia = SingletonConexion.getConexion()
				.prepareStatement("SELECT * FROM TEST_WEMACIAS WHERE CLAVE = ?");
		sentencia.setInt(1, dato);
		HashMap<Integer, String> resultado = new HashMap<Integer, String>();
		ResultSet cursor = sentencia.executeQuery();
		while (cursor.next()) {
			resultado.put(cursor.getInt(1), cursor.getString(2));

		}

		return resultado;
	}

	public Integer invocacionProcedure(Integer num1, Integer num2) throws SQLException {
		CallableStatement sentencia = SingletonConexion.getConexion().prepareCall("{ call as_prg.Test_Suma(?,?,?) }");
		sentencia.setInt(1, num1);
		sentencia.setInt(2, num2);

		sentencia.registerOutParameter(3, java.sql.Types.NUMERIC);
		sentencia.execute();
		return sentencia.getInt(3);
	}
}
