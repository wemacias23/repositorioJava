package fin.coop1504.tallerjava.servicios;

public class ServicioLogin {
	
	public static String login(String usuario, String clave) {
		
		if (usuario.toUpperCase().equals("ADMIN")) {
			return "ok";
		} else
			return "error";
	}
	
}
