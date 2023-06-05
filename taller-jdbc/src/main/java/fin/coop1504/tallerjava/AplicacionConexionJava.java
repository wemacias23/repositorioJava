/**
 * 
 */
package fin.coop1504.tallerjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author wemacias
 *
 */
public class AplicacionConexionJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conexion = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection("jdbc:oracle:thin:@200.100.1.10:1989:desanodo", "as_prg", "asi_e");
			System.out.println("La conexion fue exitosa");
			//CONTROLA EL COMMIT Y ROLLBACK A LA BASE DE DATOS
			conexion.setAutoCommit(false);
			
			ResultSet cursor = null;
			Statement sentenciaDML = conexion.createStatement();
			// cursor = sentenciaDML.executeQuery("SELECT CODIGO_EMPRESA, NOMBRE FROM
			// MG_EMPRESAS");
			cursor = sentenciaDML.executeQuery("SELECT * FROM TEST_WEMACIAS");
            //CONSULTANDO
			while (cursor.next()) {
				System.out.println("Dato: " + cursor.getString(1));
				System.out.println("Valor: " + cursor.getString(2));
			}
			System.out.println("Consultando Registros");
			
			//INSERTANDO
//			PreparedStatement sentenciaParametrizable = null;
//			String sql = "INSERT INTO TEST_WEMACIAS (clave,valor) VALUES (?,?)";
//			ps = conexion.prepareStatement(sql);
//			ps.setInt(1, 2);
//			ps.setString(2, "DOS");
//			ps.executeUpdate();
			PreparedStatement sentenciaParametrizable = conexion.prepareStatement("INSERT INTO AS_PRG.TEST_WEMACIAS"+

					"(CLAVE, VALOR)"+
					"VALUES(?, ?)");
			sentenciaParametrizable.setInt(1, 5);
			sentenciaParametrizable.setString(2, "EL");
			Integer resultado = sentenciaParametrizable.executeUpdate();
			
			System.out.println("Insertando Registros " + resultado);
			//conexion.commit();
			//conexion.rollback();

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (conexion != null)
				conexion.close();
		}

	}

}
