package fin.coop1504.tallerjava.repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fin.coop1504.tallerjava.configuracion.SingletonConexion;
import fin.coop1504.tallerjava.datos.Usuario;

public class RepositorioUsuario {
	public Usuario consultar(String usuario) throws SQLException {

		PreparedStatement consula = SingletonConexion.getConexion()
				.prepareStatement("select * from tab_usuarios_we where upper(usuario) = ?");
		consula.setString(1, usuario.toUpperCase());

		ResultSet cursor = consula.executeQuery();
		Usuario resultado = null;
		while (cursor.next()) {
			resultado = new Usuario();
			resultado.setEstado(cursor.getString("ESTADO"));
			resultado.setFechaCreacion(cursor.getDate("FECHACREACION"));
			resultado.setNombre(cursor.getString("NOMBRE"));
			resultado.setUsuario(cursor.getString("USUARIO"));
			resultado.setClave(cursor.getString("CLAVE"));
		}
		
		return resultado;

	}
}
