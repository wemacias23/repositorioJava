package fin.coop1504.tallerjava.repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fin.coop1504.tallerjava.configuracion.SingletonConexion;
import fin.coop1504.tallerjava.datos.Usuario;

public class RepositorioUsuario {
	public Usuario consultar(String usuario) throws SQLException {

		PreparedStatement consula = SingletonConexion.getConexion()
				.prepareStatement("select * from tab_usuarios where upper(usuario) = ?");
		consula.setString(1, usuario);

		ResultSet cursor = consula.executeQuery();
		Usuario resultado = null;
		while (cursor.next()) {
			resultado = new Usuario();
			resultado.setEstado(usuario);
			resultado.setFechaCreacion(null);
			resultado.setNombre(usuario);
			resultado.setUsuario(usuario);
		}
		
		return resultado;

	}
}
