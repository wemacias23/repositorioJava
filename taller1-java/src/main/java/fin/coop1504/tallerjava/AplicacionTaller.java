/**
 * 
 */
package fin.coop1504.tallerjava;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

import fin.coop1504.tallerjava.entidades.DocumentoSRI;
import fin.coop1504.tallerjava.entidades.Persona;
import fin.coop1504.tallerjava.entidades.PersonaJuridica;
import fin.coop1504.tallerjava.entidades.PersonaNatural;
import fin.coop1504.tallerjava.interfaces.ConsultarDatos;
import fin.coop1504.tallerjava.servicios.ServiciosPersonas;

/**
 * @author wemacias
 *
 */
public class AplicacionTaller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiciosPersonas.registrarDatos("Wellington", "13126555");
		DocumentoSRI ruc = new DocumentoSRI();
		ruc.setActividadEconomica("Desarrollo de software");
		ruc.setEstado("A");
		ruc.setFechaExpedicion(new Date());
		// -------------------------------------------------------
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());
		cal.add(GregorianCalendar.YEAR, 1);
		// -------------------------------------------------------
		ruc.setFechaExpiracion(cal.getTime());

		// ServiciosPersonas.registraDatosJuridica("Wellingotn", "131265556001");
		// ServiciosPersonas.registraDatosJuridica(persona, ruc);
		ServiciosPersonas.registraDatosJuridica(new Persona("Wellington", "13126555555"), ruc);

		System.out.println("--------------");
		HashMap<String, Object> parametros = new HashMap<String, Object>();
		parametros.put(ServiciosPersonas.PERSONA_JURIDICA, new Persona("Karen", "123456"));
		parametros.put(ServiciosPersonas.DOCUMENTO2, ruc);

		ServiciosPersonas.registraDatosJuridicos(parametros);

		System.out.println("--------------");
		ConsultarDatos personaGeneral = new PersonaNatural("Nom Inter N", "456", "CED");
		// System.out.println(personaGeneral.consulta("4545"));
		consultar(personaGeneral, "456");
		personaGeneral = new PersonaJuridica("Nom Inter J", "5454", ruc);
		// System.out.println(personaGeneral.consulta("4545"));
		consultar(personaGeneral, "456");
	}

	public static void consultar(ConsultarDatos consulta, String dato) {
		System.out.println(consulta.consulta(dato));

	}
}
