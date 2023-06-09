package fin.coop1504.tallerjava.servicios;

import java.sql.SQLException;

import fin.coop1504.tallerjava.datos.Usuario;
import fin.coop1504.tallerjava.excepciones.ExcepcionValidacion;
import fin.coop1504.tallerjava.repositorios.RepositorioUsuario;

public class ServicioLogin {

	private static RepositorioUsuario repositorioUsuario = new RepositorioUsuario();

	public static Usuario login(String usuario, String clave) throws ExcepcionValidacion {

		usuario = usuario == null ? "" : usuario;
		if (usuario.isEmpty())
			throw new ExcepcionValidacion("001", "Credenciales Invalidas");

		clave = clave == null ? "" : clave;
		if (clave.isEmpty())
			throw new ExcepcionValidacion("002", "Credenciales Invalidas");

		try {
			Usuario usuarioDB = repositorioUsuario.consultar(usuario);
			if (usuarioDB == null)
				throw new ExcepcionValidacion("004", "Credenciales invalidas");

			if (!usuarioDB.getClave().equals(clave))
				throw new ExcepcionValidacion("005", "Credenciales invalidas");

			if (!usuarioDB.getEstado().equals("B"))
				throw new ExcepcionValidacion("006", "Usuario Bloqueado");

			return usuarioDB;

		} catch (SQLException e) {
			e.printStackTrace();
			throw new ExcepcionValidacion("003", "Error al consultar el Usuario");
		}

	}

}
