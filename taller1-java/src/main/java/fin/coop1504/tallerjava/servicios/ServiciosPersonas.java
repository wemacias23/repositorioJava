/**
 * 
 */
package fin.coop1504.tallerjava.servicios;

import java.util.HashMap;

import fin.coop1504.tallerjava.entidades.DocumentoSRI;
import fin.coop1504.tallerjava.entidades.Persona;
import fin.coop1504.tallerjava.entidades.PersonaJuridica;
import fin.coop1504.tallerjava.entidades.PersonaNatural;

//import fin.coop1504.tallerjava.entidades.Persona;
/**
 * @author wemacias
 *
 */
public class ServiciosPersonas {
	public static final String DOCUMENTO2 = "Documento";
	public static final String PERSONA_JURIDICA = "PersonaJuridica";

	public static String registrarDatos(String nombre, String identificacion) {

		Persona persona = new Persona();
		Persona persona2 = new Persona(nombre, identificacion);
		PersonaNatural personaNatural = new PersonaNatural(nombre, identificacion, "CED");
		// persona2.imprimir();
		System.out.println(persona2);
		System.out.println(personaNatural);
		return "ok";
	}

	public static String registraDatosJuridica(String nombre, String identificacion, DocumentoSRI documento) {
		PersonaJuridica personaJuridica = new PersonaJuridica(nombre, identificacion, documento);

		// PersonaJuridica personaJ = new PersonaJuridica(String nombre, , docSRI);
		return "cosito";
	}

	public static String registraDatosJuridica(Persona persona, DocumentoSRI documento) {
		PersonaJuridica personaJuridica = new PersonaJuridica(persona.getNombre(), persona.getIdentificacion(),
				documento);
		// PersonaJuridica personaJ = new PersonaJuridica(String nombre, , docSRI);
		System.out.println(personaJuridica);
		return "cosito";
	}

	public static String registraDatosJuridicos(HashMap<String, Object> parametros) {
		Persona persona = (Persona)parametros.get(PERSONA_JURIDICA);
		DocumentoSRI documento = (DocumentoSRI)parametros.get(DOCUMENTO2);
		PersonaJuridica personaJuridica = new PersonaJuridica(persona.getNombre(), persona.getIdentificacion(),
				documento);
		System.out.println(personaJuridica);
		return "ok";

	}
}
